package co.edu.sena.GroomingService.sem8.excepciones;

/*
 * Se lanza cuando ya existe una cita con el mismo código
 */
public class DuplicateAppointmentException extends Exception {

    public DuplicateAppointmentException(String message) {
        super(message);
    }
}