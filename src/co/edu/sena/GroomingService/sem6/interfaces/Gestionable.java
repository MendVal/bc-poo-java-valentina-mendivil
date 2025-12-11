
package co.edu.sena.GroomingService.sem6.interfaces;

/**
 * Interface que define el contrato para la capacidad de Gestión de Estado.
 * Es una capacidad independiente de la jerarquía de Pet o Servicio.
 */
public interface Gestionable {

    void marcarCompletado();

    void marcarPendiente();

    boolean verificarEstadoCompletado();
}
/**
 * Fin de la interfaz Gestionable.
 */
