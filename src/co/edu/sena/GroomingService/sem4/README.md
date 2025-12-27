#  Semana 04 - Programación Orientada a Objetos (POO): Herencia

##  Información del Estudiante
- **Nombre**: Valentina Mendivil
- **Ficha**: *3228973A*
- **Dominio**: Mascotas Elegantes

---
## Descripción

El Dominio de gestión de peluquería fue refactorizado para implementar los siguientes principios de POO:

1.  **Identificación de Jerarquías ("Es Un Tipo De"):** Se definieron clases más específicas (`Dog`, `Cat`) que heredan de una clase general (`Pet`).
2.  **Encapsulación y Herencia:** Se utilizaron atributos **`private`** en la clase padre (`Pet`) y **`getters`** para mantener la encapsulación, asegurando que las subclases accedan a los datos de forma controlada.
3.  **Herencia:** Se utilizó la palabra clave `extends` para transferir atributos y métodos de la Superclase (`Pet`) a las Subclases.
4.  **Constructores Padre:** Se usó la instrucción `super()` dentro de los constructores de las subclases para inicializar la porción de código heredada.
5.  **Sobrescritura:** Se aplicó la anotación **`@Override`** al método `calculateGroomingCost()` para implementar lógica de negocio específica y a **`toString()`** para formatear la salida de información.
6.  **Polimorfismo Básico:** Se implementó una lista de la Clase Padre para almacenar objetos de diferentes Clases Hijas, demostrando el comportamiento polimórfico en tiempo de ejecución.

---

## Objetivos Cumplidos

- [x] Identificación y creación de una Clase Padre (`Pet`).
- [x] Creación de mínimo 2 Subclases (`Dog`, `Cat`) con `extends`.
- [x] Implementación de atributos **`private`** en la Clase Padre para reforzar la encapsulación. (Actualizado)
- [x] Uso correcto de `super()` en los constructores de las Clases Hijas.
- [x] Sobrescritura (`@Override`) de al menos dos métodos: **`calculateGroomingCost()`** y **`toString()`**. (Actualizado)
- [x] Demostración de polimorfismo mediante una colección (`List<Pet>`) en `Main.java`.
- [x] Creación de `JERARQUIA.md` para documentar el diseño de la herencia.

---

## Archivos Entregados (sem4)

- `src/sem4/Pet.java` (Clase Padre)
- `src/sem4/Dog.java` (Subclase 1)
- `src/sem4/Cat.java` (Subclase 2)
- `src/sem4/Main.java` (Programa de prueba y demostración de Polimorfismo)
- `src/sem4/JERARQUIA.md` (Documento de la Jerarquía)
- `src/sem4/README.md` (Este documento)

---

## Salida Esperada

## Salida Esperada
```
=== SEMANA 4: DEMOSTRACIÓN DE HERENCIA Y POLIMORFISMO  EN MASCOTAS ELEGANTES ===

---  PRUEBA DE POLIMORFISMO Y CÁLCULOS ---
--- Pet Information ---
Name: Lana
Owner: Valentina M.
Age: 3 years
Raza: Mini Poodle
Juguete Favorito: Chew Toy
Licencia #: LANA-01
Costo Peluquería: $35.0
Lana (Mini Poodle) dice: Woof! Woof!
---------------------------------
--- Pet Information ---
Name: Princesa
Owner: Javier R.
Age: 8 years
Raza: Pastor Alemán
Juguete Favorito: Frisbee
Licencia #: PRI-02
Costo Peluquería: $35.0
Princesa (Pastor Alemán) dice: Woof! Woof!
---------------------------------
--- Pet Information ---
Name: Mora
Owner: Carlos P.
Age: 5 years
Raza: Golden Retriever
Juguete Favorito: Bone
Licencia #: MORA-03
Costo Peluquería: $35.0
Mora (Golden Retriever) dice: Woof! Woof!
---------------------------------
--- Pet Information ---
Name: Bigotes
Owner: Camila L.
Age: 6 years
Tipo de Pelo: long
Manejo Especial: Sí
Costo Peluquería: $35.0
Bigotes está ronroneando a gusto.
---------------------------------

INGRESOS TOTALES POR SERVICIOS: $140,00

=== DEMOSTRACIÓN SEMANA 4 FINALIZADA ===
```