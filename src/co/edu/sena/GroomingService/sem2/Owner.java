package co.edu.sena.GroomingService.sem2;

import co.edu.sena.GroomingService.sem1.Pet;
import java.util.ArrayList;

/**
 * Clase Owner (Dueño):
 * Representa al cliente de la peluquería.
 * RELACIÓN: Un dueño puede tener muchas mascotas, por eso uso un ArrayList de tipo Pet.
 */
public class Owner {

    // Atributos básicos del dueño
    private String ownerId;
    private String name;
    private String phone;

    // Lista para guardar todas las mascotas de este dueño (Relación 1 a muchos)
    private ArrayList<Pet> pets;

    public Owner(String ownerId, String name, String phone) {
        // VALIDACIÓN: Asegurarnos de que el dueño tenga nombre
        if (name == null || name.isEmpty()) {
            System.out.println(">> Advertencia: Nombre vacío. Se asignará 'Desconocido'.");
            this.name = "Desconocido";
        } else {
            this.name = name;
        }
        this.ownerId = ownerId;
        this.phone = phone;

        // Inicializamos la lista vacía para poder agregar mascotas después
        this.pets = new ArrayList<>();
    }

    // Método para asociar una mascota al dueño
    public void addPet(Pet pet) {
        if (pet != null) {
            pets.add(pet); // Agregamos el objeto Pet a la lista
        } else {
            System.out.println("Error: Intentaste agregar una mascota nula.");
        }
    }

    // Muestra los datos del dueño y recorre la lista de sus mascotas
    public void showOwnerInfo() {
        System.out.println("\n=== PERFIL DEL CLIENTE ===");
        System.out.println("ID: " + ownerId);
        System.out.println("Nombre: " + name);
        System.out.println("Contacto: " + phone);

        System.out.println("--- Mascotas Registradas ---");
        if (pets.isEmpty()) {
            System.out.println("(Este dueño aún no tiene mascotas asociadas)");
        } else {
            // Recorremos la lista para mostrar un resumen de cada mascota
            for (Pet p : pets) {
                System.out.println(" -> " + p.getName() + " (" + p.getBreed() + ")");
            }
        }
    }

    // Getter necesario para que el Manager pueda obtener el nombre
    public String getName() {
        return name;
    }
}
/*
 * Fin de la clase Owner.java
 * * Mi trabajo en esta clase fue:
 * 1. Implementar la **relación uno a muchos** usando un **ArrayList<Pet>** para coleccionar las mascotas de este dueño.
 * 2. Crear el método **addPet** para añadir nuevas mascotas a la lista de forma controlada.
 * 3. Usar el método **showOwnerInfo** para recorrer la lista y mostrar los datos de cada mascota asociada.
 * 4. Incluir una validación básica en el constructor para evitar que el nombre del dueño esté vacío.
 */