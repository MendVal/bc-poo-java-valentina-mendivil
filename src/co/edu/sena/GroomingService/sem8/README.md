# Semana 08: Colecciones y Generics – Grooming Service

##  Información del Estudiante
- **Nombre**: Valentina Mendivil
- **Ficha**: *3228973A*
- **Dominio**: Mascotas Elegantes
- **Fecha**: *(11/12/2025)*

---

##  Descripción del Proyecto

El sistema **Grooming Service** permite gestionar citas de grooming para mascotas, asociándolas a sus dueños, servicios, fechas y precios.  
El proyecto ha sido desarrollado de forma incremental desde semanas anteriores, manteniendo el mismo dominio y reglas de negocio.

**Esta semana**: Refactoricé el sistema para usar colecciones profesionales (`HashMap`, `ArrayList`) en lugar de arrays, agregando operaciones de búsqueda eficiente, filtrado y estadísticas, aplicando correctamente **Generics** y manteniendo el manejo de excepciones.

---

## Colecciones Utilizadas

### HashMap
- `Map<String, GroomingAppointment>` – Búsqueda rápida de citas por código
- `Map<String, List<GroomingAppointment>>` – Agrupación de citas por tipo de servicio

### ArrayList
- `List<GroomingAppointment>` – Historial ordenado de citas de grooming
- `List<Pet>` – Lista de mascotas registradas en el sistema

---

##  Operaciones Implementadas

### CRUD con Colecciones
- ✅ Agregar citas con validación de duplicados
- ✅ Buscar citas por código en tiempo O(1) usando HashMap
- ✅ Actualizar información de una cita existente
- ✅ Eliminar citas por código

### Filtrado
- ✅ Filtrar citas por tipo de servicio (ej. “Baño”, “Corte”)
- ✅ Filtrar citas por mascota
- ✅ Filtrar citas por rango de precio

### Estadísticas
- ✅ Total de citas registradas
- ✅ Ingresos totales del servicio
- ✅ Precio promedio de las citas
- ✅ Conteo de citas por tipo de servicio

---

## Cómo Ejecutar

### Desde terminal:
```bash
cd semana-08
javac -d bin src/com/co/edu/sena/GroomingService/sem8/*/*.java src/com/co/edu/sena/GroomingService/sem8/*.java
java -cp bin co.edu.sena.GroomingService.sem8.Main
```
### Desde IntelliJ IDEA:
- Abrir el proyecto en IntelliJ IDEA
- Clic derecho sobre Main.java
- Seleccionar Run Main.main()

---

##  Capturas de Pantalla

### ▶️ Ejecución del sistema (Main)
![img_2.png](docs/img_2.png)


---
## Nomenclatura

### Colecciones

| Estructura | Convención | Ejemplo |
|------------|------------|---------|
| HashMap | `[entidades]Por[Clave]` | `citasPorCodigo` |
| ArrayList | `lista[Entidades]` o `historial[Entidades]` | `historialCitas, listaMascotas` |
| Set | `[entidades]Unicas` | `serviciosUnicos` |

---
## Generics
// ✅ CORRECTO - Uso de Generics
private Map<String, GroomingAppointment> citasPorCodigo = new HashMap<>();
private List<GroomingAppointment> historialCitas = new ArrayList<>();

// ❌ INCORRECTO - Tipos raw (sin Generics)
private Map citasPorCodigo = new HashMap();
private List historialCitas = new ArrayList();


