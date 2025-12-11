package co.edu.sena.GroomingService.sem6.implementaciones;

import co.edu.sena.GroomingService.sem6.abstractas.Pet;
import co.edu.sena.GroomingService.sem6.interfaces.Gestionable;
import co.edu.sena.GroomingService.sem6.interfaces.Comunicable;

/**
 * Clase GroomingService.
 * Demuestra la Múltiple Implementación de interfaces (Gestionable, Comunicable)
 * y usa Composición con la clase abstracta Pet.
 */
public class GroomingService implements Gestionable, Comunicable {

    // ATRIBUTOS
    private String serviceCode;
    private Pet pet;
    private String serviceType; // Usado en constructor
    private double basePrice;
    private int durationMinutes; // Usado en constructor
    private boolean isPaid;

    // Constructor
    public GroomingService(String serviceCode, Pet pet, String serviceType, double basePrice, int durationMinutes) {
        this.serviceCode = serviceCode;
        this.pet = pet;
        this.serviceType = serviceType;
        this.basePrice = basePrice;
        this.durationMinutes = durationMinutes;
        this.isPaid = false;
    }

    // ================= IMPLEMENTACIÓN DE GESTIONABLE =================
    @Override
    public void marcarCompletado() {
        this.isPaid = true;
        System.out.println("[GESTOR] Servicio " + serviceCode + " marcado como PAGADO.");
        // Después de completar, usamos la interfaz Comunicable para notificar
        enviarNotificacion("¡Su mascota " + pet.getName() + " está lista para ser recogida!");
    }

    @Override
    public void marcarPendiente() {
        this.isPaid = false;
        System.out.println("[GESTOR] Servicio " + serviceCode + " marcado como PENDIENTE.");
    }

    @Override
    public boolean verificarEstadoCompletado() {
        return this.isPaid;
    }

    // ================= IMPLEMENTACIÓN DE COMUNICABLE =================
    @Override
    public void enviarNotificacion(String mensaje) {
        if (verificarCanalActivo()) {
            System.out.println("[COMUNICADOR] Notificación enviada al dueño de " + pet.getName() + ": " + mensaje);
        } else {
            System.err.println("[COMUNICADOR ERROR] No se pudo enviar la notificación. Canal inactivo.");
        }
    }

    @Override
    public boolean verificarCanalActivo() {
        // Lógica simulada: asumimos que el canal está activo si el código de servicio no es nulo
        return this.serviceCode != null && !this.serviceCode.isEmpty();
    }

    // ================= MÉTODOS DE CÁLCULO Y POLIMORFISMO =================

    /**
     * Calcula el costo final del servicio aplicando la tasa polimórfica de la mascota.
     */
    public double calculateFinalCost() {
        // Llama al método polimórfico de Pet (Dog o Cat)
        double serviceFee = pet.calculateServiceFee();
        return basePrice * serviceFee;
    }

    /**
     * Sobrecarga 1: Aplica un porcentaje de descuento al costo final.
     */
    public double calculateFinalCost(double discountPercentage) {
        double finalCost = this.calculateFinalCost();
        System.out.printf("  [DSCTO] Descuento %.2f%% aplicado.%n", discountPercentage * 100);
        return finalCost * (1 - discountPercentage);
    }

    /**
     * Sobrecarga 2: Aplica un recargo fijo por una razón específica.
     */
    public double calculateFinalCost(String reason, double extraCharge) {
        double finalCost = this.calculateFinalCost();
        System.out.printf("  [REC] Recargo por %s: $%.1f%n", reason, extraCharge);
        return finalCost + extraCharge;
    }

    // ================= GETTERS =================
    public String getServiceCode() {
        return serviceCode;
    }
    public Pet getPet() {
        return pet;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public String getServiceType() {
        return serviceType;
    }
    public int getDurationMinutes() {
        return durationMinutes;
    }
}
/**
 * Fin de la clase GroomingService.
 */