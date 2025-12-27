package co.edu.sena.GroomingService.sem7.excepciones;
/*
 * Excepción personalizada
 * Se lanza cuando la fecha de la cita no es válida.
 */
public class AppointmentNotAvailableException extends RuntimeException {

    public AppointmentNotAvailableException(String message) {

        super(message);
    }
}

/* Fin de CitaNoDisponibleException */