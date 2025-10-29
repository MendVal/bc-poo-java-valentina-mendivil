public class Pet {

    private String name;
    private String breed;
    private String ownerName;

    public Pet(String name, String breed, String ownerName) {
        this.name = name;
        this.breed = breed;
        this.ownerName = ownerName;
    }

    public void showInfo() {
        System.out.println("=== Mascota ===");
        System.out.println("Nombre: " + name);
        System.out.println("Raza: " + breed);
        System.out.println("Propietario: " + ownerName);
        System.out.println("-------------------------");
    }
}
/*
Esta clase representa una mascota.
Contiene atributos como nombre, raza y propietario.
Permite mostrar la información en consola.
Se puede ampliar para incluir edad, color u otros datos.
*/