package edu.mu;

import java.util.*;

public class VehicleManager {
	private final static double distance = 300;
	private final static double fuelPrice = 3.25;
	public ArrayList <Vehicle> vehicleList;
	
	//Todo: rb vvvvvvvvvvvvvv
	public boolean initializeStock() {
		return false;
		/*
		 * o Reads the data from a CSV file located at vehicleFilePath. Initialize each
		 * of the Vehicle objects (Hint: Consider using the split() method for
		 * tokenization. Check the type of each object and instantiate the exact class.
		 * Store the objects into vehicleList). o Return true if the read file and
		 * initialization are successful. o Return false if cannot read/find the file.
		 */
	}
	
	//Todo: zj (all "display-Information" methods) vvvvvvvvvvvvvv
	public void displayAllCarInformation() {
		/*
		 * o This will display the information, including maintenance cost, fuel
		 * efficiency, and how the vehicle starts, of all the cars present in the
		 * vehicleList. o If the vehicle is not found, then print an appropriate error
		 * message.
		 */
		int numNOTCar = 0;
		for(int i=0;i<vehicleList.size();i++) {
			if(isVehicleType(vehicleList.get(i), Car.class)) {
				System.out.println("Car "+i+":\n"+vehicleList.get(i).toString());
			}
			else {
				numNOTCar++;
			}
		}
		if(numNOTCar == vehicleList.size()) {
			System.out.println("No Cars Found\n");
		}
	}
	
	public void displayAllTruckInformation() {
		/*
		 * o This will display the information, including maintenance cost, fuel
		 * efficiency, and how the vehicle starts, of all the trucks present in the
		 * vehicleList. o If the vehicle is not found, then print an appropriate error
		 * message.
		 */
		int numNOTTruck = 0;
		for(int i=0;i<vehicleList.size();i++) {
			if(isVehicleType(vehicleList.get(i), Truck.class)) {
				System.out.println("Truck "+i+":\n"+vehicleList.get(i).toString());
			}
			else {
				numNOTTruck++;
			}
		}
		if(numNOTTruck == vehicleList.size()) {
			System.out.println("No Trucks Found\n");
		}
	}
	
	public void displayAllSUVInformation() {
		/*
		 * o This will display the information, including maintenance cost, fuel
		 * efficiency, and how the vehicle starts, of all the SUVs present in the
		 * vehicleList. o If the vehicle is not found, then print an appropriate error
		 * message.
		 */
		int numNOTSUV = 0;
		for(int i=0;i<vehicleList.size();i++) {
			if(isVehicleType(vehicleList.get(i), SUV.class)) {
				System.out.println("SUV "+i+":\n"+vehicleList.get(i).toString());
			}
			else {
				numNOTSUV++;
			}
		}
		if(numNOTSUV == vehicleList.size()) {
			System.out.println("No SUVs Found\n");
		}
	}
	
	public void displayAllMotorBikeInformation() {
		/*
		 * o This will display the information, including maintenance cost, fuel
		 * efficiency, and how the vehicle starts, of all the motor bikes present in the
		 * vehicleList. o If the vehicle is not found, then print an appropriate error
		 * message.
		 */
		int numNOTBike = 0;
		for(int i=0;i<vehicleList.size();i++) {
			if(isVehicleType(vehicleList.get(i), MotorBike.class)) {
				System.out.println("MotorBike "+i+":\n"+vehicleList.get(i).toString());
			}
			else {
				numNOTBike++;
			}
		}
		if(numNOTBike == vehicleList.size()) {
			System.out.println("No MotorBikes Found\n");
		}
	}
	
	public void displayVehicleInformation(Vehicle v) {
		/*
		 * o This will display the vehicle information, including maintenance cost, fuel
		 * efficiency, and how the vehicle starts, of a Vehicle v which is present in
		 * the vehicleList. o If the vehicle is not found, then print an appropriate
		 * error message.
		 */
		if (vehicleList.contains(v)) {
			System.out.println(v.toString());//vehicle class default vars
			System.out.println(" Maintenance Cost: $"+v.calculateMaintenaceCost(distance)+"\n"+
								" Fuel Efficiency: "+v.calculateFuelEfficiency(distance, fuelPrice)+"\n");
		}
		else {
			System.out.println("Vehicle not found\n");
		}
	}
	
	public void displayAllVehicleInformation() {
		for(int i=0;i<vehicleList.size();i++) {
			System.out.println("Vehicle "+i+":\n"+vehicleList.get(i).toString());
			System.out.println(" Maintenance Cost: $"+vehicleList.get(i).calculateMaintenaceCost(distance)+"\n"+
					" Fuel Efficiency: "+vehicleList.get(i).calculateFuelEfficiency(distance, fuelPrice)+"\n");
		}
	}
	
	//Todo: jm vvvvvvvvvvvvvv
	public boolean removeVehicle(Vehicle vehicle) {
		return false;
		/*
		 * o Removes the given vehicle from the vehicleList. o Returns true if the
		 * removal is successful, false otherwise.
		 */
	}
	
	//Todo: jm vvvvvvvvvvvvvv
	public boolean addVehicle(Vehicle vehicle) {
		return false;
		/*
		 * o Adds the given vehicle into the vehicleList. o Returns true if the addition
		 * is successful, false otherwise.
		 */
	}
	
	//Todo: rb vvvvvvvvvvvvvv
	public boolean saveVehicleList() {
		return false;
		/*
		 * o Saves the updated vehicleList back to the CSV file located at
		 * vehicleFilePath. o Overwrites the existing file with the updated data. o
		 * Returns true if the saving is successful, false otherwise (file does not
		 * exist, or file empty).
		 */
	}
	
	//Todo: jm vvvvvvvvvvvvvv
	private boolean isVehicleType(Vehicle v, Class clazz) {
		return false;
		/*o Checks if the given vehicle is a specific type of Vehicle subclass.
		o If the given vehicle object is the object type, then return true, otherwise return false.
		o Use instanceof or getClass() to count the number.
		o Call example: isVehicleType(vehicleObj, Truck.class);*/
	}
	
	//Todo: mj (all "get___" methods {should be pretty similar}) vvvvvvvvvvvvvv
	public int getNumberOfVehiclesByType(Class clazz) {
		return 0;
		/*
		 * o Returns the number of objects in the vehicle list based on the object
		 * vehicle type o Use the isVehicleType(Vehicle v, Class clazz) method. o Call
		 * example: getNumberOfVehichlesByType(SUV.class);
		 */
	}
	public Vehicle getVehicleWithHighestMaintenanceCost(double distance) {
		return null;
			/*
			 * o Calculate the maintenance cost for each vehicle in the vehicle list and
			 * return the vehicle with the highest maintenance cost. o If multiple vehicles
			 * have the same maintenance cost, randomly return one of the vehicles (Use the
			 * Random class for random selection).
			 */
	}
		
	public Vehicle getVehicleWithLowestMaintenanceCost(double distance) {
		return null;
			/*
			 * o Calculate the maintenance cost for each vehicle in the vehicle list and
			 * return the vehicle with the lowest maintenance cost. o If multiple vehicles
			 * have the same maintenance cost, randomly return one of the vehicles (Use the
			 * Random class for random selection).
			 */
	}

	public ArrayList<Vehicle> getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice) {
		return vehicleList;
			/*
			 * o Calculate the fuel efficiencies for each vehicle in the vehicle list and
			 * return the vehicle with the highest fuel efficiency. o If multiple vehicles
			 * have the same highest fuel efficiency, return vehicles with the same highest
			 * fuel efficiency in an ArrayList.
			 */
	}
		
	public ArrayList<Vehicle> getVehicleWithLowestFuelEfficiency(double distance, double fuelPrice) {
		return vehicleList;
			/*
			 * Calculate the fuel efficiencies for each vehicle in the vehicle list and
			 * return the vehicle with the lowest fuel efficiency. If multiple vehicles have
			 * the same lowest fuel efficiency, return vehicles with the same lowest fuel
			 * efficiency in an ArrayList.
			 */
	}

	public double getAverageFuelEfficiencyOfSUVs(double distance,double fuelPrice) {
		return fuelPrice;
			/*
			 * Calculate the average/mean of the fuel efficiency of SUVs in the vehicle
			 * list. Use the isVehicleType(Vehicle v, Class clazz) method. If no SUVs exist
			 * in the list return -1.0 as an error code that indicates there is no SUVs in
			 * the list to calculate the average fuel efficiency
			 */
	}
}
