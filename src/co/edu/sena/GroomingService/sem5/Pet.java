package co.edu.sena.GroomingService.sem5;

import java.util.Objects;

/**
 * Clase Padre Abstracta Pet.
 * SEMANA 05: Implementa la Abstracción y define los contratos polimórficos
 * obligatorios (calculateServiceFee y speak) para sus clases hijas (Dog y Cat).
 * Utiliza @Override toString() para la representación de objetos.
 */
public abstract class Pet {

    // Atributos privados
    private String name;
    private String breed;
    private String ownerName;
    private int ageYears;
    private boolean requiresSpecialCare;

    // Atributo visible a clases hijas
    protected String petType;

    // Constructor
    public Pet(String name, String breed, String ownerName, int ageYears) {
        this.name = name;
        this.breed = breed;
        this.ownerName = ownerName;
        this.ageYears = ageYears;
        this.requiresSpecialCare = false;
    }

    // MÉTODOS ABSTRACTOS (Contratos Polimórficos)

    /**
     * Polimorfismo 1: Define la tasa de servicio base.
     * Cada subclase debe implementarla con su propia lógica de tarifa.
     */
    public abstract double calculateServiceFee();

    /**
     * Polimorfismo 2: Define el comportamiento verbal de la mascota.
     * Cada subclase lo implementa de forma única.
     */
    public abstract String speak();

    // Método Getter: permite acceder al nombre
    public String getName() {
        return name;
    }

    /**
     * @Override: Implementación canónica para la representación del objeto (Reemplaza showInfo()).
     * @return String con los datos de la mascota.
     */
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
}
/**
 * Fin de la clase Pet (Padre Abstracta).
 */