package edu.mu.vehicleEnums;

public enum FuelType {
	GASOLINE,
	DIESEL,
	ELECTRIC,
	HYBRID;
	
	public static String toString(FuelType fuelType) {
	    switch (fuelType) {
	        case GASOLINE:
	            return "GASOLINE";
	        case DIESEL:
	        	return "DIESEL";
	        case ELECTRIC:
	        	return "ELECTRIC";
	        case HYBRID:
	        	return "HYBRID";
	        default:
	            return null;
	    }
	}
}
