public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE PELUQUERÍA CANINA ===\n");

        // --- 1. CREACIÓN DE OBJETOS  ---

        // Crear objetos de la Clase Secundaria: Pet (Mascota)
        Pet p1 = new Pet("Lana", "Poodle", "Valentina M.", 3);
        Pet p2 = new Pet("Princesa", "Pastor Alemán", "Javier R.", 8);
        Pet p3 = new Pet("Mora", "Golden Retriever", "Carlos P.", 5);
        Pet p4 = new Pet("Leo", "Pastor aleman", "Sofia L.", 2);
        Pet p5 = new Pet("Ari", "Beagle", "Laura M.", 1); //

        // Crear objetos de la Clase Principal: GroomingService
        GroomingService g1 = new GroomingService("GROOM-001", p1.getName(), "Baño y Corte", 45000.0, 90);
        GroomingService g2 = new GroomingService("GROOM-002", p2.getName(), "Deslanado Especial", 80000.0, 120);
        GroomingService g3 = new GroomingService("GROOM-003", p3.getName(), "Spa Relajante", 65000.0, 150);
        GroomingService g4 = new GroomingService("GROOM-004", p4.getName(), "Cepillado y Uñas", 30000.0, 60);
        GroomingService g5 = new GroomingService("GROOM-005", p5.getName(), "Baño Rápido", 35000.0, 75); //

        // --- 2. LLAMADA A TODOS LOS MÉTODOS DE AMBAS CLASES (DEMOSTRACIÓN) ---

        System.out.println("--- PET ---\n");

        // Llamada a showInfo() de Pet (Muestra las 5 mascotas)
        p1.showInfo();
        p2.showInfo();
        p3.showInfo();
        p4.showInfo();
        p5.showInfo();

        // Llamada a markSpecialCare() de Pet
        p2.markSpecialCare(true); // Bruno requiere cuidado especial
        p4.markSpecialCare(true); // Leo requiere cuidado especial
        p5.markSpecialCare(false); // Rocky no requiere cuidado especial

        // Llamada a isOldPet() de Pet
        System.out.println("\n¿Princesa es una mascota mayor (7+ años)?: " + p2.isOldPet());
        System.out.println("¿Ari es una mascota mayor (7+ años)?: " + p5.isOldPet()); // Prueba con la nueva mascota

        System.out.println("\n----------------------------------------\n");

        System.out.println("--- GROOMING SERVICE ---\n");

        // Llamada a showInfo() de GroomingService (Muestra los 5 servicios)
        g1.showInfo();
        g2.showInfo();
        g3.showInfo();
        g4.showInfo();
        g5.showInfo();

        // Llamada al método que retorna valor calculado calculateFinalCost()
        double costoG5 = g5.calculateFinalCost(); // Prueba con el nuevo servicio
        System.out.printf("[CALCULO] Costo final de %s (incl. tasa): $%.2f%n", g5.getServiceCode(), costoG5);

        // Llamada al método Setter setIsPaid()
        g1.setIsPaid(true); // Servicio G1 pagado
        g3.setIsPaid(true); // Servicio G3 pagado
        g5.setIsPaid(true); // Servicio G5 pagado

        // Llamada al método Getter getServiceCode()
        System.out.println("[GETTER] Código del Servicio 2: " + g2.getServiceCode());

        System.out.println("\n--- ESTADOS FINALES ---");
        g1.showInfo();
        g3.showInfo();
        g5.showInfo(); // Mostrar estado final del nuevo servicio

        System.out.println("\n=== DEMOSTRACIÓN COMPLETA FINALIZADA ===");
    }
}
/*
FIN DE LA CLASE MAIN
Esta clase demuestra el uso completo del sistema de
Peluquería Canina “Mascotas Elegantes”.
*/
