/*
 * Archivo: Main.java
 * Dominio: Sistema de Gestión de Peluquería Canina Mascotas Elegantes
 * Semana 3: Prueba de Encapsulación, Sobrecarga y Validación (COHERENCIA FINAL)
 */
package co.edu.sena.GroomingService.sem3;

/**
 * Clase Main (Semana 3):
 * Prueba la funcionalidad de Encapsulación, Sobrecarga de Constructores y Validaciones.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== SEMANA 3: PRUEBA DE ENCAPSULACIÓN Y SOBRECARGA ===\n");

        // =========================================================
        // 1. PRUEBA DE SOBRECARGA DE CONSTRUCTORES
        // =========================================================

        System.out.println("--- 1. PROBANDO CONSTRUCTORES SOBRECARGADOS ---");

        // Pet: Usando Constructor 1 (Mínimo). Usamos LANA.
        Pet petMin = new Pet("Lana", "Poodle");
        System.out.println(" Pet creado con constructor mínimo: " + petMin.getName() + " (Edad: " + petMin.getAgeYears() + " años)");

        // Owner: Usando Constructor 1 (Sin ID)
        Owner ownerMin = new Owner("Camila López", "3115554433");
        System.out.println(" Owner creado con constructor mínimo: " + ownerMin.getName());

        // GroomingService: Usando Constructor 1 (Servicio Rápido). Usamos PRINCESA.
        GroomingService serviceMin = new GroomingService("Princesa", "Baño Rápido Express", 35000);
        System.out.println(" Servicio creado con constructor básico: " + serviceMin.getServiceType());

        System.out.println("\n-------------------------------------------------");


        // =========================================================
        // 2. PRUEBA DE VALIDACIONES (ERRORES ESPERADOS)
        // =========================================================
        System.out.println("--- 2. PROBANDO VALIDACIONES (ERRORES ESPERADOS) ---");

        // Prueba A: Validación en Constructor (Pet: Edad Negativa)
        try {
            Pet petFailAge = new Pet("ErrorPet", "Siamés", "Desconocido", -5);
        } catch (IllegalArgumentException e) {
            System.out.println(" Validación exitosa (Pet): " + e.getMessage());
        }

        // Prueba B: Validación en Constructor (GroomingService: Precio Cero)
        try {
            GroomingService serviceFailPrice = new GroomingService("S004", "Ari", "Baño", 0, 60); // Usamos Ari
        } catch (IllegalArgumentException e) {
            System.out.println(" Validación exitosa (Service): " + e.getMessage());
        }

        // Prueba C: Validación en Setter (Owner: Nombre Demasiado Corto)
        try {
            Owner ownerValido = new Owner("O-200", "Ana Pérez", "3201234567");
            ownerValido.setName("A");
        } catch (IllegalArgumentException e) {
            System.out.println(" Validación exitosa (Owner): " + e.getMessage());
        }


        // =========================================================
        // 3. INTEGRACIÓN FINAL (Flujo de Negocio Coherente)
        // =========================================================
        System.out.println("\n--- 3. PRUEBA DE INTEGRACIÓN ---");

        // Flujo final usando los datos coherentes de la Semana 1/2
        Owner owner1 = new Owner("O-100", "Valentina Mendivil", "3001234567");
        // *** CAMBIO FINAL AQUÍ: Usamos Princesa para la integración ***
        Pet pet1 = new Pet("Princesa", "Poodle", "Valentina Mendivil", 3);
        GroomingService service1 = new GroomingService("GS-100", "Princesa", "Paquete Premium", 70000, 120);

        owner1.addPet(pet1);

        System.out.println("Integración exitosa. Costo final de " + service1.getServiceType() + ": $" + String.format("%.2f", service1.calculateFinalCost()));
        owner1.showOwnerInfo();

        System.out.println("\n=== DEMOSTRACIÓN SEMANA 3 FINALIZADA ===");
    }
}
/*
 * Fin de la clase Main
 */