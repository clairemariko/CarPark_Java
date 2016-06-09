package com.codeclan.cs;

public class Car extends Transport{
	
	
	public Car(){
		
		super(new Horn());
	
	}
	
	public String toString(){
		return "Car: {Name: "+name+", Make: "+make+", Passengers: "+passengers+"}";
	}

}
