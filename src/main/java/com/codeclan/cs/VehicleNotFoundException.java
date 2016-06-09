package com.codeclan.cs;

public class VehicleNotFoundException extends Exception {

	
	public VehicleNotFoundException(Transport t){
		super("Sorry your vheicle has been knicked"+ t);
	}
	
	
}
