package co.edu.sena.GroomingService.sem6.interfaces;

/**
 * Interface que define el contrato para la capacidad de enviar notificaciones.
 * Aplicación del Principio de Segregación de Interfaces (ISP).
 */
public interface Comunicable {

    /** * Envía una notificación de texto o email al propietario.
     */
    void enviarNotificacion(String mensaje);

    /** * Verifica si el canal de comunicación es válido.
     */
    boolean verificarCanalActivo();
}
/**
 * Fin de la interfaz Comunicable.
 */