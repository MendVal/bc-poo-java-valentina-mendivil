package co.edu.sena.GroomingService.sem8.servicio;

import co.edu.sena.GroomingService.sem8.modelo.GroomingAppointment;
import co.edu.sena.GroomingService.sem8.excepciones.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Clase GroomingServiceManager
 * Lógica de negocio con colecciones
 */
public class GroomingServiceManager {

    private Map<String, GroomingAppointment> appointmentsByCode = new HashMap<>();
    private List<GroomingAppointment> appointmentHistory = new ArrayList<>();

    public void registerAppointment(GroomingAppointment appointment)
            throws PetNotRegisteredException, InvalidServiceException,
            DateNotAvailableException, DuplicateAppointmentException {

        if (appointment == null || appointment.getPet() == null) {
            throw new PetNotRegisteredException("La mascota no está registrada");
        }

        if (appointment.getService() == null || appointment.getService().isEmpty()) {
            throw new InvalidServiceException("Servicio de grooming inválido");
        }

        if (appointment.getDate() == null || appointment.getDate().isEmpty()) {
            throw new DateNotAvailableException("Fecha no disponible");
        }

        if (appointmentsByCode.containsKey(appointment.getCode())) {
            throw new DuplicateAppointmentException(
                    "La cita ya existe con código: " + appointment.getCode());
        }

        appointmentsByCode.put(appointment.getCode(), appointment);
        appointmentHistory.add(appointment);

        System.out.println("✅ Cita registrada: " + appointment);
    }

    public GroomingAppointment findByCode(String code) {
        return appointmentsByCode.get(code);
    }

    public List<GroomingAppointment> filterByService(String service) {
        List<GroomingAppointment> result = new ArrayList<>();
        for (GroomingAppointment a : appointmentHistory) {
            if (a.getService().equalsIgnoreCase(service)) {
                result.add(a);
            }
        }
        return result;
    }

    public int totalAppointments() {
        return appointmentHistory.size();
    }

    public int calculateTotalIncome() {
        int total = 0;
        for (GroomingAppointment a : appointmentHistory) {
            total += a.getPrice();
        }
        return total;
    }

    public double calculateAveragePrice() {
        if (appointmentHistory.isEmpty()) {
            return 0;
        }
        return (double) calculateTotalIncome() / appointmentHistory.size();
    }
}
/* Fin de la clase GroomingServiceManager */
