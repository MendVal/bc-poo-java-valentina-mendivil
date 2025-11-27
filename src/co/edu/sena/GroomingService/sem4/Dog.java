package co.edu.sena.GroomingService.sem4;

/**
 * Subclase Dog: Represento a mis perros. Mi objetivo es que hereden de Pet
 * para reutilizar la lógica común (nombre, dueño, edad) y añadir características específicas.
 */
public class Dog extends Pet {

    // Mis propiedades específicas de un perro
    private String breed;
    private String favoriteToy;
    private String licenseNumber;

    /**
     * Constructor de Dog. Es esencial que use 'super()' para inicializar la parte 'Pet'
     * del objeto antes de inicializar mis propios atributos.
     */
    public Dog(String name, String ownerName, int age, String breed, String favoriteToy, String licenseNumber) {
        super(name, ownerName, age); // Llamo al constructor de mi padre (Pet)
        this.breed = breed;
        this.favoriteToy = favoriteToy;
        this.licenseNumber = licenseNumber;
    }

    /**
     * Este es un comportamiento único que solo mis perros tienen.
     */
    public void bark() {
        // Uso getName() del padre porque el atributo 'name' es privado en Pet
        System.out.println(getName() + " (" + breed + ") dice: Woof! Woof!");
    }

    /**
     * Sobrescribo el método de costo para aplicar una tarifa específica.
     * Uso Polimorfismo: este es el costo que se ejecutará si el objeto es un Dog.
     */
    @Override
    public double calculateGroomingCost() {
        // Obtengo el costo base de Pet y le añado un recargo fijo para perros
        return super.calculateGroomingCost() + 15.0;
    }

    /**
     * Sobrescritura de toString() para añadir los detalles específicos de un perro.
     */
    @Override
    public String toString() {
        // Concateno la información básica (del padre) con mis propios atributos
        return super.toString() +
                "Raza: " + breed + "\n" +
                "Juguete Favorito: " + favoriteToy + "\n" +
                "Licencia #: " + licenseNumber + "\n" +
                "Costo Peluquería: $" + calculateGroomingCost();
    }
}
/*
 * Fin de la clase Dog.java
 */