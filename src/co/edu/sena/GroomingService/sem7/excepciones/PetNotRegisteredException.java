package co.edu.sena.GroomingService.sem7.excepciones;

/*
 * Excepción personalizada
 * Se lanza cuando la mascota no está registrada o es nula.
 */
public class PetNotRegisteredException extends Exception {

    public PetNotRegisteredException(String mensaje) {
        super(mensaje);
    }
}
/* Fin de MascotaNoRegistradaException */

