package com.codeclan.cs;

public class Bus extends Transport{
	
	public Bus(){
		
		super(new Horn());
	
	}
	
	public String toString(){
		return "Bus: {Name: "+name+", Make: "+make+", Passengers: "+passengers+"}";
	}

}



