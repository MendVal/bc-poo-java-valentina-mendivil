package co.edu.sena.GroomingService.sem3;

import java.util.ArrayList;

public class ServicePackage {

    /*
     * Archivo: ServicePackage.java
     * Dominio: Sistema de Gestión de Peluquería Canina Mascotas Elegantes
     * Semana 3: Implementación de Encapsulación y Sobrecarga de Constructores
     */

    // Atributos privados
    private String packageCode;
    private String packageName;
    private ArrayList<GroomingService> services;

    // CONSTRUCTOR 1: Mínimo (Sobrecargado)
    public ServicePackage(String packageName) {
        // Llama al constructor completo usando ID temporal
        this("PACK-TEMP", packageName);
    }

    // CONSTRUCTOR 2: Completo
    public ServicePackage(String packageCode, String packageName) {
        setPackageName(packageName); // Llama al setter con validación
        this.packageCode = packageCode;
        this.services = new ArrayList<>();
    }

    // ================== GETTERS Y SETTERS CON VALIDACIÓN ==================

    // Setter con VALIDACIÓN: Nombre debe ser descriptivo.
    public void setPackageName(String packageName) {
        if (packageName == null || packageName.trim().length() < 5) {
            throw new IllegalArgumentException("El nombre del paquete debe ser descriptivo (mínimo 5 caracteres).");
        }
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void addService(GroomingService s) {
        if (s != null) {
            services.add(s);
        }
    }

    public double getTotalCost() {
        double total = 0;
        for (GroomingService s : services) {
            total += s.calculateFinalCost();
        }
        return total;
    }
}
/*
 * Fin de la clase ServicePackage.java
 */