
package co.edu.sena.GroomingService.sem5;

/**
 * Clase GroomingService.
 * SEMANA 05: Implementa:
 * 1. Polimorfismo por Composición (almacena objeto Pet).
 * 2. Sobrecarga de métodos (Overloading en calculateFinalCost).
 * 3. @Override toString() para la representación del objeto.
 */

public class GroomingService {

    // ATRIBUTOS
    private String serviceCode;
    private Pet pet; // Usa el objeto Pet
    private String serviceType;
    private double basePrice;
    private int durationMinutes;
    private boolean isPaid;

    // Constructor Completo (el constructor simple no es necesario si no se usa)
    public GroomingService(String serviceCode, Pet pet, String serviceType, double basePrice, int durationMinutes) {
        this.serviceCode = serviceCode;
        this.pet = pet;
        this.serviceType = serviceType;
        // Las validaciones se llaman a través de los setters
        setBasePrice(basePrice);
        setDurationMinutes(durationMinutes);
        this.isPaid = false;
    }

    // IMPLEMENTACIÓN DE toString()
    @Override
    public String toString() {
        return String.format(
                "=== Servicio Grooming (%s) ===\n" +
                        "Mascota: %s (%s)\n" +
                        "Tipo: %s\n" +
                        "Duración: %d minutos\n" +
                        "Precio Base: $%.2f\n" +
                        "Estado de Pago: %s",
                serviceCode,
                pet.getName(),
                pet.petType,
                serviceType,
                durationMinutes,
                basePrice,
                (isPaid ? "PAGADO" : "PENDIENTE")
        );
    }

    // MÉTODO BASE (Polimórfico por Sobrescritura)
    public double calculateFinalCost() {
        double serviceFee = pet.calculateServiceFee();
        return basePrice * serviceFee;
    }

    // --- SOBRECARGA DE MÉTODOS (OVERLOADING) ---

    public double calculateFinalCost(double discountPercentage) {
        double finalCost = this.calculateFinalCost();
        return finalCost * (1 - discountPercentage);
    }

    public double calculateFinalCost(String reason, double extraCharge) {
        double finalCost = this.calculateFinalCost();
        System.out.println("  [REC] Recargo por " + reason + ": $" + extraCharge);
        return finalCost + extraCharge;
    }

    // ================== GETTERS Y SETTERS (CORREGIDOS) ==================

    // CORRIGE ERROR: 'Cannot resolve method getServiceCode'
    public String getServiceCode() {
        return serviceCode;
    }

    // CORRIGE ERROR: 'Cannot resolve method setisPaid'
    public void setIsPaid(boolean paid) {
        this.isPaid = paid;
    }

    // Setters con VALIDACIÓN (mantener)
    public void setBasePrice(double basePrice) {
        if (basePrice <= 0) {
            throw new IllegalArgumentException("El precio base debe ser mayor a cero.");
        }
        this.basePrice = basePrice;
    }

    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes <= 5) {
            throw new IllegalArgumentException("La duración mínima del servicio es de 5 minutos.");
        }
        this.durationMinutes = durationMinutes;
    }

    // Otros Getters (mantener)
    public String getServiceType() {
        return serviceType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
}
/**
 * Fin de la clase GroomingService.
 */