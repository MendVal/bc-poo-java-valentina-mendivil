package co.edu.sena.GroomingService.sem4;

/**
 * Subclase Cat: Implemento la herencia para mis gatos.
 */
public class Cat extends Pet {

    // Mis propiedades específicas de un gato para gestionar servicios especiales
    private String coatType;
    private boolean requiresSpecialHandling;

    /**
     * Constructor de Cat. Al igual que Dog, uso super() para inicializar la herencia.
     */
    public Cat(String name, String ownerName, int age, String coatType, boolean requiresSpecialHandling) {
        super(name, ownerName, age); // Llama al constructor de mi Superclase Pet
        this.coatType = coatType;
        this.requiresSpecialHandling = requiresSpecialHandling;
    }

    /**
     * Este es el comportamiento único de mis gatos.
     */
    public void purr() {
        System.out.println(getName() + " está ronroneando a gusto.");
    }

    /**
     * Sobrescritura de costo: mi lógica aquí es más compleja porque depende de dos factores.
     * Si tiene pelo largo o requiere manejo especial, añado un recargo al costo base.
     */
    @Override
    public double calculateGroomingCost() {
        double cost = super.calculateGroomingCost(); // Empiezo con el costo base de Pet

        // Aplico mi lógica de negocio específica para gatos
        if (coatType.equalsIgnoreCase("long")) {
            cost += 10.0; // Recargo por pelo largo
        }
        if (requiresSpecialHandling) {
            cost += 5.0; // Recargo por manejo especial
        }
        return cost;
    }

    /**
     * Sobrescritura de toString() para mostrar todos los datos del gato.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Tipo de Pelo: " + coatType + "\n" +
                "Manejo Especial: " + (requiresSpecialHandling ? "Sí" : "No") + "\n" +
                "Costo Peluquería: $" + calculateGroomingCost();
    }
}
/*
 * Fin de la clase Cat.java
 */