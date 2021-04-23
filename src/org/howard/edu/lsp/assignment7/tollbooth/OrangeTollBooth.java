package org.howard.edu.lsp.assignment7.tollbooth;

public class OrangeTollBooth implements TollBooth{
	
	double axlePrice;
	double weightPrice;
	String name;
	double tollTotal = 0;
	int truckCount = 0;
	public OrangeTollBooth(double axlePrice, double weightPrice, String name) {
		this.axlePrice = axlePrice;
		this.weightPrice = weightPrice;
		this.name = name;
	}
	
	
	@Override
	public double calculateToll(Truck truck) {
		double toll;
		
		toll = truck.getAxles() * axlePrice + ((truck.getWeight() / 1000) * 2) * weightPrice;
		String data = "Truck Arrival - Axles: " + String.valueOf(truck.getAxles()) + " Total Wieght: " + String.valueOf(truck.getWeight()) + " Toll due: $" + String.valueOf(toll);
		
		truckCount += 1;
		tollTotal += toll;
		
		System.out.println(data);
		return toll;
	}

	@Override
	public String displayData() {

		String data = "Totals since last collection - Receipts: $" + String.valueOf(tollTotal) + " Trucks:" + String.valueOf(truckCount);
		System.out.println(data);
		return data;
	}
	
	@Override
	public void reset() {
		displayData();
		tollTotal = 0;
		truckCount = 0;
	}

}
