public class Pet {

    // ATRIBUTOS (4+ Atributos requeridos)
    private String name;            // Nombre de la mascota.
    private String breed;           // Raza de la mascota.
    private String ownerName;       // Nombre del propietario.
    private int ageYears;           // Edad de la mascota en años.
    private boolean requiresSpecialCare; // Indica si tiene necesidades especiales.

    // Constructor (4 argumentos)
    public Pet(String name, String breed, String ownerName, int ageYears) {
        this.name = name;
        this.breed = breed;
        this.ownerName = ownerName;
        this.ageYears = ageYears;
        this.requiresSpecialCare = false;
    }

    // Método Getter (Necesario para que Main pueda pasar el nombre a GroomingService)
    public String getName() {
        return name;
    }

    // Método 1: void que imprime información
    public void showInfo() {
        System.out.println("--- DATOS MASCOTA ---");
        System.out.println("Nombre: " + name);
        System.out.println("Raza: " + breed);
        System.out.println("Edad: " + ageYears + " años");
        System.out.println("Propietario: " + ownerName);
        System.out.println("Cuidado Especial: " + (requiresSpecialCare ? "SÍ" : "NO"));
    }

    // Método 2: Modifica un estado (lógica de negocio)
    public void markSpecialCare(boolean needsCare) {
        this.requiresSpecialCare = needsCare;
        if (needsCare) {
            System.out.println("[LOG] " + name + " marcado/a para cuidado especial.");
        }
    }

    // Método 3: Retorna un valor calculado/estado
    public boolean isOldPet() {
        // Retorna true si la mascota tiene 7 años o más.
        return ageYears >= 7;
    }
}
/*
Clase secundaria que modela una Mascota.
*/