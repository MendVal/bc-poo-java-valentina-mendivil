# Semana 02 - Programación Orientada a Objetos (POO)

## Descripción

Esta semana el sistema fue expandido para gestionar colecciones de objetos y establecer **relaciones de asociación** y **dependencia** entre clases. Se implementaron tres clases nuevas (`Owner`, `ServicePackage`, `GroomingManager`) reutilizando los objetos base (`Pet` y `GroomingService`) de la Semana 01.

## Objetivos Cumplidos

- [x] Implementar 2 clases nuevas relacionadas al dominio (`Owner`, `ServicePackage`).
- [x] Crear y demostrar relaciones 1-a-N entre objetos (`Owner` a `Pet`).
- [x] Utilizar colecciones dinámicas (`ArrayList`) en `ServicePackage` y `GroomingManager`.
- [x] Implementar una clase gestora (`GroomingManager`) que centraliza el control.
- [x] Incluir validaciones básicas en constructores y métodos.

## Archivos Entregados

- `src/sem2/Owner.java` - Modela al cliente; usa `ArrayList<Pet>` para asociar mascotas.
- `src/sem2/ServicePackage.java` - Agrupa `GroomingService`s; usa `ArrayList` para calcular costos y duraciones totales.
- `src/sem2/GroomingManager.java` - Clase gestora que usa `ArrayList<String>` para mantener un registro de las acciones de venta.
- `src/sem2/Main.java` - Programa de demostración que integra todas las clases de `sem1` y `sem2`.

## Instrucciones de Ejecución

El proyecto debe ser compilado y ejecutado desde la clase principal de la Semana 02:

```bash
# Para IDEs (como IntelliJ): Ejecutar el método main de la clase
# co.edu.sena.GroomingService.sem2.Main
```

## Salida Esperada

=== SISTEMA INTEGRADO DE PELUQUERÍA CANINA MASCOTAS ELEGANTES ===

```
=== PERFIL DEL CLIENTE ===
ID: O-100
Nombre: Valentina Mendivil
Contacto: 3001234567
--- Mascotas Registradas ---
 -> Lana (Poodle)
 -> Ari (Beagle)

=== PERFIL DEL CLIENTE ===
ID: O-101
Nombre: Javier Rodriguez
Contacto: 3109876543
--- Mascotas Registradas ---
 -> Princesa (Pastor Alemán)

--- CONFIGURACIÓN DE PAQUETES ---

=== DETALLE DEL PAQUETE: Paquete Completo Lana ===
Código ref: PACK-VIP
Cantidad de servicios: 3
Precio Total: $77000,00
Duración Estimada: 95 min
======================================

--- EJECUCIÓN DE VENTA ---
[LOG] El manager Laura Torres vendió el paquete 'Paquete Completo Lana' al cliente Valentina Mendivil

--- REPORTE DE ACTIVIDAD (Manager: Laura Torres) ---
 > [LOG] El manager Laura Torres vendió el paquete 'Paquete Completo Lana' al cliente Valentina Mendivil

=== FIN DE LA DEMOSTRACIÓN ===
```