package co.edu.sena.GroomingService.sem8.excepciones;

/*
 * Se lanza cuando la fecha no es válida
 */
public class DateNotAvailableException extends Exception {

    public DateNotAvailableException(String message) {
        super(message);
    }
}
