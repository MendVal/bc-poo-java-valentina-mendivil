// Archivo: semana-06/implementaciones/Cat.java
package co.edu.sena.GroomingService.sem6.implementaciones;

import co.edu.sena.GroomingService.sem6.abstractas.Pet;
import co.edu.sena.GroomingService.sem6.interfaces.ServicioFinanciero;

/**
 * Clase Cat. 
 * Extiende la jerarquía abstracta (Pet) e implementa la capacidad financiera (ServicioFinanciero).
 */
public class Cat extends Pet implements ServicioFinanciero {

    private String coatType;

    public Cat(String name, String breed, String ownerName, int ageYears, String coatType) {
        super(name, breed, ownerName, ageYears);
        this.coatType = coatType;
        this.petType = "Gato";
    }

    // ================= SOBRESCRITURA DE PET =================
    @Override
    public double calculateServiceFee() {
        return 1.15; // Tasa 15%
    }

    @Override
    public String speak() {
        return this.getName() + " (Gato) dice: Miau. Tipo de pelaje: " + coatType;
    }

    // ================= IMPLEMENTACIÓN DE SERVICIOFINANCIERO =================
    @Override
    public double calcularCostoBase() {
        return this.calculateServiceFee();
    }

    @Override
    public double obtenerRecargoEspecial() {
        // Recargo si es pelo largo O requiere cuidado especial
        if (coatType.equalsIgnoreCase("Pelo Largo") || this.isRequiresSpecialCare()) {
            return 7500.0;
        }
        return 0.0;
    }
}
/**
 * Fin de la clase Cat.
 */