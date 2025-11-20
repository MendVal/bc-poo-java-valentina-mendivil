package co.edu.sena.GroomingService.sem3;

public class Pet {
    /*
     * Clase: Pet.java
     * Dominio: Sistema de Gestión de Peluquería Canina Mascotas Elegantes
     * Semana 3: Implementación de Encapsulación y Sobrecarga de Constructores
     */

    // Atributos privados (Encapsulación completa)
    private String name;
    private String breed;
    private String ownerName;
    private int ageYears;
    private boolean requiresSpecialCare;

    // CONSTRUCTOR 1: Mínimo (Sobrecargado)
    public Pet(String name, String breed) {
        // Llama al constructor completo usando valores predeterminados
        this(name, breed, "Desconocido", 0);
    }

    // CONSTRUCTOR 2: Completo
    public Pet(String name, String breed, String ownerName, int ageYears) {
        // Las validaciones se llaman a través de los setters
        setName(name);
        setBreed(breed);
        this.ownerName = ownerName;
        setAgeYears(ageYears); // El setter valida la edad
        this.requiresSpecialCare = false;
    }

    // ================== GETTERS Y SETTERS CON VALIDACIÓN ==================

    // Setter con VALIDACIÓN: Nombre no puede estar vacío.
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la mascota no puede estar vacío.");
        }
        this.name = name;
    }

    // Setter con VALIDACIÓN: La edad debe ser positiva.
    public void setAgeYears(int ageYears) {
        if (ageYears < 0) {
            throw new IllegalArgumentException("La edad debe ser un número positivo.");
        }
        this.ageYears = ageYears;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public void setBreed(String breed) {
        if (breed == null || breed.trim().isEmpty()) {
            throw new IllegalArgumentException("La raza no puede estar vacía.");
        }
        this.breed = breed;
    }

    public boolean isRequiresSpecialCare() {
        return requiresSpecialCare;
    }

    public void showInfo() {
        System.out.println("--- DATOS MASCOTA ---");
        System.out.println("Nombre: " + name);
        System.out.println("Raza: " + breed);
        System.out.println("Edad: " + ageYears + " años");
        System.out.println("Propietario: " + ownerName);
        System.out.println("---------------------------");
    }
}
/*
 * Fin de la clase Pet.java
 */