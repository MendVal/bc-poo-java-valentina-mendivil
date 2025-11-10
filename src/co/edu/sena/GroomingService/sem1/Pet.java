package co.edu.sena.GroomingService.sem1;

/**
 * Clase secundaria que modela una Mascota (Pet) dentro del sistema de peluquería canina.
 * Contiene atributos básicos, comportamiento y validaciones simples.
 */
public class Pet {

    // Atributos (propiedades de la mascota)
    private String name;                 // Nombre de la mascota
    private String breed;                // Raza
    private String ownerName;            // Nombre del dueño
    private int ageYears;                // Edad en años
    private boolean requiresSpecialCare; // Indica si necesita cuidado especial

    // Constructor (inicializa los atributos)
    public Pet(String name, String breed, String ownerName, int ageYears) {
        this.name = name;
        this.breed = breed;
        this.ownerName = ownerName;
        this.ageYears = ageYears;
        this.requiresSpecialCare = false; // Por defecto, no requiere cuidado especial
    }

    // Getter (permite acceder al nombre desde otras clases)
    public String getName() {
        return name;
    }

    // Método 1: muestra toda la información de la mascota
    public void showInfo() {
        System.out.println("--- DATOS MASCOTA ---");
        System.out.println("Nombre: " + name);
        System.out.println("Raza: " + breed);
        System.out.println("Edad: " + ageYears + " años");
        System.out.println("Propietario: " + ownerName);
        System.out.println("Cuidado Especial: " + (requiresSpecialCare ? "SÍ" : "NO"));
        System.out.println("---------------------------");
    }

    // Método 2: marca si la mascota necesita cuidados especiales
    public void markSpecialCare(boolean needsCare) {
        this.requiresSpecialCare = needsCare;
        if (needsCare) {
            System.out.println("[LOG] " + name + " marcado/a para cuidado especial.");
        }
    }

    // Método 3: determina si la mascota es mayor (7 años o más)
    public boolean isOldPet() {
        return ageYears >= 7;
    }
}// Fin de la clase Pet

/*
Clase Secundaria Pet (Mascota):
Representa a los animales que son atendidos en el negocio.
Contiene atributos como nombre, raza, edad y métodos para gestionar
su información y cuidado especial.
*/
