package org.howard.edu.lsp.assignment6.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.ArrayList;
import java.util.Arrays;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;

public class IntegerSetTest {

	IntegerSet testSet1 = new IntegerSet();
	IntegerSet testSet2 = new IntegerSet();
	

	@BeforeEach
	void init() {
		testSet1 = new IntegerSet();
		testSet2 = new IntegerSet();
	}
	
	@Test
	@DisplayName("Test for clearing set")
	public void testClear() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.clear();
		assertEquals(testSet1.toString(), "");
		
	}

	@Test
	@DisplayName("Test for set length")
	public void testLength() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.clear();
		assertEquals(testSet1.length(), 0);
		
		testSet1.add(1);
		assertEquals(testSet1.length(), 1);
		
		testSet1.clear();
		testSet1.add(1);
		testSet1.add(2);
		assertEquals(testSet1.length(), 2);
	}

	
	@Test
	@DisplayName("Test for checking if item is in the set")
	public void testContains() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		
		assertTrue(testSet1.contains(1));
		assertTrue(testSet1.contains(2));
		assertTrue(testSet1.contains(3));
		assertTrue(testSet1.contains(4));
		assertTrue(testSet1.contains(5));
		
		assertFalse(testSet1.contains(6));
		assertFalse(testSet1.contains(7));
		assertFalse(testSet1.contains(8));
		assertFalse(testSet1.contains(9));
		assertFalse(testSet1.contains(10));
	}
	
	@Test
	@DisplayName("Test for largest item in set")
	public void testLargest() throws IntegerSetException{
		assertThrows(IntegerSetException.class, () -> testSet1.largest());
		testSet1.add(0);
		assertEquals(testSet1.largest(), 0);
		
		testSet1.add(4);
		assertEquals(testSet1.largest(), 4);
		
		testSet1.add(-2);
		assertEquals(testSet1.largest(), 4);
		
		testSet1.add(-10);
		assertEquals(testSet1.largest(), 4);
	}
	

	@Test
	@DisplayName("Test for smallest item in set")
	public void testSmallest() throws IntegerSetException {
		assertThrows(IntegerSetException.class, () -> testSet1.smallest());
		
		testSet1.add(0);
		assertEquals(testSet1.smallest(), 0);
		
		testSet1.add(4);
		assertEquals(testSet1.smallest(), 0);
		
		testSet1.add(-2);
		assertEquals(testSet1.smallest(), -2);
		
		testSet1.add(-10);
		assertEquals(testSet1.smallest(), -10);
	}
	

	@Test
	@DisplayName("Test for adding to set")
	public void testAdd () {
		testSet1.add(0);
		assertEquals(testSet1.toString(), "0 ");
		
		testSet1.add(1);
		assertEquals(testSet1.toString(), "0 1 ");
		testSet1.add(2);
		assertEquals(testSet1.toString(), "0 1 2 ");
		testSet1.add(3);
		assertEquals(testSet1.toString(), "0 1 2 3 ");
		testSet1.add(4);
		assertEquals(testSet1.toString(), "0 1 2 3 4 ");
	}
	

	@Test
	@DisplayName("Test for removing from set")
	public void testRemove() {
		testSet1 = new IntegerSet(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
		
		testSet1.remove(1);
		assertEquals(testSet1.toString(), "2 3 4 5 ");
		
		testSet1.remove(2);
		assertEquals(testSet1.toString(), "3 4 5 ");
		testSet1.remove(3);
		assertEquals(testSet1.toString(), "4 5 ");
		testSet1.remove(4);
		assertEquals(testSet1.toString(), "5 ");
		testSet1.remove(5);
		assertEquals(testSet1.toString(), "");
	}
	
	@Test
	@DisplayName("Test for checking union of two sets")
	public void testUnion() {
		testSet1 = new IntegerSet(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
		testSet2 = new IntegerSet(new ArrayList<Integer>(Arrays.asList(6, 7, 8, 9, 10)));
		
		testSet1.union(testSet2);
		assertEquals(testSet1.toString(), "1 2 3 4 5 6 7 8 9 10 ");
	}
	
	@Test
	@DisplayName("Test for checking intersection of two sets")
	public void testIntersect() {
		testSet1 = new IntegerSet(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
		testSet2 = new IntegerSet(new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6, 7)));
		
		testSet1.intersect(testSet2);
		assertEquals(testSet1.toString(), "3 4 5 ");
	}
	
	
	@Test
	@DisplayName("Test for checking differnce of two sets")
	public void testDiff() {
		testSet1 = new IntegerSet(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
		testSet2 = new IntegerSet(new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6, 7)));
		
		testSet1.diff(testSet2);
		assertEquals(testSet1.toString(), "1 2 ");
	}
	
	@Test
	@DisplayName("Test for checking if set is empty")
	public void testIsEmpty() {


		
		testSet1.add(0);
		assertFalse(testSet1.isEmpty());
		
		testSet1.add(1);
		assertFalse(testSet1.isEmpty());
		
		testSet1.add(2);
		assertFalse(testSet1.isEmpty());
		
		testSet1.clear();
		assertTrue(testSet1.isEmpty());
	}
	
	

}