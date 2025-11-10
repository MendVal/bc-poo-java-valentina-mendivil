# Semana 01 — Programación Orientada a Objetos (POO)

**Estudiante:** Valentina Mendivil Correa

**Ficha:** 3228973A

**Dominio Asignado:** Peluquería Canina "Mascotas Elegantes"

---

##  Contexto del Dominio

**Tipo de Negocio:** Peluquería Canina

**Nombre Comercial:** Mascotas Elegantes

**Ubicación:** Bogotá, Chapinero

**Especialidad:** Baño, corte, arreglo estético, spa canino, venta de accesorios

### Descripción Breve

Mascotas Elegantes es una peluquería especializada en el cuidado estético de perros y gatos. Ofrece baño medicado, corte según raza, limpieza de oídos y dientes, corte de uñas, arreglo de pelaje, deslanado, spa con masajes y aromaterapia. Cuenta con 3 peluqueros certificados, 2 mesas de grooming profesional, zona de secado con equipos especializados, productos hipoalergénicos y tienda de accesorios. Atiende 180 mascotas mensuales.

---

## Objetivos de la Semana 01

1. Identificar objetos del mundo real en el contexto de una peluquería canina.
2. Comprender diferencias entre programación estructurada y POO.
3. Reconocer conceptos: clase, objeto, atributo, método.
4. Crear primera clase simple en Java aplicada al dominio.

---

## 1. Identificación de Objetos Principales

Se identifican **5 objetos principales** dentro del dominio.

### Objeto 1: Mascota

**¿Qué es?** Animal que recibe servicios de la peluquería.

**Atributos:** nombre, especie, raza, edad, tamaño, dueño.

**Comportamientos:** ser registrada, recibir servicio, ser evaluada.

### Objeto 2: Servicio de Grooming

**¿Qué es?** Atención estética programada.

**Atributos:** código, tipo, fecha, hora, peluquero, precio.

**Comportamientos:** agendar, realizar, facturar.

### Objeto 3: Peluquero

**¿Qué es?** Persona que realiza el grooming.

**Atributos:** nombre, documento, experiencia, especialidad, turno.

**Comportamientos:** atender mascota, realizar corte, asesorar.

### Objeto 4: Accesorio

**¿Qué es?** Producto para venta.

**Atributos:** nombre, tipo, precio, tamaño, color.

**Comportamientos:** vender, registrar inventario.

### Objeto 5: Cita

**¿Qué es?** Reserva de servicio.

**Atributos:** código, dueño, mascota, tipo servicio, fecha, hora.

**Comportamientos:** agendar, confirmar, cancelar.

---

## 2. Identificación de Dominio
**Objeto Principal: GroomingService**
Justificación: Representa la transacción fundamental del negocio. Este objeto encapsula toda la información necesaria para registrar, costear y seguir el estado de un servicio prestado al cliente.

#### Atributos identificados:
- serviceCode (String)
- petName (String)
- serviceType (String)
- basePrice (double)
- durationMinutes (int)
- isPaid (boolean)

#### Comportamientos:

- showInfo() (Método void para impresión).
- calculateFinalCost() (Método que retorna un valor calculado).
- getServiceCode() (Método Getter).
- setIsPaid() (Método Setter).

**Objeto Secundario: Pet**

- Justificación: Es la entidad esencial que recibe la atención. Sus características (edad, nombre, raza) son cruciales para determinar los requisitos de cuidado y el tipo de servicio.

- Relación con objeto principal: Asociación (Usa-A). Un objeto GroomingService está conceptualmente ligado a un Pet. En la implementación, el servicio utiliza el nombre (getName()) de la mascota para completar su propio registro.


---
## 3. Comparación de Paradigmas


**Programación estructurada:**

* Se basa en funciones y variables sueltas.
* La información no está agrupada.
* Enfocada en lo que se hace (pasos para ejecutar).
* Es más difícil organizar proyectos grandes.

```java
// Programación Estructurada: Datos y funciones separados

// DATOS SUELTOS para el servicio GROOM-001
String codigo = "GROOM-001";
String mascota = "Lana";
String tipo = "Baño y Corte";
int duracion = 90; // Dato adicional, no está agrupado

// FUNCIÓN SEPARADA de los datos
void mostrarServicio(String c, String m, String t, int d){
    System.out.println("Código: " + c);
    System.out.println("Mascota: " + m);
    System.out.println("Servicio: " + t);
    System.out.println("Duración: " + d + " minutos");
}

// Invocación: Los datos se pasan como argumentos sueltos
mostrarServicio(codigo, mascota, tipo, duracion);
```

**Programación orientada a objetos (POO):**

* Se basa en clases y objetos.
* La información está agrupada (atributos + métodos).
* Enfocada en quién actúa (objetos del mundo real).
* Permite organizar mejor proyectos grandes y reusabilidad.


```java 
class GroomingService {
    double basePrice; // Atributo

    // Método que opera sobre el atributo
    public double calculateFinalCost() {
        final double TAX_RATE = 0.10;
        return this.basePrice * (1 + // Programación Orientada a Objetos: Clase GroomingService

        class GroomingService {
            // ATRIBUTOS (Datos agrupados)
            String serviceCode;
            String petName;
            String serviceType;
            // La duración podría ser otro atributo aquí

            // CONSTRUCTOR
            GroomingService(String c, String m, String t){
                this.serviceCode = c;
                this.petName = m;
                this.serviceType = t;
            }

            // MÉTODO (Lógica agrupada)
            void mostrarInfo(){
                System.out.println("=== Servicio Grooming ===");
                System.out.println("Código: " + this.serviceCode);
                System.out.println("Mascota: " + this.petName);
                System.out.println("Servicio: " + this.serviceType);
            }
        }

// Creación y uso: El objeto es autónomo
        GroomingService s1 = new GroomingService("GROOM-001", "Lana", "Baño y Corte");
        s1.mostrarInfo();TAX_RATE);
    }
}
// La función (método) está encapsulada con el dato (basePrice).
```
---
### 4. Ventajas de POO en "Mascotas Elegantes"
- Modelado Fiel: Permite crear objetos Pet y GroomingService que reflejan directamente la realidad del negocio, haciendo el código más intuitivo.

- Encapsulación: Atributos como el precio (basePrice) o el estado de pago (isPaid) están protegidos, controlando su modificación únicamente a través de métodos (setIsPaid), lo cual es vital para la gestión financiera.

- Extensibilidad: Si el sistema necesita manejar un nuevo tipo de mascota o servicio, simplemente se crea o extiende una clase sin alterar la lógica de las clases existentes.

### Ventajas específicas de mi dominio
**Peluquería Canina “Mascotas Elegantes”**

- Representación fiel del negocio: Cada mascota o servicio se modela como un objeto de la vida real.

- Menor repetición de código: Se pueden crear varios servicios o mascotas sin lógica duplicada.

- Fácil de extender: Nuevos servicios (spa, masajes, etc.) se agregan fácilmente con nuevas clases o métodos.

- Mejor organización: Los datos de cada servicio y mascota están agrupados dentro de sus clases.

- Mantenimiento sencillo: Si cambia la forma de mostrar o procesar un servicio, se edita en un solo lugar.

---


## 5. Decisiones de Diseño

**¿Por qué elegí estos atributos?**
- Los atributos basePrice (double), durationMinutes (int), y isPaid (boolean) fueron seleccionados específicamente para cumplir con los requisitos obligatorios de tipos de datos del ejercicio (numérico decimal/entero y booleano), además de modelar aspectos financieros y operativos reales del servicio de peluquería.
- El atributo ageYears en Pet permite implementar la lógica funcional isOldPet().

**¿Qué validaciones implementé?**

- Encapsulación (Getter/Setter): Se implementaron getters (getName, getServiceCode) y setters (setIsPaid) para proteger el acceso directo a los atributos privados y controlar su modificación.
- Lógica Funcional: El método isOldPet() en Pet introduce una validación lógica que diferencia a las mascotas mayores, y calculateFinalCost() asegura un cálculo uniforme de costos.

**¿Qué relaciones identifiqué?**

- Se implementó una Asociación (Usa-A). La clase Main actúa como puente, obteniendo el nombre del objeto Pet (p.getName()) para inicializar el objeto GroomingService, ligando así el servicio a la mascota.

---

## 6. Dificultades Encontradas
- Al principio, fue un poco difícil organizar la estructura de las clases y decidir qué atributos y métodos correspondían a cada objeto.
- La dificultad principal fue resolver el error de compilación inicial (Cannot resolve method y private access) al intentar usar el objeto Pet dentro de Main.java para crear GroomingService.
- Inicialmente, no se pudo acceder al name de la mascota (p1.name) desde la clase Main para pasarlo al constructor de GroomingService debido a que el atributo name es privado.
- Al aumentar los atributos a 5 o más en GroomingService, resultó un desafío manejar la lista de 5 argumentos en el constructor y asegurar que cada uno se inicializara correctamente usando la palabra clave this. para diferenciar entre el argumento y el atributo






