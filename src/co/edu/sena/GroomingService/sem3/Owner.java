package co.edu.sena.GroomingService.sem3;

import java.util.ArrayList;

public class Owner {
    /*
     * Archivo: Owner.java
     * Dominio: Sistema de Gestión de Peluquería Canina Mascotas Elegantes
     * Semana 3: Implementación de Encapsulación y Sobrecarga de Constructores
     */

    // Atributos privados
    private String ownerId;
    private String name;
    private String phone;
    private ArrayList<Pet> pets;

    // CONSTRUCTOR 1: Mínimo (Sobrecargado)
    public Owner(String name, String phone) {
        // Llama al constructor completo asignando un ID temporal
        this("ID-PENDIENTE", name, phone);
    }

    // CONSTRUCTOR 2: Completo
    public Owner(String ownerId, String name, String phone) {
        this.ownerId = ownerId;
        // Las validaciones se llaman a través de los setters
        setName(name);
        setPhone(phone);
        this.pets = new ArrayList<>();
    }

    // ================== GETTERS Y SETTERS CON VALIDACIÓN ==================

    // Setter con VALIDACIÓN: Nombre debe ser descriptivo.
    public void setName(String name) {
        if (name == null || name.trim().length() < 3) {
            throw new IllegalArgumentException("El nombre del dueño debe tener al menos 3 caracteres.");
        }
        this.name = name;
    }

    // Setter con VALIDACIÓN: Teléfono mínimo.
    public void setPhone(String phone) {
        if (phone == null || phone.length() < 7) {
            throw new IllegalArgumentException("El teléfono debe ser válido (mínimo 7 dígitos).");
        }
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void addPet(Pet pet) {
        if (pet != null) {
            this.pets.add(pet);
        }
    }

    public void showOwnerInfo() {
        System.out.println("\n=== DATOS DEL DUEÑO ===");
        System.out.println("ID: " + ownerId);
        System.out.println("Nombre: " + name);
        System.out.println("Teléfono: " + phone);
        System.out.println("--- Mascotas asociadas ---");
        if (pets.isEmpty()) {
            System.out.println("No tiene mascotas registradas aún.");
        } else {
            for (Pet p : pets) {
                System.out.println("- " + p.getName() + " (" + p.getBreed() + ")");
            }
        }
    }
}
/*
 * Fin de la clase Owner.java
 */