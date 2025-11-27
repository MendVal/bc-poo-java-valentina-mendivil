package co.edu.sena.GroomingService.sem4;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal: Mi objetivo es demostrar cómo funciona la Herencia y el Polimorfismo.
 * Uso una lista de la clase padre (Pet) para manejar objetos de diferentes tipos (Dog y Cat).
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== SEMANA 4: DEMOSTRACIÓN DE HERENCIA Y POLIMORFISMO  EN MASCOTAS ELEGANTES ===");

        // Declaro mi lista polimórfica: puedo almacenar mis Subclases Dog y Cat bajo el tipo de mi Superclase Pet
        List<Pet> elegantPets = new ArrayList<>();

        // 1. Instanciación usando los datos de mis mascotas originales (Semana 1)
        // Uso los constructores de mis Subclases Dog y Cat

        // Perros originales (Dog)
        Dog p1 = new Dog("Lana", "Valentina M.", 3, "Mini Poodle", "Chew Toy", "LANA-01");
        Dog p2 = new Dog("Princesa", "Javier R.", 8, "Pastor Alemán", "Frisbee", "PRI-02");
        Dog p3 = new Dog("Mora", "Carlos P.", 5, "Golden Retriever", "Bone", "MORA-03");

        // Gato para demostrar la segunda rama de la jerarquía (Cat)
        Cat c1 = new Cat("Bigotes", "Camila L.", 6, "long", true);

        // Añado todos mis objetos Dog y Cat a la lista de tipo Pet
        elegantPets.add(p1);
        elegantPets.add(p2);
        elegantPets.add(p3);
        elegantPets.add(c1);

        System.out.println("\n---  PRUEBA DE POLIMORFISMO Y CÁLCULOS ---");

        double totalRevenue = 0;

        // Itero sobre mi lista polimórfica.
        for (Pet currentPet : elegantPets) {

            // Polimorfismo: Llamo al método calculateGroomingCost(), y Java se encarga
            // de ejecutar la versión correcta (de Dog, Cat o Pet).
            double cost = currentPet.calculateGroomingCost();
            totalRevenue += cost;

            // Impresión: Uso println() y el método toString() se llama automáticamente
            System.out.println(currentPet);

            // Verifico la instancia para llamar a métodos que son únicos de cada subclase
            if (currentPet instanceof Dog) {
                ((Dog) currentPet).bark();
            } else if (currentPet instanceof Cat) {
                ((Cat) currentPet).purr();
            }
            System.out.println("---------------------------------");
        }

        System.out.printf("\nINGRESOS TOTALES POR SERVICIOS: $%.2f%n", totalRevenue);
        System.out.println("\n=== DEMOSTRACIÓN SEMANA 4 FINALIZADA ===");
    }
}
/*
 * Fin de la clase Main.java
 */