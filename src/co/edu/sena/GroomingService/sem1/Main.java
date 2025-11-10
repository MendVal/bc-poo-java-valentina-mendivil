package co.edu.sena.GroomingService.sem1;

/**
 * Clase principal del sistema de gestión de peluquería canina.
 * Crea objetos de Pet y GroomingService, demostrando su uso y comportamiento.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTIÓN DE PELUQUERÍA CANINA MASCOTAS ELEGANTES ===\n");

        //  1. CREACIÓN DE OBJETOS (5 de cada clase)
        Pet p1 = new Pet("Lana", "Poodle", "Valentina M.", 3);
        Pet p2 = new Pet("Princesa", "Pastor Alemán", "Javier R.", 8);
        Pet p3 = new Pet("Mora", "Golden Retriever", "Carlos P.", 5);
        Pet p4 = new Pet("Leo", "Pastor Alemán", "Sofía L.", 2);
        Pet p5 = new Pet("Ari", "Beagle", "Laura M.", 1);

        GroomingService g1 = new GroomingService("GROOM-001", p1.getName(), "Baño y Corte", 45000.0, 90);
        GroomingService g2 = new GroomingService("GROOM-002", p2.getName(), "Deslanado Especial", 80000.0, 120);
        GroomingService g3 = new GroomingService("GROOM-003", p3.getName(), "Spa Relajante", 65000.0, 150);
        GroomingService g4 = new GroomingService("GROOM-004", p4.getName(), "Cepillado y Uñas", 30000.0, 60);
        GroomingService g5 = new GroomingService("GROOM-005", p5.getName(), "Baño Rápido", 35000.0, 75);

        //  2. LLAMADA A MÉTODOS DE LA CLASE Pet
        System.out.println("--- MASCOTAS REGISTRADAS ---\n");
        p1.showInfo();
        p2.showInfo();
        p3.showInfo();
        p4.showInfo();
        p5.showInfo();

        // Marcar cuidados especiales
        p2.markSpecialCare(true);
        p4.markSpecialCare(true);
        p5.markSpecialCare(false);

        // Verificar edad avanzada
        System.out.println("\n¿Princesa es una mascota mayor? " + p2.isOldPet());
        System.out.println("¿Ari es una mascota mayor? " + p5.isOldPet());

        System.out.println("\n----------------------------------------\n");

        // 3. LLAMADA A MÉTODOS DE LA CLASE GroomingService
        System.out.println("--- SERVICIOS REGISTRADOS ---\n");
        g1.showInfo();
        g2.showInfo();
        g3.showInfo();
        g4.showInfo();
        g5.showInfo();

        // Calcular costos finales
        double costoG5 = g5.calculateFinalCost();
        System.out.printf("[CÁLCULO] Costo final de %s: $%.2f%n", g5.getServiceCode(), costoG5);

        // Actualizar estado de pago
        g1.setIsPaid(true);
        g3.setIsPaid(true);
        g5.setIsPaid(true);

        // Mostrar estados finales
        System.out.println("\n--- ESTADOS FINALES ---");
        g1.showInfo();
        g3.showInfo();
        g5.showInfo();

        System.out.println("\n=== DEMOSTRACIÓN COMPLETA FINALIZADA ===");
    }
}//Fin de la clase Main

/*
Esta clase (Main) actúa como el punto de entrada del sistema.
Se encarga de crear las instancias de Pet y GroomingService, y de demostrar
la llamada a todos los métodos para simular el flujo del negocio de peluquería canina.
*/
