package org.howard.edu.lsp.assignment7.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.howard.edu.lsp.assignment7.tollbooth.FordTruck;
import org.howard.edu.lsp.assignment7.tollbooth.OrangeTollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.TollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.ToyotaTruck;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TollBoothTest {


	TollBooth otb = new OrangeTollBooth(5, 7, "Orange County Toll Booth");
	Truck ford = new FordTruck(5, 1200, "Ford");
	Truck toyota = new ToyotaTruck(10, 2200, "Toyota");
	@BeforeEach
	void init() {
	}
	
	@Test
	@DisplayName("Test for caculating toll")
	public void testCalculateToll() {
		otb = new OrangeTollBooth(5, 7, "Orange County Toll Booth");
		ford = new FordTruck(5, 1200, "Ford");
		toyota = new ToyotaTruck(10, 2200, "Toyota");
		
		assertEquals(otb.calculateToll(ford), 39.0);
		assertEquals(otb.calculateToll(toyota), 78.0);
	}

	@Test
	@DisplayName("Test for displaying data")
	public void testDisplayData() {
		otb = new OrangeTollBooth(5, 7, "Orange County Toll Booth");
		ford = new FordTruck(5, 1200, "Ford");
		toyota = new ToyotaTruck(10, 2200, "Toyota");
		
		otb.calculateToll(ford);
		assertEquals(otb.displayData(), "Totals since last collection - Receipts: $39.0 Trucks:1");
		otb.calculateToll(toyota);
		assertEquals(otb.displayData(), "Totals since last collection - Receipts: $117.0 Trucks:2");
		otb.calculateToll(ford);
		assertEquals(otb.displayData(), "Totals since last collection - Receipts: $156.0 Trucks:3");
		otb.calculateToll(toyota);
		assertEquals(otb.displayData(), "Totals since last collection - Receipts: $234.0 Trucks:4");
	}

	
	@Test
	@DisplayName("Test for resetting toll")
	public void testReset() {
		otb = new OrangeTollBooth(5, 7, "Orange County Toll Booth");
		ford = new FordTruck(5, 1200, "Ford");
		toyota = new ToyotaTruck(10, 2200, "Toyota");
		
		otb.calculateToll(ford);
		otb.calculateToll(toyota);
		otb.calculateToll(toyota);
		otb.reset();
		
		assertEquals(otb.displayData(), "Totals since last collection - Receipts: $0.0 Trucks:0");
	}
}
