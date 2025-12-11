// Archivo: semana-06/interfaces/ServicioFinanciero.java
package co.edu.sena.GroomingService.sem6.interfaces;

/**
 * Interface que define el contrato para la capacidad de Costos y Tarifas.
 * Aplicación del Principio de Segregación de Interfaces (ISP).
 */
public interface ServicioFinanciero {

    /** * Retorna la tasa o el costo base inicial definido por la implementación.
     */
    double calcularCostoBase();

    /** * Retorna el valor monetario del recargo si aplica.
     */
    double obtenerRecargoEspecial();
}
/**
 * Fin de la interfaz ServicioFinanciero.
 */