package edu.mu;

public class Main {
    public static void main(String[] args) {
        // Instantiate the VehicleManager
        VehicleManager vehicleManager = new VehicleManager();

        // Attempt to initialize the stock from the CSV file
        boolean isStockInitialized = vehicleManager.initializeStock();
        if (isStockInitialized) {
            System.out.println("Vehicle stock has been successfully initialized.");
        } else {
            System.out.println("Failed to initialize vehicle stock. Please check the file path and file format.");
            return; // Exit if there is an issue with initializing stock
        }

        // Display information about all vehicles
        System.out.println("\nDisplaying information for all vehicles:");
        vehicleManager.displayAllVehicleInformation();

        // Display information about all cars
        System.out.println("\nDisplaying information for all cars:");
        vehicleManager.displayAllCarInformation();

        // Display information about all trucks
        System.out.println("\nDisplaying information for all trucks:");
        vehicleManager.displayAllTruckInformation();

        // Display information about all SUVs
        System.out.println("\nDisplaying information for all SUVs:");
        vehicleManager.displayAllSUVInformation();

        // Display information about all motorbikes
        System.out.println("\nDisplaying information for all motorbikes:");
        vehicleManager.displayAllMotorBikeInformation();

        // Additional operations based on your homework requirements can be performed here
        // For example, adding, removing vehicles, or displaying vehicles with specific conditions

        // Example: Add a new vehicle (you need to replace this with actual vehicle details)
        // Vehicle newVehicle = new Car("Brand", "Model", 2022, 25000, VehicleColor.BLACK, FuelType.GASOLINE, 30, 1500, 4, 55, StartMechanism.PUSHSTART);
        // boolean isAdded = vehicleManager.addVehicle(newVehicle);
        // if (isAdded) {
        //     System.out.println("New vehicle added successfully.");
        // } else {
        //     System.out.println("Failed to add new vehicle.");
        // }

        // Finally, save the updated vehicle list back to the CSV file
        boolean isListSaved = vehicleManager.saveVehicleList();
        if (isListSaved) {
            System.out.println("Vehicle list has been successfully saved.");
        } else {
            System.out.println("Failed to save the vehicle list.");
        }
    }
}
