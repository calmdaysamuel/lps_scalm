package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RemoveZeroesTest {
	
	
	RemoveZeroes rz = new RemoveZeroes();
	
	@BeforeEach
	void init() {
		rz = new RemoveZeroes();
		
	}
	
	@Test
	@DisplayName("Test for remove zeroes")
	public void testRemoveZeroes() {
		
		assertEquals(
				rz.removeZeroes(new ArrayList<Integer>(Arrays.asList(1,0,2,0,3,0))), 
				new ArrayList<Integer>(Arrays.asList(1,2,3))
				);
		
		
		
		assertEquals(
				rz.removeZeroes(new ArrayList<Integer>(Arrays.asList(0,0,0,0))), 
				new ArrayList<Integer>(Arrays.asList())
				);
		
		assertEquals(
				rz.removeZeroes(new ArrayList<Integer>(Arrays.asList(1,2,3,0,6,7,9,0))), 
				new ArrayList<Integer>(Arrays.asList(1,2,3,6,7,9))
				);
		
	}
}
