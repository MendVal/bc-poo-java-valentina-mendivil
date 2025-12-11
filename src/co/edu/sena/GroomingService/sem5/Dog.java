package co.edu.sena.GroomingService.sem5;

/**
 * Clase Dog, subclase de Pet.
 * SEMANA 05: Implementa la Herencia y Sobrescritura (@Override)
 * de los métodos abstractos definidos en Pet, con lógica específica para perros.
 */
public class Dog extends Pet {

    private boolean isHypoallergenic; // Atributo único

    // Constructor
    public Dog(String name, String breed, String ownerName, int ageYears, boolean isHypoallergenic) {
        super(name, breed, ownerName, ageYears);
        this.isHypoallergenic = isHypoallergenic;
        this.petType = "Perro";
    }

    // MÉTODO SOBRESCRITO 1: Tarifa (Polimorfismo de Regla de Negocio)
    @Override
    public double calculateServiceFee() {
        return 1.10; // Tasa de servicio estándar del 10%
    }

    // MÉTODO SOBRESCRITO 2: Comportamiento (Polimorfismo de Comportamiento)
    @Override
    public String speak() {
        return this.getName() + " (Perro) dice: ¡Guau, guau! ¿Es hipoalergénico?: " + isHypoallergenic;
    }
}
/*
 * Fin de la clase Dog.
 */