package co.edu.sena.GroomingService.sem5;

import java.util.ArrayList;

/**
 * Clase Main.
 * SEMANA 05: Demostración del Polimorfismo, incluyendo:
 * - ArrayList Polimórfico.
 * - Polimorfismo Dinámico (Sobrescritura con speak() y calculateServiceFee()).
 * - Polimorfismo por Sobrecarga (calculateFinalCost()).
 * Utiliza System.out.println(objeto) para invocar el método toString() sobrescrito.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO ===\n");

        // --- 1. CREACIÓN DE OBJETOS HIJOS ---

        // Perro (Dog)
        Dog d1 = new Dog("Lana", "Poodle", "Valentina M.", 3, true);
        Dog d2 = new Dog("Princesa", "Pastor Alemán", "Javier R.", 8, false);

        // Gato (Cat)
        Cat c1 = new Cat("Bigotes", "Siamés", "Carlos P.", 2, "Pelo Corto");
        Cat c2 = new Cat("Mishu", "Maine Coon", "Sofia L.", 6, "Pelo Largo");

        // --- 2. ARRAYLIST POLIMÓRFICO (ArrayList<Pet>) ---

        ArrayList<Pet> mascotasEnEspera = new ArrayList<>();
        mascotasEnEspera.add(d1);
        mascotasEnEspera.add(c1);
        mascotasEnEspera.add(d2);
        mascotasEnEspera.add(c2);

        System.out.println("--- POLIMORFISMO DINÁMICO (speak() y toString()) ---");

        // Demostración de toString() para la representación de objetos
        System.out.println("\n--- Representación de Objetos (toString) ---");
        System.out.println(d1); // Invoca Dog.toString() (heredado de Pet)
        System.out.println(c1); // Invoca Cat.toString() (heredado de Pet)

        // Demostración de Sobrescritura de Comportamiento
        System.out.println("\n--- Comportamiento speak() ---");
        for (Pet p : mascotasEnEspera) {
            // POLIMORFISMO DINÁMICO: Java llama a Dog.speak() o Cat.speak()
            System.out.println("> " + p.speak());
        }
        System.out.println("----------------------------------------");

        // --- 3. PRUEBA DE SOBRESCRITURA Y SERVICIOS (calculateServiceFee()) ---

        // Servicio para un Perro (d1 - usa tasa 1.10)
        GroomingService g_dog = new GroomingService("POLY-D01", d1, "Corte", 50000.0, 90);

        // Servicio para un Gato (c1 - usa tasa 1.15)
        GroomingService g_cat = new GroomingService("POLY-C01", c1, "Baño", 40000.0, 60);

        System.out.println("--- SOBRESCRITURA (Tarifas Polimórficas) ---");
        System.out.printf("Costo final %s (Perro - Tasa 10%%): $%.2f%n", g_dog.getServiceCode(), g_dog.calculateFinalCost());
        System.out.printf("Costo final %s (Gato - Tasa 15%%): $%.2f%n", g_cat.getServiceCode(), g_cat.calculateFinalCost());
        System.out.println("----------------------------------------");

        // --- 4. PRUEBA DE SOBRECARGA (OVERLOADING) ---

        System.out.println("---  SOBRECARGA (calculateFinalCost) ---");

        // 1. Versión base (sin argumentos)
        double costoBase = g_dog.calculateFinalCost();
        System.out.printf("Costo Base de %s: $%.2f%n", g_dog.getServiceCode(), costoBase);

        // 2. Versión con descuento (1 argumento double)
        double costoDescuento = g_dog.calculateFinalCost(0.15); // 15% de descuento
        System.out.printf("Costo con 15%% descuento: $%.2f%n", costoDescuento);

        // 3. Versión con recargo fijo (2 argumentos: String, double)
        double costoRecargo = g_dog.calculateFinalCost("Mascota Ansiosa", 15000.0);
        System.out.printf("Costo con Recargo por Ansiedad: $%.2f%n", costoRecargo);

        System.out.println("\n=== DEMOSTRACIÓN COMPLETA DE POLIMORFISMO FINALIZADA ===");
    }
}
/**
 * Fin de la clase Main.
 */
