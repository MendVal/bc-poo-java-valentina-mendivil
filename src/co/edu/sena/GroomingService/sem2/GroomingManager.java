package co.edu.sena.GroomingService.sem2;

import java.util.ArrayList;

/**
 * Clase GroomingManager (Gestor):
 * Esta clase actúa como el administrador del sistema.
 * Su función es interactuar con Dueños y Paquetes, y llevar un registro (log) de acciones.
 */
public class GroomingManager {

    private String managerId;
    private String managerName;

    // Historial de acciones realizadas por el manager (Requisito de colección)
    private ArrayList<String> actionLog;

    public GroomingManager(String managerId, String managerName) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.actionLog = new ArrayList<>();
    }

    // Método principal: Asigna un paquete a un dueño y registra la acción
    public void assignPackageToOwner(Owner owner, ServicePackage servicePackage) {
        // Creamos el mensaje de registro
        String message = "[LOG] El manager " + managerName +
                " vendió el paquete '" + servicePackage.getPackageName() +
                "' al cliente " + owner.getName();

        // Mostramos en consola y guardamos en el historial
        System.out.println(message);
        actionLog.add(message);
    }

    // Muestra todo lo que ha hecho el manager durante la ejecución
    public void showDailyReport() {
        System.out.println("\n--- REPORTE DE ACTIVIDAD (Manager: " + managerName + ") ---");
        if (actionLog.isEmpty()) {
            System.out.println("No hay actividad registrada hoy.");
        } else {
            for (String log : actionLog) {
                System.out.println(" > " + log);
            }
        }
    }
}
/*
 * Fin de la clase GroomingManager.java
 * * Mi trabajo en esta clase fue:
 * 1. Implementar un **ArrayList** (actionLog) para guardar un historial de acciones.
 * 2. Crear el método principal para que el Manager **asigne paquetes** a los dueños,
 * interactuando con los objetos Owner y ServicePackage.
 * 3. Añadir el método **showDailyReport** para mostrar el contenido de esa colección.
 */