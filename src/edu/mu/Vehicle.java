package edu.mu;
import edu.mu.vehicleEnums.VehicleColor;
import edu.mu.vehicleEnums.FuelType;
import edu.mu.vehicleEnums.StartMechanism;

public abstract class Vehicle {
	protected String model;
	protected String make;
	protected long modelYear;
	protected double price;
	protected VehicleColor color;
	protected FuelType fuelType;
	protected double mileage;
	protected double mass;
	protected int cylinders;
	protected double gasTankCapacity;
	protected StartMechanism startType;
	
	protected Vehicle(String model, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super();
		this.model = model;
		this.make = make;
		this.modelYear = modelYear;
		this.price = price;
		this.color = color;
		this.fuelType = fuelType;
		this.mileage = mileage;
		this.mass = mass;
		this.cylinders = cylinders;
		this.gasTankCapacity = gasTankCapacity;
		this.startType = startType;
	}
	
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public long getModelYear() {
		return modelYear;
	}
	public void setModelYear(long modelYear) {
		this.modelYear = modelYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public VehicleColor getColor() {
		return color;
	}
	public void setColor(VehicleColor color) {
		this.color = color;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public double getGasTankCapacity() {
		return gasTankCapacity;
	}
	public void setGasTankCapacity(double gasTankCapacity) {
		this.gasTankCapacity = gasTankCapacity;
	}
	public StartMechanism getStartType() {
		return startType;
	}
	public void setStartType(StartMechanism startType) {
		this.startType = startType;
	}
	public String toString() {
		return " Make: "+this.getMake()+"\n"+
				" Model: "+this.getModel()+"\n"+
				" Year: "+Long.toString(this.getModelYear())+"\n"+
				" Price: $"+Double.toString(this.getPrice())+"\n"+
				" Color: "+VehicleColor.toString(this.getColor())+"\n"+
				" Fuel: "+FuelType.toString(this.getFuelType())+"\n"+
				" Mileage: "+Double.toString(this.getMileage())+"\n"+
				" Mass: "+Double.toString(this.getMass())+"\n"+
				" Num Cylinders: "+Integer.toString(this.getCylinders())+"\n"+
				" Gas Capacity: "+Double.toString(this.getGasTankCapacity())+" gal\n";
	}
	
	//abstract methods to be overridden by subclasses
	public abstract double calculateMaintenaceCost(double distance);
	public abstract double calculateFuelEfficiency(double distance, double fuelPrice);
	public abstract void startEngine();
}
