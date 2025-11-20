# 🛠️ Documento de Mejoras - Semana 03: Encapsulación y Sobrecarga

## Objetivo
El objetivo principal de la refactorización en la Semana 03 fue implementar los principios de la Programación Orientada a Objetos (POO): **Encapsulación completa**, **Sobrecarga de Constructores** y **Validación de Datos**.

##  Resumen de Cambios Aplicados

| Clase | Encapsulación | Sobrecarga de Constructores | Validaciones Implementadas |
| :--- | :--- | :--- | :--- |
| **Pet.java** | Todos los atributos son `private`. | Constructor (nombre, raza) y Completo. | Edad (`>= 0`), Nombre y Raza (`no vacíos`). |
| **GroomingService.java** | Todos los atributos son `private`. | Constructor Básico (sin código) y Completo. | Precio Base (`> 0`), Duración (`> 5 minutos`). |
| **Owner.java** | Todos los atributos son `private`. | Constructor (nombre, teléfono) y Completo (incluye ID). | Nombre (`min 3 caracteres`), Teléfono (`min 7 dígitos`). |
| **ServicePackage.java** | Todos los atributos son `private`. | Constructor (nombre) y Completo (incluye código). | Nombre del paquete (`min 5 caracteres`). |
| **GroomingManager.java** | Todos los atributos son `private`. | Constructor (nombre) y Completo (incluye ID). | Nombre del manager (`no vacío`). |

##  Aplicación de Conceptos Clave

* **Encapsulación:** Se utilizó el modificador `private` en todos los atributos y se expuso su manipulación a través de `getters` y `setters` públicos.
* **Sobrecarga de Constructores:** Se implementaron al menos dos constructores por clase para ofrecer flexibilidad en la creación de objetos, utilizando la palabra clave `this()` para reutilizar el código del constructor más completo.
* **Validaciones:** Las reglas de negocio se incluyeron en los métodos `setters` y constructores. Si los datos no cumplen con la regla (ej. edad negativa), se lanza una excepción (`IllegalArgumentException`) para garantizar la **integridad de los datos**.
* **Métodos Auxiliares Privados:** Se incluyó un método `private` (`writeToLog`) en la clase `GroomingManager` para encapsular el manejo del registro de actividades.