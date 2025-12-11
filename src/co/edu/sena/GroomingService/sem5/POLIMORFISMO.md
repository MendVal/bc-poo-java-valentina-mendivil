#  Análisis de Polimorfismo - GroomingService

## 1. Sobrecarga (Overloading)

La Sobrecarga se implementó en la clase `GroomingService.java`.

### Métodos Sobrecargados
- `calculateFinalCost()`: Versión base (sin argumentos).
- `calculateFinalCost(double discountPercentage)`: Versión con descuento.
- `calculateFinalCost(String reason, double extraCharge)`: Versión con recargo.

### Justificación
Tiene sentido en el dominio de servicios porque el costo final de un servicio de grooming no siempre es el precio base más la tarifa estándar.
1.  La versión base encapsula la regla principal (Precio Base * Tasa Polimórfica).
2.  Las versiones sobrecargadas ofrecen flexibilidad para **aplicar promociones** (descuento) o **manejar situaciones extraordinarias** (recargo por agresión/tamaño). El cliente de la clase (`Main.java`) puede elegir la versión correcta sin conocer los nombres internos de los diferentes métodos de cálculo.

---

## 2. Sobrescritura (Overriding)

La Sobrescritura se implementó a través de la herencia para definir el comportamiento y las reglas de negocio de cada tipo de mascota.

### Tabla Comparativa

| Método | Clase Padre (`Pet` Abstracta) | Subclase 1 (`Dog`) | Subclase 2 (`Cat`) |
| :--- | :--- | :--- | :--- |
| **`calculateServiceFee()`** | `abstract` (Contrato) | Retorna **`1.10`** (Tasa 10%) | Retorna **`1.15`** (Tasa 15%) |
| **`speak()`** | `abstract` (Contrato) | Retorna `"¡Guau, guau!"` | Retorna `"Miau."` |

---
### Código Ejemplo
```java
// Clase Padre Pet.java
public abstract double calculateServiceFee(); 
public abstract String speak(); 

// Subclase Cat.java
@Override
public double calculateServiceFee() {
    return 1.15; // Lógica específica de Gatos
}

// Subclase Dog.java
@Override
public String speak() {
    return this.getName() + " (Perro) dice: ¡Guau, guau!"; // Comportamiento específico
}
```

### Explicación
En el código anterior, la lista mascotas EnEspera solo ve objetos de tipo Pet. Sin embargo, al llamar a p.speak(), el compilador (JRE) identifica la clase real del objeto que está apuntando la variable p y ejecuta el método sobrescrito específico (Dog.speak() o Cat.speak()). Esto se llama Polimorfismo Dinámico.

---
### Beneficios
Flexibilidad: Permite al GroomingService recibir y procesar cualquier objeto que sea un Pet (sea Dog, Cat, o futuras subclases como Bird o Rabbit) sin modificar su código interno, ya que todos garantizan la existencia de calculateServiceFee().

Extensibilidad: Si se añade una nueva clase (ej: ExoticPet), solo necesitamos crear la subclase e implementar sus métodos sobrescritos. El ArrayList<Pet> y la clase GroomingService seguirán funcionando sin cambios.

Mantenibilidad: Se centralizan las reglas de negocio específicas. Por ejemplo, la tarifa para perros se define y se modifica solo en Dog.java, haciendo el código más organizado y fácil de depurar.