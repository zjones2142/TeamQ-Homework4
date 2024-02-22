package edu.mu.vehicleEnums;

public enum VehicleColor {
	BLACK,
	RED,
	BLUE,
	BROWN,
	WHITE,
	YELLOW,
	GRAY;
	
	public static String toString(VehicleColor vehicleColor) {
	    switch (vehicleColor) {
	        case BLACK:
	            return "BLACK";
	        case RED:
	        	return "RED";
	        case BLUE:
	        	return "BLUE";
	        case BROWN:
	        	return "BROWN";
	        case WHITE:
	        	return "WHITE";
	        case YELLOW:
	        	return "YELLOW";
	        case GRAY:
	        	return "GRAY";
	        default:
	            return null;
	    }
	}
}