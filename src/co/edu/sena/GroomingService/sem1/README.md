# Semana 01 - Programación Orientada a Objetos (POO)

# Semana 08: Colecciones y Generics – Grooming Service

##  Información del Estudiante
- **Nombre**: Valentina Mendivil
- **Ficha**: *3228973A*
- **Dominio**: Mascotas Elegantes

## Descripción

Esta semana se trabajó en la introducción a la POO. Se identificaron objetos del dominio "Peluquería Canina Mascotas Elegantes", se compararon paradigmas de programación estructurada y orientada a objetos, y se implementó la primera clase `GroomingService` con múltiples instancias en Java.

##  Objetivos Cumplidos

- [x] Implementar clase principal del dominio (`GroomingService`)
- [x] Crear programa de demostración (`Main.java`)
- [x] Documentar análisis del dominio (`ANALISIS.md`)
- [x] Comprender diferencias entre paradigmas de programación

##  Archivos Entregados

- `src/GroomingService.java` - Clase principal con 6 atributos y 4 métodos, modelando el servicio de estética.
- `src/Pet.java` - Clase secundaria con 5 atributos y 4 métodos, modelando la mascota.
- `src/Main.java` - Programa de demostración que instancia 5 objetos de cada clase y llama a todos los métodos.
- `docs/ANALISIS.md` - Análisis conceptual, comparación de paradigmas y justificación de las decisiones de diseño.

##  Instrucciones de Ejecución

```bash
cd src
javac *.java
java Main
```
---
## Salida Esperada
```java
=== SISTEMA DE GESTIÓN DE PELUQUERÍA CANINA MASCOTAS ELEGANTES ===

--- PET ---

--- DATOS MASCOTA ---
Nombre: Lana
Raza: Poodle
Edad: 3 años
Propietario: Valentina M.
Cuidado Especial: NO

--- DATOS MASCOTA ---
Nombre: Princesa
Raza: Pastor Alemán
Edad: 8 años
Propietario: Javier R.
Cuidado Especial: NO

--- DATOS MASCOTA ---
Nombre: Mora
Raza: Golden Retriever
Edad: 5 años
Propietario: Carlos P.
Cuidado Especial: NO

--- DATOS MASCOTA ---
Nombre: Leo
Raza: Pastor aleman
Edad: 2 años
Propietario: Sofia L.
Cuidado Especial: NO

--- DATOS MASCOTA ---
Nombre: Ari
Raza: Beagle
Edad: 1 años
Propietario: Laura M.
Cuidado Especial: NO
[LOG] Princesa marcado/a para cuidado especial.
[LOG] Leo marcado/a para cuidado especial.

¿Princesa es una mascota mayor (7+ años)?: true
¿Ari es una mascota mayor (7+ años)?: false

----------------------------------------

--- GROOMING SERVICE ---

=== Servicio Grooming (GROOM-001) ===
Mascota: Lana
Tipo: Baño y Corte
Duración: 90 minutos
Precio Base: $45000,00
Estado de Pago: PENDIENTE

=== Servicio Grooming (GROOM-002) ===
Mascota: Princesa
Tipo: Deslanado Especial
Duración: 120 minutos
Precio Base: $80000,00
Estado de Pago: PENDIENTE

=== Servicio Grooming (GROOM-003) ===
Mascota: Mora
Tipo: Spa Relajante
Duración: 150 minutos
Precio Base: $65000,00
Estado de Pago: PENDIENTE

=== Servicio Grooming (GROOM-004) ===
Mascota: Leo
Tipo: Cepillado y Uñas
Duración: 60 minutos
Precio Base: $30000,00
Estado de Pago: PENDIENTE

=== Servicio Grooming (GROOM-005) ===
Mascota: Ari
Tipo: Baño Rápido
Duración: 75 minutos
Precio Base: $35000,00
Estado de Pago: PENDIENTE
[CALCULO] Costo final de GROOM-005 (incl. tasa): $38500,00
[GETTER] Código del Servicio 2: GROOM-002

--- ESTADOS FINALES ---
=== Servicio Grooming (GROOM-001) ===
Mascota: Lana
Tipo: Baño y Corte
Duración: 90 minutos
Precio Base: $45000,00
Estado de Pago: PAGADO

=== Servicio Grooming (GROOM-003) ===
Mascota: Mora
Tipo: Spa Relajante
Duración: 150 minutos
Precio Base: $65000,00
Estado de Pago: PAGADO

=== Servicio Grooming (GROOM-005) ===
Mascota: Ari
Tipo: Baño Rápido
Duración: 75 minutos
Precio Base: $35000,00
Estado de Pago: PAGADO

=== DEMOSTRACIÓN COMPLETA FINALIZADA ===
```
---
## Conceptos Aplicados
- Clases y objetos en Java

- Atributos y métodos

- Instanciación de múltiples objetos

- Diferencias entre programación estructurada y orientada a objetos

