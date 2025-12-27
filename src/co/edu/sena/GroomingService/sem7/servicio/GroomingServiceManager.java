package co.edu.sena.GroomingService.sem7.servicio;


import co.edu.sena.GroomingService.sem7.modelo.GroomingAppointment;
import co.edu.sena.GroomingService.sem7.excepciones.*;

/*
 * Clase GestorCitasGrooming
 * Contiene la lógica del negocio para agendar citas de grooming.
 * Aquí se validan reglas y se lanzan excepciones.
 */

public class GroomingServiceManager {

    public void registerAppointment(GroomingAppointment appointment)
        throws  PetNotRegisteredException, InvalidServiceException, AppointmentNotAvailableException {

        if (appointment == null || appointment.getPet() == null) {
            throw new PetNotRegisteredException("Pet is not registered");

        }

        if (appointment.getServiceType() == null || appointment.getServiceType().isEmpty()) {
            throw new PetNotRegisteredException("Invalid grooming service");
        }

        if (appointment.getDate() == null ||  appointment.getDate().isEmpty()) {
            throw new AppointmentNotAvailableException("Appointment date not available");

    }

        System.out.println("Appointment registered successfully for pet: " +
                appointment.getPet().getName());
    }
}
/* Fin de la clase GestorCitasGrooming */