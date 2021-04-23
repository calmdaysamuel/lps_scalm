package org.howard.edu.lsp.assignment7.junit;

public class RunTests {

	public static void main(String[] args) {

		TollBoothTest tbt = new TollBoothTest();
		TruckTest tt = new TruckTest();
		
		tbt.testCalculateToll();
		tbt.testDisplayData();
		tbt.testReset();
		
		tt.testGetAxles();
		tt.testGetName();
		tt.testGetWeight();
	}

}
