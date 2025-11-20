package co.edu.sena.GroomingService.sem3;

import java.util.ArrayList;

public class GroomingManager {
    /*
     * Archivo: GroomingManager.java
     * Dominio: Sistema de Gestión de Peluquería Canina Mascotas Elegantes
     * Semana 3: Implementación de Encapsulación y Sobrecarga de Constructores
     */

    // Atributos privados
    private String managerId;
    private String managerName;
    private ArrayList<String> actionLog;

    // CONSTRUCTOR 1: Mínimo (Sobrecargado)
    public GroomingManager(String managerName) {
        // Llama al constructor completo usando un ID temporal
        this("GM-TEMP", managerName);
    }

    // CONSTRUCTOR 2: Completo
    public GroomingManager(String managerId, String managerName) {
        setManagerName(managerName); // Llama al setter con validación
        this.managerId = managerId;
        this.actionLog = new ArrayList<>();
    }

    // ================== GETTERS Y SETTERS CON VALIDACIÓN ==================

    // Setter con VALIDACIÓN: Nombre no puede estar vacío.
    public void setManagerName(String managerName) {
        if (managerName == null || managerName.trim().length() < 3) {
            throw new IllegalArgumentException("El nombre del manager es requerido.");
        }
        this.managerName = managerName;
    }

    public void assignPackageToOwner(Owner owner, ServicePackage servicePackage) {
        String message = "[MANAGER] " + managerName + " asignó el paquete '" +
                servicePackage.getPackageName() + "' al dueño " + owner.getName();

        System.out.println(message);
        writeToLog(message); // Uso de método auxiliar privado
    }

    // Método auxiliar privado (Requisito: Métodos auxiliares privados)
    private void writeToLog(String message) {
        actionLog.add(message);
    }

    public void showDailyReport() {
        System.out.println("\n=== REPORTE DIARIO DEL MANAGER: " + managerName + " ===");
        for (String log : actionLog) {
            System.out.println(" > " + log);
        }
    }
}
/*
 * Fin de la clase GroomingManager.java
 */