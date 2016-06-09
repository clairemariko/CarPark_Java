package com.codeclan.cs;

import static org.junit.Assert.*;

import org.junit.Test;



public class BicycleTest {

	
	
	@Test
	public void testBicycleHasGears(){
	Bicycle bicycleOne = new Bicycle();	
	assertEquals(10, bicycleOne.getGears());
	}

	@Test
	public void testBicycleColourGreen(){
		Bicycle bicycleTwo = new Bicycle("green");
		assertEquals("green", bicycleTwo.getColour());
	}
	
	
	
	
	
}
