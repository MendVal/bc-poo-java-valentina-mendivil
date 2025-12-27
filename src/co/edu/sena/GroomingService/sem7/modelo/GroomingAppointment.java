package co.edu.sena.GroomingService.sem7.modelo;

public class GroomingAppointment {

    private Pet pet;
    private String serviceType;
    private String date;

    public GroomingAppointment(Pet pet, String serviceType, String date) {
        this.pet = pet;
        this.serviceType = serviceType;
        this.date = date;
    }

    public Pet getPet() {
        return pet;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getDate() {
        return date;
    }
}

