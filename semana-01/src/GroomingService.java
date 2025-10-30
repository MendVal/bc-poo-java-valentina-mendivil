public class GroomingService {

    // ATRIBUTOS (5+ requeridos: String, double, int, boolean)
    private String serviceCode;     // Código único del servicio (String).
    private String petName;         // Nombre de la mascota (String).
    private String serviceType;     // Tipo de servicio (ej: Baño, Corte) (String).
    private double basePrice;       // Precio base del servicio (double).
    private int durationMinutes;    // Duración del servicio en minutos (int).
    private boolean isPaid;         // Estado de pago del servicio (boolean).

    // Constructor (5 argumentos)
    public GroomingService(String serviceCode, String petName, String serviceType, double basePrice, int durationMinutes) {
        this.serviceCode = serviceCode;
        this.petName = petName;
        this.serviceType = serviceType;
        this.basePrice = basePrice;
        this.durationMinutes = durationMinutes;
        this.isPaid = false; // El servicio siempre inicia como pendiente de pago.
    }

    // Método 1: void que imprime información
    public void showInfo() {
        System.out.println("=== Servicio Grooming (" + serviceCode + ") ===");
        System.out.println("Mascota: " + petName);
        System.out.println("Tipo: " + serviceType);
        System.out.println("Duración: " + durationMinutes + " minutos");
        System.out.printf("Precio Base: $%.2f%n", basePrice);
        System.out.println("Estado de Pago: " + (isPaid ? "PAGADO" : "PENDIENTE"));
    }

    // Método 2: Retorna valor calculado
    public double calculateFinalCost() {
        // Aplica una tasa de servicio del 10%
        final double SERVICE_FEE = 0.10;
        return basePrice * (1 + SERVICE_FEE);
    }

    // Método 3: Getter
    public String getServiceCode() {
        return serviceCode;
    }

    // Método 4: Setter
    public void setIsPaid(boolean paid) {
        this.isPaid = paid;
    }
}
/*
FIN DE LA CLASE

La clase GroomingService modela un servicio real de 
peluquería canina. Agrupa atributos (código, mascota,
tipo, precio y duración) junto con su comportamiento 
(mostrar información, calcular costo final y registrar 
estado de pago)
*/
