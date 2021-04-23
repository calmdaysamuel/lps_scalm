package org.howard.edu.lsp.assignment7.tollbooth;

public class ToyotaTruck implements Truck{
	
	int axles;
	int weight;
	String name;
	
	public ToyotaTruck(int axles, int weight, String name) {
		this.axles = axles;
		this.weight = weight;
		this.name = name;
	}
	
	@Override
	public int getAxles() {
		return axles;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
