package co.edu.sena.GroomingService.sem2;

import co.edu.sena.GroomingService.sem1.GroomingService;
import co.edu.sena.GroomingService.sem1.Pet;

/**
 * Clase Main (Semana 2):
 * Demostración completa del sistema.
 * INTEGRA: Las mascotas creadas en la Semana 1 con los nuevos Dueños (Owner)
 * y el sistema de Paquetes y Gestor (Manager).
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA INTEGRADO DE PELUQUERÍA CANINA MASCOTAS ELEGANTES ===\n");

        // 1. RECUPERANDO LAS MASCOTAS (Datos de la Semana 1)

        Pet p1 = new Pet("Lana", "Poodle", "Valentina M.", 3);
        Pet p2 = new Pet("Princesa", "Pastor Alemán", "Javier R.", 8);
        Pet p3 = new Pet("Mora", "Golden Retriever", "Carlos P.", 5);
        Pet p4 = new Pet("Leo", "Pastor Alemán", "Sofía L.", 2);
        Pet p5 = new Pet("Ari", "Beagle", "Laura M.", 1);

        // 2. CREANDO DUEÑOS (Clase Owner - Semana 2)
        // Vamos a crear dos dueños para distribuir las mascotas
        Owner ownerValentina = new Owner("O-100", "Valentina Mendivil", "3001234567");
        Owner ownerJavier = new Owner("O-101", "Javier Rodriguez", "3109876543");

        // 3. ESTABLECIENDO RELACIONES (Asignar mascotas a dueños)
        // Usamos el método addPet para llenar el ArrayList de cada dueño

        // Asignamos mascotas a Valentina
        ownerValentina.addPet(p1); // Lana
        ownerValentina.addPet(p5); // Ari (Digamos que ahora es de Valentina también)

        // Asignamos mascotas a Javier
        ownerJavier.addPet(p2); // Princesa

        // Mostramos la info para verificar que el ArrayList funciona
        ownerValentina.showOwnerInfo();
        ownerJavier.showOwnerInfo();

        // 4. CREACIÓN DE PAQUETES DE SERVICIOS (Clase ServicePackage - Semana 2)
        System.out.println("\n--- CONFIGURACIÓN DE PAQUETES ---");

        // Creamos servicios individuales para Lana
        GroomingService serv1 = new GroomingService("S001", "Lana", "Baño Premium", 45000, 60);
        GroomingService serv2 = new GroomingService("S002", "Lana", "Corte Uñas", 10000, 15);
        GroomingService serv3 = new GroomingService("S003", "Lana", "Limpieza Oídos", 15000, 20);

        // Agrupamos todo en un paquete
        ServicePackage packLana = new ServicePackage("PACK-VIP", "Paquete Completo Lana");
        packLana.addService(serv1);
        packLana.addService(serv2);
        packLana.addService(serv3);

        packLana.showPackageInfo();

        // 5. GESTIÓN CON EL MANAGER (Clase GroomingManager - Semana 2)
        GroomingManager manager = new GroomingManager("GM-01", "Laura Torres");

        System.out.println("--- EJECUCIÓN DE VENTA ---");
        // El manager registra que Valentina compró el paquete
        manager.assignPackageToOwner(ownerValentina, packLana);

        // Mostramos el reporte final del día
        manager.showDailyReport();

        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}