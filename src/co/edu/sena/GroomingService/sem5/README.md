#  Semana 05 - Programación Orientada a Objetos (POO): Polimorfismo

## Descripción

Esta semana se profundizó en la Programación Orientada a Objetos implementando las tres formas principales de **Polimorfismo**: Sobrescritura (Overriding), Sobrecarga (Overloading) y Polimorfismo Dinámico. Se migró la clase padre `Pet` a una clase abstracta para establecer un contrato de comportamiento obligatorio, extendiendo la funcionalidad de la clase `GroomingService`.

## Objetivos Cumplidos

- [x] Implementar Abstracción en la clase padre (`Pet` abstracta).
- [x] Implementar Sobrescritura de métodos (`@Override speak()` y `calculateServiceFee()`) en `Dog` y `Cat`.
- [x] Implementar Sobrecarga de métodos (`calculateFinalCost()` con diferentes firmas) en `GroomingService`.
- [x] Demostrar Polimorfismo Dinámico con un `ArrayList<Pet>`.
- [x] Sustituir `showInfo()` por el método canónico `@Override toString()`.

---

## Archivos Entregados

| Archivo | Contenido |
| :--- | :--- |
| `src/Pet.java` | **MODIFICADO:** Clase Padre Abstracta, define `protected petType` y métodos abstractos. |
| `src/Dog.java` | **NUEVO:** Clase Hija, implementa tarifa del 10%. |
| `src/Cat.java` | **NUEVO:** Clase Hija, implementa tarifa del 15%. |
| `src/GroomingService.java` | **MODIFICADO:** Usa el objeto `Pet` polimórfico y contiene la Sobrecarga de `calculateFinalCost()`. |
| `src/Main.java` | **MODIFICADO:** Programa de demostración que prueba Overriding, Overloading y Dynamic Binding. |
| `docs/POLIMORFISMO.md` | **NUEVO:** Análisis conceptual y justificación de las implementaciones de polimorfismo. |

---

## Conceptos Aplicados

* **Abstracción:** Uso de clases y métodos abstractos para definir contratos.
* **Herencia:** `Dog` y `Cat` heredan de `Pet`.
* **Polimorfismo Dinámico (Sobrescritura):** Permite a `Dog` y `Cat` tener comportamientos y reglas de negocio únicos, ejecutados a través de un `ArrayList<Pet>`.
* **Polimorfismo Estático (Sobrecarga):** Múltiples versiones del método `calculateFinalCost()`.
* **Encapsulación:** Atributos `private` y `protected` con acceso a través de *getters* y *setters*.

---

## Salida Esperada

La salida esperada de la ejecución de `Main.java` demuestra el funcionamiento del Polimorfismo Dinámico (speak, tarifas) y la Sobrecarga (`calculateFinalCost`), generando el siguiente resultado en la consola:

```java
=== DEMOSTRACIÓN DE POLIMORFISMO ===

--- POLIMORFISMO DINÁMICO (speak() y toString()) ---

--- Representación de Objetos (toString) ---
--- DATOS MASCOTA (Perro) ---
Nombre: Lana
Raza: Poodle
Edad: 3 años
Propietario: Valentina M.
Cuidado Especial: NO
---------------------------
--- DATOS MASCOTA (Gato) ---
Nombre: Bigotes
Raza: Siamés
Edad: 2 años
Propietario: Carlos P.
Cuidado Especial: NO
---------------------------

--- Comportamiento speak() ---
> Lana (Perro) dice: ¡Guau, guau! ¿Es hipoalergénico?: true
> Bigotes (Gato) dice: Miau. Tipo de pelaje: Pelo Corto
> Princesa (Perro) dice: ¡Guau, guau! ¿Es hipoalergénico?: false
> Mishu (Gato) dice: Miau. Tipo de pelaje: Pelo Largo
----------------------------------------
--- SOBRESCRITURA (Tarifas Polimórficas) ---
Costo final POLY-D01 (Perro - Tasa 10%): $55000,00
Costo final POLY-C01 (Gato - Tasa 15%): $46000,00
----------------------------------------
---  SOBRECARGA (calculateFinalCost) ---
Costo Base de POLY-D01: $55000,00
Costo con 15% descuento: $46750,00
  [REC] Recargo por Mascota Ansiosa: $15000.0
Costo con Recargo por Ansiedad: $70000,00

=== DEMOSTRACIÓN COMPLETA DE POLIMORFISMO FINALIZADA ===

