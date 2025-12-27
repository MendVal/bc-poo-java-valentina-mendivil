package co.edu.sena.GroomingService.sem8;

import co.edu.sena.GroomingService.sem8.modelo.*;
import co.edu.sena.GroomingService.sem8.servicio.GroomingServiceManager;
import co.edu.sena.GroomingService.sem8.excepciones.*;


/*
 * Clase Main
 * Demuestra el uso de colecciones, búsquedas, filtrado y estadísticas
 * Semana 08 - Grooming Service
 */
public class Main {

    public static void main(String[] args) {

        GroomingServiceManager manager = new GroomingServiceManager();

        try {
            // ===== DUEÑOS =====
            Owner owner1 = new Owner("Valentina", "3001234567");
            Owner owner2 = new Owner("Carlos", "3119998888");

            // ===== MASCOTAS =====
            Pet pet1 = new Pet("Lana", "Poodle", 3, owner1);
            Pet pet2 = new Pet("Max", "Golden", 5, owner1);
            Pet pet3 = new Pet("Rocky", "Bulldog", 4, owner2);
            Pet pet4 = new Pet("Luna", "Shih Tzu", 2, owner2);

            // ===== REGISTRO DE CITAS =====
            manager.registerAppointment(new GroomingAppointment(
                    "A001", pet1, "Baño", "2025-10-01", 45000));

            manager.registerAppointment(new GroomingAppointment(
                    "A002", pet2, "Corte", "2025-10-02", 60000));

            manager.registerAppointment(new GroomingAppointment(
                    "A003", pet3, "Baño", "2025-10-03", 50000));

            manager.registerAppointment(new GroomingAppointment(
                    "A004", pet4, "Baño", "2025-10-04", 48000));

            manager.registerAppointment(new GroomingAppointment(
                    "A005", pet1, "Corte", "2025-10-05", 65000));

            // ===== BÚSQUEDA POR CÓDIGO (HashMap) =====
            System.out.println("\nBúsqueda por código A003:");
            System.out.println(manager.findByCode("A003"));

            // ===== ESTADÍSTICAS =====
            System.out.println("\nTotal de citas registradas: "
                    + manager.totalAppointments());

            System.out.println("Ingresos totales: $"
                    + manager.calculateTotalIncome());

            System.out.println("Precio promedio: $"
                    + manager.calculateAveragePrice());

            // ===== FILTRADO =====
            System.out.println("\nCitas de tipo 'Baño':");
            for (GroomingAppointment a : manager.filterByService("Baño")) {
                System.out.println(" - Mascota: "
                        + a.getPet().getName()
                        + " | Precio: $" + a.getPrice());
            }

        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());

        } finally {
            System.out.println("\nProceso finalizado - Semana 08");
        }
    }
}
/* Fin de la clase Main */
