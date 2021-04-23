package org.howard.edu.lsp.assignment7.tollbooth;

public interface TollBooth {
	
	double calculateToll(Truck truck);
	String displayData();
	void reset();
}
