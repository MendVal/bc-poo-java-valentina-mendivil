// Archivo: semana-06/abstractas/Pet.java
package co.edu.sena.GroomingService.sem6.abstractas;

/**
 * Clase Padre Abstracta Pet. 
 * Define la estructura de datos común (atributos) y los contratos obligatorios
 * (métodos abstractos) que toda mascota debe implementar.
 */
public abstract class Pet {

    // Atributos privados (Encapsulación)
    private String name;
    private String breed;
    private String ownerName;
    private int ageYears;
    private boolean requiresSpecialCare;
    protected String petType; // Visible a clases hijas

    // Constructor
    public Pet(String name, String breed, String ownerName, int ageYears) {
        this.name = name;
        this.breed = breed;
        this.ownerName = ownerName;
        this.ageYears = ageYears;
        this.requiresSpecialCare = false;
    }

    // MÉTODOS ABSTRACTOS (Contratos Polimórficos Obligatorios)
    public abstract double calculateServiceFee();
    public abstract String speak();

    // ================= GETTERS Y SETTERS (Métodos concretos reutilizables) =================

    public String getName() {
        return name;
    }
    public boolean isRequiresSpecialCare() {
        return requiresSpecialCare;
    }
    public void markSpecialCare(boolean needsCare) {
        this.requiresSpecialCare = needsCare;
        if (needsCare) {
            System.out.println("[LOG] " + name + " marcado/a para cuidado especial.");
        }
    }
    public int getAgeYears() {
        return ageYears;
    }

    // IMPLEMENTACIÓN DE toString() (Concreto para todas las hijas)
    @Override
    public String toString() {
        return String.format(
                "--- DATOS MASCOTA (%s) ---\n" +
                        "Nombre: %s\n" +
                        "Raza: %s\n" +
                        "Edad: %d años\n" +
                        "Propietario: %s\n" +
                        "Cuidado Especial: %s\n" +
                        "---------------------------",
                (petType != null ? petType : "Desconocido"),
                name,
                breed,
                ageYears,
                ownerName,
                (requiresSpecialCare ? "SÍ" : "NO")
        );
    }
}
/**
 * Fin de la clase abstracta Pet.
 */