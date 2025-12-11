package co.edu.sena.GroomingService.sem2;

import co.edu.sena.GroomingService.sem1.GroomingService;
import java.util.ArrayList;

/**
 * Clase ServicePackage (Paquete):
 * Agrupa varios servicios individuales (como Baño + Corte) en una sola venta.
 * Usa un ArrayList para manejar dinámicamente la cantidad de servicios.
 */
public class ServicePackage {

    private String packageCode;
    private String packageName;

    // Lista que almacena los servicios incluidos en este paquete
    private ArrayList<GroomingService> services;

    public ServicePackage(String packageCode, String packageName) {
        this.packageCode = packageCode;
        this.packageName = packageName;
        this.services = new ArrayList<>(); // Lista listapara recibir servicios
    }

    // Agrega un servicio al paquete validando que no sea nulo
    public void addService(GroomingService s) {
        if (s != null) {
            services.add(s);
        }
    }

    // Lógica importante: Recorre los servicios y suma sus costos individuales
    public double getTotalCost() {
        double total = 0;
        for (GroomingService s : services) {
            total += s.calculateFinalCost(); // Usamos el método de la Semana 1
        }
        return total;
    }

    // Calcula cuánto tiempo tomará todo el paquete sumando las duraciones
    public int getTotalDuration() {
        int totalMinutes = 0;
        for (GroomingService s : services) {
            totalMinutes += s.getDurationMinutes();
        }
        return totalMinutes;
    }

    public String getPackageName() {
        return packageName;
    }

    // Muestra el resumen del paquete con los totales calculados
    public void showPackageInfo() {
        System.out.println("\n=== DETALLE DEL PAQUETE: " + packageName + " ===");
        System.out.println("Código ref: " + packageCode);
        System.out.println("Cantidad de servicios: " + services.size());
        System.out.printf("Precio Total: $%.2f%n", getTotalCost());
        System.out.println("Duración Estimada: " + getTotalDuration() + " min");
        System.out.println("======================================\n");
    }
}
/*
 * Fin de la clase ServicePackage.java
 * * Mi trabajo en esta clase fue:
 * 1. Definir el concepto de **Paquete de Servicios** y usar un **ArrayList<GroomingService>** * para coleccionar los servicios individuales.
 * 2. Crear la lógica para agregar un servicio (`addService`).
 * 3. Implementar métodos para recorrer la colección y calcular el **costo total** y la **duración total** del paquete.
 */