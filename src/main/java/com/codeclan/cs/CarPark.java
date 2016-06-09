package com.codeclan.cs;

import java.util.ArrayList;

public class CarPark {

	
	private ArrayList<Transport> carpark;
	
	public CarPark(){
		carpark = new ArrayList<Transport>();
	}
	
	public boolean park(Transport t){
		return carpark.add(t);
	}
	
	public ArrayList<Transport> getCarPark(){
		return carpark;
	}
	
	public boolean exit(Transport t) throws VehicleNotFoundException{
		return false;
		
	}
}
