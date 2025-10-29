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
/*
Este archivo ejecuta la aplicación.
Crea varias instancias de servicios de grooming.
Muestra la información de cada servicio llamando al método showInfo().
Se puede ampliar para recibir datos por teclado o almacenar más servicios dinámicamente.
*/