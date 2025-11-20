# Semana 03 - Programación Orientada a Objetos (POO)

## Descripción

El Dominio de gestión de peluquería fue refactorizado para implementar los siguientes principios de POO:

1.  **Encapsulación:** Todos los atributos de las clases son privados (`private`).
2.  **Sobrecarga:** Se añadieron múltiples constructores para crear objetos con diferentes conjuntos de datos.
3.  **Validación:** Se implementó lógica de validación en los *setters* y constructores para asegurar que el sistema solo acepte datos válidos (ej. precios mayores a cero).

## Objetivos Cumplidos

- [x] Refactorización completa de 5 clases con atributos `private`.
- [x] Implementación de `getters` y `setters` con validación.
- [x] Implementación de Sobrecarga de Constructores (mínimo 2 por clase).
- [x] Inclusión de Validaciones de negocio mediante `IllegalArgumentException`.
- [x] Creación de `MEJORAS.md` para documentar los cambios.

## Archivos Entregados

- `src/sem3/Pet.java`
- `src/sem3/GroomingService.java`
- `src/sem3/Owner.java`
- `src/sem3/ServicePackage.java`
- `src/sem3/GroomingManager.java`
- `src/sem3/Main.java` (Programa de prueba)
- `src/sem3/MEJORAS.md` (Documento de cambios)
- `src/sem3/README.md`

## Salida Esperada

Al ejecutar la clase `Main.java`, se espera ver la prueba de los constructores, la captura exitosa de los errores de validación y la demostración de un flujo de negocio coherente:

## Salida Esperada

```
=== SEMANA 3: PRUEBA DE ENCAPSULACIÓN Y SOBRECARGA ===

--- 1. PROBANDO CONSTRUCTORES SOBRECARGADOS ---
 Pet creado con constructor mínimo: Lana (Edad: 0 años)
 Owner creado con constructor mínimo: Camila López
 Servicio creado con constructor básico: Baño Rápido Express

-------------------------------------------------
--- 2. PROBANDO VALIDACIONES (ERRORES ESPERADOS) ---
 Validación exitosa (Pet): La edad debe ser un número positivo.
 Validación exitosa (Service): El precio base debe ser mayor a cero.
 Validación exitosa (Owner): El nombre del dueño debe tener al menos 3 caracteres.

--- 3. PRUEBA DE INTEGRACIÓN ---
Integración exitosa. Costo final de Paquete Premium: $77000,00

=== DATOS DEL DUEÑO ===
ID: O-100
Nombre: Valentina Mendivil
Teléfono: 3001234567
--- Mascotas asociadas ---
- Princesa (Poodle)

=== DEMOSTRACIÓN SEMANA 3 FINALIZADA ===
```