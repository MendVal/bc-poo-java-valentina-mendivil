package co.edu.sena.GroomingService.sem6;

import co.edu.sena.GroomingService.sem6.abstractas.Pet;
import co.edu.sena.GroomingService.sem6.implementaciones.Dog;
import co.edu.sena.GroomingService.sem6.implementaciones.Cat;
import co.edu.sena.GroomingService.sem6.implementaciones.GroomingService;
import co.edu.sena.GroomingService.sem6.interfaces.ServicioFinanciero;
import co.edu.sena.GroomingService.sem6.interfaces.Comunicable; //

import java.util.ArrayList;

/**
 * Clase Main.
 * SEMANA 06: Demostración de Abstracción e Interfaces (SOLID).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===  DEMOSTRACIÓN DE ABSTRACCIÓN E INTERFACES ===\n");

        // --- 1. CREACIÓN DE OBJETOS ---
        Dog d1 = new Dog("Lana", "Poodle", "Valentina M.", 3, true);
        d1.markSpecialCare(true);

        Cat c1 = new Cat("Bigotes", "Siamés", "Carlos P.", 2, "Pelo Largo");

        GroomingService g_dog = new GroomingService("POLY-D01", d1, "Corte", 50000.0, 90);

        // --- 2. DEMOSTRACIÓN DE POLIMORFISMO Y SERVICIO FINANCIERO ---
        System.out.println("--- Sección 1: Polimorfismo y Servicio Financiero ---");

        ArrayList<Pet> mascotasEnEspera = new ArrayList<>();
        mascotasEnEspera.add(d1);
        mascotasEnEspera.add(c1);

        for (Pet p : mascotasEnEspera) {
            System.out.println("> " + p.speak());
        }

        // Acceso a la lógica de recargos usando el CASTING a la Interfaz ServicioFinanciero
        double recargoPerro = ((ServicioFinanciero) d1).obtenerRecargoEspecial();
        System.out.printf("[RECARGO DOG]: Recargo Especial (vía Interface) de $%.2f%n", recargoPerro);


        // --- 3. DEMOSTRAR MÚLTIPLE IMPLEMENTACIÓN (Gestionable y Comunicable) ---

        System.out.println("\n--- Sección 2: Gestión de Estado y Comunicación ---");

        // El objeto g_dog se trata como Gestionable para el estado
        System.out.println("Estado inicial de " + g_dog.getServiceCode() + " (¿Completado?): " + g_dog.verificarEstadoCompletado());

        // Llamada a Gestionable.marcarCompletado()...
        g_dog.marcarCompletado();


        // Verificación final
        System.out.println("Estado final de " + g_dog.getServiceCode() + " (¿Completado?): " + g_dog.verificarEstadoCompletado());

        // Demostración directa de Comunicable
        System.out.println("\n--- Sección 3: Uso Directo de Comunicable ---");
        ((Comunicable) g_dog).enviarNotificacion("¡Recuerde nuestra promoción de champú!");


        System.out.println("\n=== DEMOSTRACIÓN COMPLETA FINALIZADA ===");
    }
}
/**
 * Fin de la clase Main.
 */