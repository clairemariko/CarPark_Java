package com.codeclan.cs;

public abstract class Transport {

	protected String make;
	protected String name;
	protected String colour;
	protected int passengers;
	protected SoundSource noise;
	
	
	public Transport(){
		make = "Honda";
	}
	
	public Transport( SoundSource noise){
		this.noise = noise;
	}

	public String makesound(){
		return noise.makeSound();
	}

	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getPassengers() {
		return passengers;
	}


	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	public String toString(){
		return "Transport: {Make: "+make+", Name: "+name+", Colour: "+colour+", Passengers: "+passengers+"}";
	}
	
	
	
}
