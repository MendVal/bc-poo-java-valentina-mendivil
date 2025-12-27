# Semana 07: Paquetes y Excepciones - Grooming Service

##  Información del Estudiante
- **Nombre**: Valentina Mendivil Correa
- **Ficha**: 3228973A
- **Dominio**: Grooming Service
- **Fecha**: 27/09/2025

##  Descripción del Proyecto

Este proyecto corresponde a un sistema de gestión para un servicio de grooming de mascotas.
Permite registrar citas de grooming validando la información de la mascota, el tipo de servicio
y la fecha de la cita, aplicando organización por paquetes y manejo de excepciones personalizadas.

El sistema fue desarrollado de manera incremental desde la Semana 01 hasta la Semana 07,
siguiendo los principios de Programación Orientada a Objetos.

## Estructura de Paquetes
```bash
com.co.edu.sena.GroomingService.sem7/
├── modelo/       - Clases del dominio que representan las entidades del sistema como mascotas, dueños y citas de grooming.
├── servicio/     - Contiene la lógica de negocio encargada de validar y registrar las citas de grooming.
├── excepciones/  - Incluye las excepciones personalizadas para manejar errores de negocio del sistema.
└── Main.java     - Punto de entrada de la aplicación donde se ejecutan los casos de prueba y el manejo de excepciones.
```
---
## ⚠️ Excepciones Personalizadas

### 1. PetNotRegisteredException
- **Tipo**: Checked (extends Exception)
- **Cuándo se lanza**: Se lanza cuando se intenta registrar una cita de grooming y la mascota es nula o no está registrada en el sistema.
- **Ejemplo**:  Cuando se crea un objeto GroomingAppointment con una mascota nula y se intenta registrar la cita desde el servicio.

### 2. InvalidServiceException
- **Tipo**: Checked (extends Exception)
- **Cuándo se lanza**: Se lanza cuando el tipo de servicio de grooming es nulo o está vacío.
- **Ejemplo**: Cuando se intenta registrar una cita con un servicio vacío ("") o sin especificar el tipo de grooming.

### 3. AppointmentNotAvailableException
- **Tipo**: Checked (extends Exception)
- **Cuándo se lanza**: Se lanza cuando la fecha de la cita es nula, está vacía o no es válida.
- **Ejemplo**: Cuando se intenta registrar una cita sin fecha o con una fecha vacía.

---
##  Cómo Ejecutar
```bash
cd semana-07
javac -d bin src/com/[tudominio]/*/*.java src/com/[tudominio]/*.java
java -cp bin com.[tudominio].Main
```

### Desde IntelliJ IDEA
1. Abrir el proyecto.
2. Navegar a `Main.java`.
3. Ejecutar el método `main`.

-----
##  Funcionalidades Implementadas
- Organización del código en paquetes.
- Creación de excepciones personalizadas.
- Validaciones de reglas de negocio.
- Manejo de errores con try-catch-finally.
- Cinco casos de prueba en la clase Main.

---
## Cambios Aplicados desde Semana 06
- Reorganización del proyecto en paquetes.
- Implementación de excepciones checked.
- Manejo de errores en la capa de servicio.
- Pruebas controladas desde Main.

---
##  Decisiones de Diseño
#### Excepciones Marcadas (Checked Exceptions)

Se decidió utilizar excepciones marcadas (extends Exception) porque los errores manejados corresponden a reglas de negocio del sistema, como citas inválidas, servicios incorrectos o mascotas no registradas.
Este enfoque obliga a que dichas excepciones sean tratadas explícitamente mediante try-catch, garantizando un manejo controlado de errores.

#### Separación por Paquetes

El proyecto fue organizado en paquetes para mejorar la mantenibilidad y la claridad del código:

- El paquete modelo contiene las clases que representan las entidades del dominio.

- El paquete servicio centraliza la lógica de negocio y las validaciones.

- El paquete excepciones agrupa las excepciones personalizadas del sistema.
Esta separación facilita la escalabilidad del sistema y el mantenimiento del código.

#### Validaciones en la Capa de Servicio

Las validaciones de los datos se implementaron en la clase GroomingServiceManager para asegurar que las reglas de negocio se controlen en un solo punto.
De esta forma, se evita duplicar validaciones y se mantiene el código más limpio.

#### Manejo de Errores en la Clase Main

La captura de excepciones se realizó en la clase Main, ya que es el punto de entrada del sistema y permite mostrar mensajes claros al usuario final sin interrumpir la ejecución del programa.

---
## Salida esperada 
```bash
--- Caso 1: Cita válida ---
Appointment registered successfully for pet: Lana
Fin del caso 1

--- Caso 2: Mascota no registrada ---
❌ Error: Pet is not registered
Fin del caso 2

--- Caso 3: Servicio inválido ---
❌ Error: Invalid grooming service
Fin del caso 3

--- Caso 4: Fecha no disponible ---
❌ Error: Appointment date not available
Fin del caso 4

--- Caso 5: Cita nula ---
 ❌ Error: Pet is not registered
Fin del caso 5

Proceso finalizado
```

