package co.edu.sena.GroomingService.sem1;

/*
 * Clase principal que representa un Servicio de Peluquería Canina (GroomingService).
 * Relaciona una mascota con el tipo de servicio, su costo y estado de pago.
 */
public class GroomingService {

    // Atributos
    private String serviceCode;     // Código único del servicio
    private String petName;         // Nombre de la mascota asociada
    private String serviceType;     // Tipo de servicio (baño, corte, spa, etc.)
    private double basePrice;       // Precio base
    private int durationMinutes;    // Duración estimada del servicio
    private boolean isPaid;         // Estado de pago (true = pagado)

    // Constructor
    public GroomingService(String serviceCode, String petName, String serviceType, double basePrice, int durationMinutes) {
        this.serviceCode = serviceCode;
        this.petName = petName;
        this.serviceType = serviceType;
        this.basePrice = basePrice;
        this.durationMinutes = durationMinutes;
        this.isPaid = false; // Por defecto, inicia como no pagado
    }

    // Método: mostrar información del servicio
    public void showInfo() {
        System.out.println("=== Servicio Grooming (" + serviceCode + ") ===");
        System.out.println("Mascota: " + petName);
        System.out.println("Tipo: " + serviceType);
        System.out.println("Duración: " + durationMinutes + " minutos");
        System.out.printf("Precio Base: $%.2f%n", basePrice);
        System.out.println("Estado de Pago: " + (isPaid ? "PAGADO" : "PENDIENTE"));
        System.out.println("-----------------------------------------");
    }

    // Método: calcular costo final
    public double calculateFinalCost() {
        final double SERVICE_FEE = 0.10;
        return basePrice * (1 + SERVICE_FEE);
    }

    // Getter del código del servicio
    public String getServiceCode() {
        return serviceCode;
    }

    // Setter estado de pago
    public void setIsPaid(boolean paid) {
        this.isPaid = paid;
    }

    // ================================
    // MÉTODOS NECESARIOS PARA SEMANA 2
    // ================================

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getServiceType() {
        return serviceType;
    }

} // Fin de la clase
/*
 * Clase GroomingService (Servicio de Peluquería Canina):
 * Representa un servicio específico realizado a una mascota.
 * Incluye atributos como código del servicio, tipo, precio y duración.
 * Proporciona métodos para calcular el costo final, consultar información
 * y actualizar el estado de pago del servicio.
 */