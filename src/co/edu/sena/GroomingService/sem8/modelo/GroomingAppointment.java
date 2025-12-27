package co.edu.sena.GroomingService.sem8.modelo;

/*
 * Clase GroomingAppointment
 * Representa una cita de grooming para una mascota
 */
public class GroomingAppointment {

    private String code;
    private Pet pet;
    private String service;
    private String date;
    private int price;

    public GroomingAppointment(String code, Pet pet, String service, String date, int price) {
        this.code = code;
        this.pet = pet;
        this.service = service;
        this.date = date;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public Pet getPet() {
        return pet;
    }

    public String getService() {
        return service;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cita[" +
                "Código='" + code + '\'' +
                ", Mascota=" + pet.getName() +
                ", Servicio='" + service + '\'' +
                ", Fecha='" + date + '\'' +
                ", Precio=$" + price +
                ']';
    }
}
/* Fin de la clase GroomingAppointment */
