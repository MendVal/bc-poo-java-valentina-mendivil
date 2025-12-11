package co.edu.sena.GroomingService.sem5;

/**
 * Clase Cat, subclase de Pet.
 * SEMANA 05: Implementa la Herencia y Sobrescritura (@Override)
 * de los métodos abstractos definidos en Pet, con lógica específica para gatos.
 */
public class Cat extends Pet {

    private String coatType; // Atributo único

    // Constructor
    public Cat(String name, String breed, String ownerName, int ageYears, String coatType) {
        super(name, breed, ownerName, ageYears);
        this.coatType = coatType;
        this.petType = "Gato";
    }

    // MÉTODO SOBRESCRITO 1: Tarifa (Polimorfismo de Regla de Negocio)
    @Override
    public double calculateServiceFee() {
        return 1.15; // Tasa de servicio especial del 15% (por la dificultad de manejo)
    }

    // MÉTODO SOBRESCRITO 2: Comportamiento (Polimorfismo de Comportamiento)
    @Override
    public String speak() {
        return this.getName() + " (Gato) dice: Miau. Tipo de pelaje: " + coatType;
    }
}
/**
 * Fin de la clase Cat.
 */
