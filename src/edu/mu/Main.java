package edu.mu;

public class Main {
    public static void main(String[] args) {
        // Instantiate the VehicleManager
        VehicleManager vehicleManager = new VehicleManager();

        boolean isStockInitialized = vehicleManager.initializeStock();
        if (isStockInitialized) {
            System.out.println("Vehicle stock has been successfully initialized.");
        } else {
            System.out.println("Failed to initialize vehicle stock. Please check the file path and file format.");
            return; // Exit if there is an issue with initializing stock
        }

                System.out.println("\nDisplaying information for all vehicles:");
        vehicleManager.displayAllVehicleInformation();

                System.out.println("\nDisplaying information for all cars:");
        vehicleManager.displayAllCarInformation();

        System.out.println("\nDisplaying information for all trucks:");
        vehicleManager.displayAllTruckInformation();

        System.out.println("\nDisplaying information for all SUVs:");
        vehicleManager.displayAllSUVInformation();

     
        System.out.println("\nDisplaying information for all motorbikes:");
        vehicleManager.displayAllMotorBikeInformation();

        // Finally, save the updated vehicle list back to the CSV file
        boolean isListSaved = vehicleManager.saveVehicleList();
        if (isListSaved) {
            System.out.println("Vehicle list has been successfully saved.");
        } else {
            System.out.println("Failed to save the vehicle list.");
        }
    }
}
