package com.codeclan.cs;

public class Bicycle extends Transport {


	private int id;
	private int currentSpeed;
	private String name;
	private int currentGear;
	private int gears;
	private String colour;
	public int getId() {
		return id;
	}
	
	
	//first constructor//
	public Bicycle(){
		super(new Bell());
		gears = 10;
		name = "super fly";
		colour ="red";
		
	}	
	
	//second constructor//
	public Bicycle(String colour){
		this();
		this.colour = colour;
	}
	
	
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentGear() {
		return currentGear;
	}
	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}


	public String getColour() {
	 return this.colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}

	public String toString(){
		return "Bicycle: {Name: "+name+", Colour: "+colour+", Gears: "+gears+"}";
	}
	
	
}
