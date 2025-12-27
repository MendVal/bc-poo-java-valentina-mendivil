package co.edu.sena.GroomingService.sem7.excepciones;

/*
 * Excepción personalizada
 * Se lanza cuando el servicio de grooming es inválido.
 */
public class InvalidServiceException extends Exception {

    public InvalidServiceException(String mensaje) {
        super(mensaje);
    }
}
/* Fin de ServicioInvalidoException */
