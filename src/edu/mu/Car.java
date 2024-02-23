package edu.mu;

import edu.mu.vehicleEnums.FuelType;
import edu.mu.vehicleEnums.StartMechanism;
import edu.mu.vehicleEnums.VehicleColor;

public class Car extends Vehicle {

	public Car(String model, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, int cylinders, double gasTankCapacity, StartMechanism startType, double mass) {
		super(model, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateMaintenaceCost(double distance) {
		// TODO Auto-generated method stub
		double maintenanceCost = 0;
		maintenanceCost = distance*this.getMass()*(2024-this.getModelYear())*this.getCylinders()*0.0005;
		return maintenanceCost;
	}

	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		// TODO Auto-generated method stub
		double fuelEfficiency = 0;
		fuelEfficiency = this.getCylinders()*this.getGasTankCapacity()*fuelPrice / distance * 0.003;
		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Starting...\n"+StartMechanism.toString(this.getStartType())+"\n");
	}

}
