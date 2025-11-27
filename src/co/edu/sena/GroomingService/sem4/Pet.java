package co.edu.sena.GroomingService.sem4;

/**
 * Superclase Pet: Defino las propiedades básicas que todas mis mascotas van a compartir.
 * Decidí mantener los atributos como 'private' para seguir con el principio de Encapsulación
 * que implementé en las semanas anteriores.
 */
public class Pet {

    // Atributos base, privados para proteger mis datos y controlar el acceso
    private String name;
    private String ownerName;
    private int age;

    /**
     * Constructor principal de mi Superclase. Es importante que las clases hijas
     * (Dog, Cat) me llamen usando super() para inicializar correctamente esta parte del objeto.
     */
    public Pet(String name, String ownerName, int age) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
    }

    // Mis getters me permiten acceder a los datos privados de forma controlada
    public String getName() { return name; }
    public String getOwnerName() { return ownerName; }
    public int getAge() { return age; }

    /**
     * Este es el método base para el cálculo del costo. Mi idea es que si una mascota
     * no es un Dog o un Cat, simplemente use el costo estándar de $20.0.
     * Este método será sobrescrito en las subclases (Polimorfismo).
     */
    public double calculateGroomingCost() {
        return 20.0; // Costo base estándar
    }

    /**
     * Sobrescribo el método estándar toString() para que al imprimir el objeto,
     * se muestre toda la información básica de la mascota de forma ordenada.
     */
    @Override
    public String toString() {
        return "--- Pet Information ---\n" +
                "Name: " + name + "\n" +
                "Owner: " + ownerName + "\n" +
                "Age: " + age + " years\n";
    }
}
/*
 * Fin de la clase Pet.java
 */