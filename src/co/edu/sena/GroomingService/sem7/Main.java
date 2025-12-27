package co.edu.sena.GroomingService.sem7;


import co.edu.sena.GroomingService.sem7.modelo.*;
import co.edu.sena.GroomingService.sem7.servicio.GroomingServiceManager;
import co.edu.sena.GroomingService.sem7.excepciones.*;

/*
 * Clase Main
 * Punto de entrada del sistema Grooming Service - Semana 07.
 * Demuestra el uso de paquetes y manejo de excepciones personalizadas
 * con diferentes casos de prueba.
 */

public class Main {

    public static void main(String[] args) {

        GroomingServiceManager manager = new GroomingServiceManager();

        // ---------- CASO 1 ----------
        System.out.println("--- Caso 1: Cita válida ---");
        try {
            Owner owner = new Owner("Valentina", "3001234567");
            Pet pet = new Pet("Lana", "Poodle", 3, owner);
            GroomingAppointment appointment =
                    new GroomingAppointment(pet, "Baño y corte", "2025-10-01");

            manager.registerAppointment(appointment);

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del caso 1\n");
        }

        // ---------- CASO 2 ----------
        System.out.println("--- Caso 2: Mascota no registrada ---");
        try {
            GroomingAppointment appointment =
                    new GroomingAppointment(null, "Baño", "2025-10-02");

            manager.registerAppointment(appointment);

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del caso 2\n");
        }

        // ---------- CASO 3 ----------
        System.out.println("--- Caso 3: Servicio inválido ---");
        try {
            Owner owner = new Owner("Carlos", "3110000000");
            Pet pet = new Pet("Max", "Golden", 5, owner);
            GroomingAppointment appointment =
                    new GroomingAppointment(pet, "", "2025-10-03");

            manager.registerAppointment(appointment);

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del caso 3\n");
        }

        // ---------- CASO 4 ----------
        System.out.println("--- Caso 4: Fecha no disponible ---");
        try {
            Owner owner = new Owner("Ana", "3221111111");
            Pet pet = new Pet("Rocky", "Bulldog", 4, owner);
            GroomingAppointment appointment =
                    new GroomingAppointment(pet, "Corte de pelo", "");

            manager.registerAppointment(appointment);

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del caso 4\n");
        }

        // ---------- CASO 5 ----------
        System.out.println("--- Caso 5: Cita nula ---");
        try {
            manager.registerAppointment(null);

        } catch (Exception e) {
            System.out.println(" ❌ Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del caso 5\n");
        }

        System.out.println("Proceso finalizado");
    }
}

/* Fin de la clase Main */
