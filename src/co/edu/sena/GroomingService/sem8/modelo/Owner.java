package co.edu.sena.GroomingService.sem8.modelo;

/*
 * Representa al dueño de una mascota
 */
public class Owner {

    private String name;
    private String phone;

    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
/* Fin de la clase Owner */