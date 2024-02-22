package edu.mu.vehicleEnums;

public enum StartMechanism {
	KEYSTART,
	PUSHSTART,
	KICKSTART;
	
	public static String toString(StartMechanism startMechanism) {
	    switch (startMechanism) {
	        case KEYSTART:
	            return "KEYSTART";
	        case PUSHSTART:
	        	return "PUSHSTART";
	        case KICKSTART:
	        	return "KICKSTART";
	        default:
	            return null;
	    }
	}
}
