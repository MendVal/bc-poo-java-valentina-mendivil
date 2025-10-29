public class GroomingService {

    // Atributos
    private String serviceCode;
    private String petName;
    private String serviceType;

    // Constructor
    public GroomingService(String serviceCode, String petName, String serviceType) {
        this.serviceCode = serviceCode;
        this.petName = petName;
        this.serviceType = serviceType;
    }

    // Método
    public void showInfo() {
        System.out.println("=== Servicio Grooming ===");
        System.out.println("Código: " + serviceCode);
        System.out.println("Mascota: " + petName);
        System.out.println("Tipo Servicio: " + serviceType);
        System.out.println("-------------------------");
    }
}

/*
La clase representa un servicio de grooming para mascotas.
Contiene código del servicio, nombre de la mascota y tipo.
Permite mostrar la información en consola.
Se puede ampliar agregando precio u otras opciones.
*/

