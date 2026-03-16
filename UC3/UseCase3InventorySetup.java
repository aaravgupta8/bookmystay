package UC3;

public class UseCase3InventorySetup {
    static void main() {
        System.out.println("======================================");
        System.out.println("      Welcome to Book My Stay");
        System.out.println("    Hotel Booking System v3.1");
        System.out.println("======================================");

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        RoomInventory inventory = new RoomInventory();

        inventory.addRoomType("Single Room", 10);
        inventory.addRoomType("Double Room", 15);
        inventory.addRoomType("Suite Room", 5);

        System.out.println("\n--- Initializing System State ---\n");

        singleRoom.displayDetails();
        System.out.println("Available: " + inventory.getAvailableRooms("Single Room"));
        System.out.println("--------------------------------------");

        doubleRoom.displayDetails();
        System.out.println("Available: " + inventory.getAvailableRooms("Double Room"));
        System.out.println("--------------------------------------");

        suiteRoom.displayDetails();
        System.out.println("Available: " + inventory.getAvailableRooms("Suite Room"));
        System.out.println("--------------------------------------");

        inventory.displayInventory();

        System.out.println("\n[System] Simulating updates to availability...");
        inventory.updateRoomAvailability("Single Room", 8);
        inventory.updateRoomAvailability("Double Room", 14);

        inventory.displayInventory();
    }
}