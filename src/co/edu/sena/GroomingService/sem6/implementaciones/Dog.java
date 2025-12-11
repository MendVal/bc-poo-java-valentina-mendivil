package co.edu.sena.GroomingService.sem6.implementaciones;

import co.edu.sena.GroomingService.sem6.abstractas.Pet;
import co.edu.sena.GroomingService.sem6.interfaces.ServicioFinanciero;

/**
 * Clase Dog.
 * Extiende la jerarquía abstracta (Pet) e implementa la capacidad financiera (ServicioFinanciero).
 */

public class Dog extends Pet implements ServicioFinanciero {

    private boolean isHypoallergenic;

    public Dog(String name, String breed, String ownerName, int ageYears, boolean isHypoallergenic) {
        super(name, breed, ownerName, ageYears);
        this.isHypoallergenic = isHypoallergenic;
        this.petType = "Perro";
    }

    // ================= IMPLEMENTACIÓN DE PET =================
    @Override
    public double calculateServiceFee() {
        return 1.10; // Tasa 10%
    }

    @Override
    public String speak() {
        return this.getName() + " (Perro) dice: ¡Guau, guau! ¿Es hipoalergénico?: " + isHypoallergenic;
    }

    // ================= IMPLEMENTACIÓN DE SERVICIOFINANCIERO =================
    @Override
    public double calcularCostoBase() {
        return this.calculateServiceFee();
    }

    @Override
    public double obtenerRecargoEspecial() {
        return this.isRequiresSpecialCare() ? 5000.0 : 0.0; // Recargo por cuidado especial
    }
}
/**
 * Fin de la clase Dog.
 */