package co.edu.sena.GroomingService.sem7.modelo;

/*
 * Clase Mascota
 * Representa una mascota que recibe servicios en el Grooming Service.
 * Continúa la lógica trabajada en semanas anteriores.
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
}

/* Fin de la clase Pet */