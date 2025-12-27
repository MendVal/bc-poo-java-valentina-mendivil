package co.edu.sena.GroomingService.sem8.modelo;

/*
 * Representa una mascota del sistema
 */
public class Pet {

    private String name;
    private String breed;
    private int age;
    private Owner owner;

    public Pet(String name, String breed, int age, Owner owner) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }
}
/* Fin de la clase Pet */