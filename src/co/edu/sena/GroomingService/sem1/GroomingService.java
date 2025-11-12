package co.edu.sena.GroomingService.sem1;

/**
 * Clase principal que representa un Servicio de Peluquería Canina (GroomingService).
 * Relaciona una mascota con el tipo de servicio, su costo y estado de pago.
 */
public class GroomingService {

    // Atributos (propiedades del servicio)
    private String serviceCode;     
    private String petName;         
    private String serviceType;     
    private double basePrice;       
    private int durationMinutes;    
    private boolean isPaid;         

    // Constructor (inicializa todos los atributos)
    public GroomingService(String serviceCode, String petName, String serviceType, double basePrice, int durationMinutes) {
        this.serviceCode = serviceCode;
        this.petName = petName;
        this.serviceType = serviceType;
        this.basePrice = basePrice;
        this.durationMinutes = durationMinutes;
        this.isPaid = false; // Por defecto, el servicio inicia como no pagado
    }

    // Método 1: muestra la información completa del servicio
    public void showInfo() {
        System.out.println("=== Servicio Grooming (" + serviceCode + ") ===");
        System.out.println("Mascota: " + petName);
        System.out.println("Tipo: " + serviceType);
        System.out.println("Duración: " + durationMinutes + " minutos");
        System.out.printf("Precio Base: $%.2f%n", basePrice);
        System.out.println("Estado de Pago: " + (isPaid ? "PAGADO" : "PENDIENTE"));
        System.out.println("-----------------------------------------");
    }

    // Método 2: calcula el costo final del servicio con tasa del 10%
    public double calculateFinalCost() {
        final double SERVICE_FEE = 0.10;
        return basePrice * (1 + SERVICE_FEE);
    }

    // Método 3: obtiene el código del servicio (getter)
    public String getServiceCode() {
        return serviceCode;
    }

    // Método 4: cambia el estado de pago (setter)
    public void setIsPaid(boolean paid) {
        this.isPaid = paid;
    }
}// Fin de la clase GrommingService


/*
Clase Principal GroomingService (Servicio de Peluquería):
Representa un servicio específico ofrecido a una mascota.
Contiene atributos como código de servicio, precio y duración, y métodos
para calcular el costo final y actualizar el estado de pago.
*/
