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

## Actividad 1 — Identificación de Objetos

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

## Actividad 2 — Comparación de Paradigmas


**Programación estructurada:**

* Se basa en funciones y variables sueltas.
* La información no está agrupada.
* Enfocada en lo que se hace (pasos para ejecutar).
* Es más difícil organizar proyectos grandes.

**Programación orientada a objetos (POO):**

* Se basa en clases y objetos.
* La información está agrupada (atributos + métodos).
* Enfocada en quién actúa (objetos del mundo real).
* Permite organizar mejor proyectos grandes y reusabilidad.


###  Programación Estructurada

```java
String codigo = "GROOM-001";
String mascota = "Lana";
String tipo = "Baño y corte";

void mostrarServicio(String c, String m, String t){
    System.out.println(c);
    System.out.println(m);
    System.out.println(t);
}

mostrarServicio(codigo, mascota, tipo);
```

###  Programación Orientada a Objetos

```java
class GroomingService {
    String codigo;
    String mascota;
    String tipo;

    GroomingService(String c, String m, String t){
        codigo = c;
        mascota = m;
        tipo = t;
    }

    void mostrarInfo(){
        System.out.println(codigo);
        System.out.println(mascota);
        System.out.println(tipo);
    }
}

GroomingService s1 = new GroomingService("GROOM-001", "Lana", "Baño y corte");
s1.mostrarInfo();
```

---

## Actividad 3 — Primera Clase Simple

En esta actividad se define una clase llamada GroomingService, la cual representa un servicio de peluquería canina.
Se incluyen tres atributos principales: código del servicio, nombre de la mascota y tipo de servicio.
Además, se crea un constructor para inicializar estos datos y un método que permite mostrar la información registrada.

### `GroomingService.java`

```java
public class GroomingService {
    String serviceCode;
    String petName;
    String serviceType;

    public GroomingService(String serviceCode, String petName, String serviceType) {
        this.serviceCode = serviceCode;
        this.petName = petName;
        this.serviceType = serviceType;
    }

    public void showInfo() {
        System.out.println("=== Servicio Grooming ===");
        System.out.println("Código: " + serviceCode);
        System.out.println("Mascota: " + petName);
        System.out.println("Servicio: " + serviceType);
        System.out.println("-------------------------");
    }
}
```

### `Main.java`

```java
public class Main {
    public static void main(String[] args) {
        GroomingService g1 = new GroomingService("GROOM-001", "Lana", "Baño y corte");
        GroomingService g2 = new GroomingService("GROOM-002", "Princesa", "Deslanado");
        GroomingService g3 = new GroomingService("GROOM-003", "Ari", "Baño medicado");

        g1.showInfo();
        g2.showInfo();
        g3.showInfo();
    }
}
```

---

## Actividad 4 — Múltiples Objetos
En esta actividad se reutiliza la clase GroomingService para crear cinco instancias distintas, cada una con información propia relacionada con un servicio real de peluquería canina.
Posteriormente, se invoca el método correspondiente para mostrar la información de cada servicio en consola.

```java
public class Main {
    public static void main(String[] args) {
        GroomingService g1 = new GroomingService("GROOM-001", "Lana", "Baño y corte");
        GroomingService g2 = new GroomingService("GROOM-002", "Princesa", "Deslanado");
        GroomingService g3 = new GroomingService("GROOM-003", "Ari", "Baño medicado");
        GroomingService g4 = new GroomingService("GROOM-004", "Mora", "Spa completo");
        GroomingService g5 = new GroomingService("GROOM-005", "Leo", "Corte según raza");

        g1.showInfo();
        g2.showInfo();
        g3.showInfo();
        g4.showInfo();
        g5.showInfo();
    }
}
```
---

## Decisiones de Diseño

- **¿Por qué elegí estos atributos?**
    - Elegí `serviceCode`, `petName` y `serviceType` para la clase `GroomingService` porque representan la información mínima necesaria para identificar y diferenciar un servicio dentro de la peluquería.
    - `serviceCode` permite distinguir cada servicio.
    - `petName` lo asocia con su dueño y facilita el seguimiento de la mascota.
    - `serviceType` describe la atención que recibirá la mascota y permite organizar los servicios ofrecidos.


- **¿Qué validaciones implementé?**
    - `serviceCode` debería ser único para evitar duplicados.
    - `petName` no debe estar vacío para que el registro sea válido.
    - `serviceType` debe corresponder a los servicios reales ofrecidos por la peluquería, como baño, corte, spa, deslanado, etc.


- **¿Qué relaciones identifiqué?**
    - Cada `GroomingService` se relaciona con una `Mascota`.
    - Una `Mascota` pertenece a un `Dueño` y puede tener múltiples servicios.
    - Futuramente, se podría relacionar un `GroomingService` con un `Peluquero` que realiza el servicio y con los `Accesorios` o productos utilizados.

---

##  Dificultades Encontradas
- Al principio, fue un poco difícil organizar la estructura de las clases y decidir qué atributos y métodos correspondían a cada objeto.
- Inicialmente olvidé crear un método para mostrar la información de los servicios, lo que dificultaba verificar los datos en consola.
- Al crear varias instancias, algunos códigos de servicio se duplicaron por error, lo que mostró la importancia de usar identificadores únicos.
- Alinear los servicios con los ofrecidos realmente por la peluquería requirió revisar que los nombres y tipos fueran coherentes.

---




