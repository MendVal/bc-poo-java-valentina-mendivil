
package co.edu.sena.GroomingService.sem3;

public class GroomingService {
    /*
     * Archivo: GroomingService.java (CORREGIDO)
     * Dominio: Sistema de Gestión de Peluquería Canina Mascotas Elegantes
     * Semana 3: Implementación de Encapsulación y Sobrecarga de Constructores
     */

    // Atributos privados
    private String serviceCode;
    private String petName;
    private String serviceType;
    private double basePrice;
    private int durationMinutes;
    private boolean isPaid;

    // CONSTRUCTOR 1: Básico (Sobrecargado)
    public GroomingService(String petName, String serviceType, double basePrice) {
        // Duración default 30 min, código temporal
        this("TEMP-000", petName, serviceType, basePrice, 30);
    }

    // CONSTRUCTOR 2: Completo
    public GroomingService(String serviceCode, String petName, String serviceType, double basePrice, int durationMinutes) {
        this.serviceCode = serviceCode;
        this.petName = petName;
        this.serviceType = serviceType;
        // Las validaciones se llaman a través de los setters
        setBasePrice(basePrice);
        setDurationMinutes(durationMinutes);
        this.isPaid = false;
    }

    // ================== GETTERS Y SETTERS CON VALIDACIÓN ==================

    // Setter con VALIDACIÓN: Precio debe ser positivo.
    public void setBasePrice(double basePrice) {
        if (basePrice <= 0) {
            throw new IllegalArgumentException("El precio base debe ser mayor a cero.");
        }
        this.basePrice = basePrice;
    }

    // Setter con VALIDACIÓN: Duración mínima.
    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes <= 5) {
            throw new IllegalArgumentException("La duración mínima del servicio es de 5 minutos.");
        }
        this.durationMinutes = durationMinutes;
    }

    // MÉTODO AGREGADO (Arregla el error de Main.java)
    public String getServiceType() {
        return serviceType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public double calculateFinalCost() {
        final double SERVICE_FEE = 0.10;
        return basePrice * (1 + SERVICE_FEE);
    }
}
/*
 * Fin de la clase GroomingService.java
 */