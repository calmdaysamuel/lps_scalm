package org.howard.edu.lsp.assignment7.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.howard.edu.lsp.assignment7.tollbooth.FordTruck;
import org.howard.edu.lsp.assignment7.tollbooth.ToyotaTruck;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TruckTest {

	

	@BeforeEach
	void init() {

	}
	
	@Test
	@DisplayName("Test for getting truck axles")
	public void testGetAxles() {
		Truck ford = new FordTruck(5, 1200, "Ford");
		Truck toyota = new ToyotaTruck(10, 2200, "Toyota");
		
		assertEquals(ford.getName(), "Ford");
		assertEquals(toyota.getName(), "Toyota");
	}

	@Test
	@DisplayName("Test for getting truck weight")
	public void testGetWeight() {
		Truck ford = new FordTruck(5, 1200, "Ford");
		Truck toyota = new ToyotaTruck(10, 2200, "Toyota");
		
		assertEquals(ford.getWeight(), 1200);
		assertEquals(toyota.getWeight(), 2200);
	}

	
	@Test
	@DisplayName("Test for getting truck name")
	public void testGetName() {
		Truck ford = new FordTruck(5, 1200, "Ford");
		Truck toyota = new ToyotaTruck(10, 2200, "Toyota");
		
		assertEquals(ford.getAxles(), 5);
		assertEquals(toyota.getAxles(), 10);

	}
}
