# Semana 06: Abstracción e Interfaces

## Clases Abstractas Implementadas

### Pet
- **Propósito:** Plantilla base de la jerarquía. Centraliza atributos comunes y define el contrato polimórfico obligatorio para todas las especies.
- **Métodos abstractos:**
    - `calculateServiceFee()`: Retorna la tasa o multiplicador del costo del servicio.
    - `speak()`: Retorna el sonido específico de la mascota.
- **Métodos concretos:**
    - `markSpecialCare(boolean)`: Marca si la mascota requiere un cuidado extra.
    - `getName()`: Obtiene el nombre de la mascota.
- **Subclases:**
    - `Dog`
    - `Cat`

---

## Interfaces Implementadas

### 1. ServicioFinanciero
- **Capacidad:** Define la lógica de **costos y recargos** inherentes a la mascota.
- **Métodos:**
    - `calcularCostoBase()`: Retorna la tasa base de servicio.
    - `obtenerRecargoEspecial()`: Calcula y retorna el monto del recargo si aplica.
- **Implementada por:**
    - `Dog`
    - `Cat`

### 2. Gestionable
- **Capacidad:** Define la gestión del **estado** o ciclo de vida del servicio (pendiente, completado/pagado).
- **Métodos:**
    - `marcarCompletado()`: Cambia el estado a pagado/finalizado.
    - `verificarEstadoCompletado()`: Retorna el estado actual del servicio.
- **Implementada por:**
    - `GroomingService`

### 3. Comunicable
- **Capacidad:** Define la capacidad de **enviar notificaciones** (email, texto) a los propietarios.
- **Métodos:**
    - `enviarNotificacion(String mensaje)`: Ejecuta el envío de un mensaje.
    - `verificarCanalActivo()`: Chequea la disponibilidad del medio de comunicación.
- **Implementada por:**
    - `GroomingService`

---
## Jerarquía de Clases
Pet (Clase Abstracta) ├── 🐶 Dog (Clase Concreta) │ └── + Implements ServicioFinanciero └── 🐱 Cat (Clase Concreta) └── + Implements ServicioFinanciero

La clase `GroomingService` implementa las interfaces `Gestionable` y `Comunicable`, y utiliza la composición de `Pet`.

---
## Principios SOLID Aplicados

1. **SRP (Single Responsibility Principle):**
    - **Aplicación:** Las responsabilidades están separadas en distintas unidades: `ServicioFinanciero` solo se encarga de costos y `Comunicable` solo de notificaciones, descargando esa lógica de las clases concretas.
2. **OCP (Open/Closed Principle):**
    - **Aplicación:** El sistema está abierto a la extensión (añadir `Rabbit` que herede de `Pet`) sin necesidad de modificar el código de la clase gestora (`GroomingService`).
3. **LSP (Liskov Substitution Principle):**
    - **Aplicación:** Se demostró al iterar sobre una lista de tipo `Pet` y llamar al método `speak()`. El comportamiento de `Dog.speak()` y `Cat.speak()` es consistente con el contrato de la clase base.
4. **ISP (Interface Segregation Principle):**
    - **Aplicación:** Se crearon tres interfaces específicas (`Gestionable`, `Comunicable`, `ServicioFinanciero`) para que ninguna clase tenga que implementar métodos que no usa.
5. **DIP (Dependency Inversion Principle):**
    - **Aplicación:** `GroomingService` (módulo de alto nivel) depende de abstracciones (`Pet`, `Gestionable`, `Comunicable`) y no de los detalles concretos.

---

## Compilación y Ejecución

```bash
# Navegar a la carpeta raíz del proyecto
cd bc-oop-java-3228970A-perez/

# Compilar todos los archivos .java dentro de semana-06
javac semana-06/**/*.java

# Ejecutar la clase Main (dependiendo de la estructura de paquetes)

java co.edu.sena.GroomingService.sem6.Main
```
---
## Salida esperada 
```java
===  DEMOSTRACIÓN DE ABSTRACCIÓN E INTERFACES ===

[LOG] Lana marcado/a para cuidado especial.
--- Sección 1: Polimorfismo y Servicio Financiero ---
> Lana (Perro) dice: ¡Guau, guau! ¿Es hipoalergénico?: true
> Bigotes (Gato) dice: Miau. Tipo de pelaje: Pelo Largo
[RECARGO DOG]: Recargo Especial (vía Interface) de $5000,00

--- Sección 2: Gestión de Estado y Comunicación ---
Estado inicial de POLY-D01 (¿Completado?): false
[GESTOR] Servicio POLY-D01 marcado como PAGADO.
[COMUNICADOR] Notificación enviada al dueño de Lana: ¡Su mascota Lana está lista para ser recogida!
Estado final de POLY-D01 (¿Completado?): true

--- Sección 3: Uso Directo de Comunicable ---
[COMUNICADOR] Notificación enviada al dueño de Lana: ¡Recuerde nuestra promoción de champú!

=== DEMOSTRACIÓN COMPLETA FINALIZADA ===
```
---
## Cambios Respecto a Semana 05
1) Clase Base a Abstracta: La clase Pet pasó de ser una clase base concreta a una clase abstracta, forzando la implementación polimórfica de speak() y calculateServiceFee().

2) Adición de Interfaces: Se introdujeron tres interfaces (ServicioFinanciero, Gestionable, Comunicable) para desagregar responsabilidades de las clases.

3) Múltiple Implementación: La clase GroomingService ahora implementa dos interfaces (Gestionable y Comunicable), demostrando la capacidad de adoptar múltiples funcionalidades.

---
## Mejoras Futuras
- Patrón Factory Method: Implementar un patrón de fábrica para la creación de objetos Dog o Cat para eliminar la dependencia de las clases concretas en Main.java (mejorando el DIP).

- Manejo de Excepciones: Introducir manejo de excepciones (try-catch) para operaciones financieras o de comunicación.