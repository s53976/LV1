package LogisticManager;

public class DemoApplication {
        public static void main(String[] args) {
            // Erstellen von Car und Shirt Objekten
            Car car1 = new Car("VW Golf", "Withe", 2100);
            Shirt shirt1 = new Shirt("Nike", 50, "Red");

            // Erstellen von LogisticManager
            Logisticmanager logisticManager = new Logisticmanager();

            // Hinzufügen der Objekte zur Liste
            logisticManager.addMoveable(car1);
            logisticManager.addMoveable(shirt1);


            // Alle Objekte zu einem Ziel bewegen
            logisticManager.moveAll("Graz");
        }
}
