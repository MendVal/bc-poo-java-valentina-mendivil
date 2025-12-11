#  Documento de Análisis de Diseño - Semana 06: Abstracción e Interfaces

## 1. Identificación de Abstracciones

La abstracción principal es **Pet**. Se modificó a clase abstracta para forzar a todas las especies de mascotas a definir su comportamiento esencial de forma única (`speak()`, `calculateServiceFee()`), al mismo tiempo que centraliza la estructura de datos común (atributos como `name`, `ownerName`) y el comportamiento reutilizable (`markSpecialCare`). Esto garantiza la correcta aplicación del Principio de Liskov (LSP).

---

## 2. Interfaces Implementadas

| Interface | Propósito | Clases que Implementan | Principio Clave |
| :--- | :--- | :--- | :--- |
| **ServicioFinanciero** | Define el contrato para la lógica de **costos y recargos** específicos del objeto. | `Dog`, `Cat` | SRP, ISP |
| **Gestionable** | Define el contrato para la **gestión de estado** (ciclo de vida: pendiente/completado). | `GroomingService` | ISP |
| **Comunicable** | Define la capacidad de **enviar notificaciones** (email, texto, etc.). | `GroomingService` | ISP, Múltiple Implementación |

---

## 3. Decisiones de Diseño (Abstracta vs Interface)

* **Clase Abstracta (`Pet`):** Se utilizó porque existe una fuerte relación **"es un"** con las subclases (`Dog` *es un* `Pet`). Permite **compartir código concreto** (constructores, `toString()`) y forzar contratos obligatorios (métodos abstractos).
* **Interfaces (`ServicioFinanciero`, `Gestionable`, `Comunicable`):** Se utilizaron para modelar **capacidades** (relación **"puede hacer"**). Esto permite que `GroomingService` adopte múltiples capacidades (`Gestionable` y `Comunicable`) **independientes** de la jerarquía de herencia, aplicando estrictamente el **Principio de Segregación de Interfaces (ISP)**.

---

## 4. Principios SOLID Aplicados

* **SRP (Single Responsibility Principle):** Las responsabilidades están separadas: `Pet` (identidad), `ServicioFinanciero` (costos), `GroomingService` (coordinación y gestión), `Comunicable` (notificación).
* **OCP (Open/Closed Principle):** El sistema es abierto a la extensión (añadir nuevas especies o nuevas interfaces de capacidad) sin modificar el código de las clases base existentes (`GroomingService`).
* **ISP (Interface Segregation Principle):** Se crearon tres interfaces pequeñas y específicas, asegurando que `GroomingService` implemente solo los métodos de gestión y comunicación que necesita.
* **DIP (Dependency Inversion Principle):** El módulo de alto nivel (`GroomingService`) depende de la abstracción (`Pet`) y de interfaces (`Gestionable`, `Comunicable`), no de clases concretas, cumpliendo con el principio.

---

## 5. Mejoras Logradas

1.  **Múltiple Implementación:** La clase `GroomingService` ahora demuestra la adopción de dos capacidades distintas (`Gestionable` y `Comunicable`), lo que permite que el evento de "Servicio Completado" dispare una acción de "Notificación".
2.  **Flexibilidad Extrema:** El sistema está listo para añadir nuevas capacidades (ej., una interfaz `AuditLog`) sin modificar la lógica principal de la mascota o del servicio.
3.  **Cohesión y Bajo Acoplamiento:** La separación de las lógicas en interfaces reduce el acoplamiento y mejora la cohesión dentro de la jerarquía.

---

## 6. Diagrama de Clases (UML)

El diagrama ha sido actualizado para incluir la interfaz **Comunicable** y la múltiple implementación en **GroomingService**.

```mermaid
classDiagram
    direction LR

%% INTERFACES
    class ServicioFinanciero {
        <<interface>>
        +obtenerRecargoEspecial()
    }
    class Gestionable {
        <<interface>>
        +marcarCompletado()
    }
    class Comunicable {
        <<interface>>
        +enviarNotificacion(String)
    }

%% CLASE ABSTRACTA
    class Pet {
        <<abstract>>
        -name : String
        #petType : String
        +calculateServiceFee() : double
    }

%% IMPLEMENTACIONES
    class Dog {
        +calculateServiceFee()
    }
    class Cat {
        +calculateServiceFee()
    }
    class GroomingService {
        -pet : Pet
        -isPaid : boolean
        +calculateFinalCost() : double
        +marcarCompletado()
        +enviarNotificacion(String)
    }

%% RELACIONES
    Pet <|-- Dog
    Pet <|-- Cat
    ServicioFinanciero <|.. Dog
    ServicioFinanciero <|.. Cat
    Gestionable <|.. GroomingService
    Comunicable <|.. GroomingService
    GroomingService *-- Pet : usa
 ```

## 7. Desafíos y Soluciones

* **Desafío:** Integrar la notificación (Comunicable) en el ciclo de vida del servicio (Gestionable) sin acoplar fuertemente las clases.
* **Solución:** Se utilizó el método enviarNotificacion() de la interfaz Comunicable (implementada por GroomingService) dentro del método marcarCompletado() (también implementado por GroomingService). Esto permite que la clase cumpla con dos responsabilidades de interfaz distintas, manteniendo la lógica limpia.

## 8. Próximos Pasos

El siguiente paso es la aplicación del patrón de diseño Factory Method para la creación de objetos Pet. Esto eliminará la dependencia directa del Main.java con las clases concretas (Dog y Cat), solidificando aún más la aplicación del Principio de Inversión de Dependencia (DIP) en el módulo de inicialización.

---

##  Archivo `Main.java` 


```java
// Archivo: semana-06/Main.java
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
```