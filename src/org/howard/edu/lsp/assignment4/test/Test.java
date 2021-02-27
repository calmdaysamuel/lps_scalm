package org.howard.edu.lsp.assignment4.test;

import java.util.ArrayList;
import java.util.Arrays;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;
import org.howard.edu.lsp.assignment4.test.Driver;

/**
 * 
 * @author Samuel Calmday
 * @apiNote Entry point for the org.howard.edu.lsp.assignment4 package
 *
 */
public class Test {
	
	/**
	 * 
	 * @author Samuel Calmday
	 *
	 */
	public static void main(String[] args) {
		
		// Initialize test sets
		IntegerSet testSet1 = new IntegerSet();
		IntegerSet testSet2 = new IntegerSet(new ArrayList<Integer>(Arrays.asList(10, 11, 12, 13)));
		IntegerSet testSet3 = new IntegerSet(new ArrayList<Integer>(Arrays.asList(11, 21, 31, 41)));
		IntegerSet testSet4 = new IntegerSet(new ArrayList<Integer>(Arrays.asList(-1, -3, -50, -8, 1)));
		IntegerSet testSet5 = new IntegerSet(new ArrayList<Integer>(Arrays.asList(-1, -3, 1, 3)));
		
		
		System.out.println("Add Tests");
		// test add function
		testSet1.add(0);
		Driver.assertEqualSet(testSet1, new ArrayList<>(Arrays.asList(0)));
		testSet1.add(1);
		Driver.assertEqualSet(testSet1, new ArrayList<>(Arrays.asList(0, 1)));
		testSet1.add(2);
		Driver.assertEqualSet(testSet1, new ArrayList<>(Arrays.asList(0, 1, 2)));
		testSet1.add(3);
		Driver.assertEqualSet(testSet1, new ArrayList<>(Arrays.asList(0, 1, 2, 3)));
		testSet1.add(4);
		Driver.assertEqualSet(testSet1, new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4)));
		
		System.out.println("Remove Tests");
		//test remove function
		testSet2.remove(10);
		Driver.assertEqualSet(testSet2, new ArrayList<>(Arrays.asList(11, 12, 13)));
		testSet2.remove(11);
		Driver.assertEqualSet(testSet2, new ArrayList<>(Arrays.asList(12, 13)));
		testSet2.remove(12);
		Driver.assertEqualSet(testSet2, new ArrayList<>(Arrays.asList(13)));
		testSet2.remove(13);
		Driver.assertEqualSet(testSet2, new ArrayList<>(Arrays.asList()));
		
		System.out.println("Largest Tests");
		// Test largest function
		
		try {
			System.out.println(testSet1.toString());
			Driver.assertEqualInteger(testSet1.largest(), 4);
		} catch (IntegerSetException e) {
		      System.out.println("Error: " + e.getMessage());
	    }
		
		try {
			System.out.println(testSet3.toString());
			Driver.assertEqualInteger(testSet3.largest(), 41);
		} catch (IntegerSetException e) {
		      System.out.println("Error: " + e.getMessage());
	    }
		
		try {
			System.out.println(testSet4.toString());
			Driver.assertEqualInteger(testSet4.largest(), -1);
		} catch (IntegerSetException e) {
		      System.out.println("Error: " + e.getMessage());
	    }
		
		
		try {
			System.out.println(testSet5.toString());
			Driver.assertEqualInteger(testSet5.largest(), 3);
		} catch (IntegerSetException e) {
		      System.out.println("Error: " + e.getMessage());
	    }
		
		
		System.out.println("Smallest Tests");
		// Test smallest function
		
		try {
			System.out.println(testSet1.toString());
			Driver.assertEqualInteger(testSet1.smallest(), 0);
		} catch (IntegerSetException e) {
		      System.out.println("Error: " + e.getMessage());
	    }
		
		try {
			System.out.println(testSet3.toString());
			Driver.assertEqualInteger(testSet3.smallest(), 11);
		} catch (IntegerSetException e) {
		      System.out.println("Error: " + e.getMessage());
	    }
		
		try {
			System.out.println(testSet4.toString());
			Driver.assertEqualInteger(testSet4.smallest(), -50);
		} catch (IntegerSetException e) {
		      System.out.println("Error: " + e.getMessage());
	    }
		
		try {
			System.out.println(testSet5.toString());
			Driver.assertEqualInteger(testSet5.smallest(), -3);
		} catch (IntegerSetException e) {
		      System.out.println("Error: " + e.getMessage());
	    }
		
		
		
		System.out.println("Contains Tests");
		// Test contains function
		System.out.println(testSet1.toString());
		Driver.assertEqualBoolean(testSet1.contains(4), true);
		
		System.out.println(testSet3.toString());
		Driver.assertEqualBoolean(testSet3.contains(41), true);
		
		System.out.println(testSet4.toString());
		Driver.assertEqualBoolean(testSet4.contains(-1), true);
		
		System.out.println(testSet5.toString());
		Driver.assertEqualBoolean(testSet5.contains(3), true);
		
		System.out.println(testSet1.toString());
		Driver.assertEqualBoolean(testSet1.contains(0), true);
		
		System.out.println(testSet3.toString());
		Driver.assertEqualBoolean(testSet3.contains(2131), false);
		
		System.out.println(testSet4.toString());
		Driver.assertEqualBoolean(testSet4.contains(1212), false);
		
		System.out.println(testSet5.toString());
		Driver.assertEqualBoolean(testSet5.contains(324445), false);
		
		System.out.println("Length Tests");
		// Test length function
		
		System.out.println(testSet1.toString());
		Driver.assertEqualInteger(testSet1.length(), 5);
		
		System.out.println(testSet2.toString());
		Driver.assertEqualInteger(testSet2.length(), 0);
		
		System.out.println(testSet3.toString());
		Driver.assertEqualInteger(testSet3.length(), 4);
		
		System.out.println(testSet4.toString());
		Driver.assertEqualInteger(testSet4.length(), 4);
		
		System.out.println(testSet5.toString());
		Driver.assertEqualInteger(testSet5.length(), 4);
		
		System.out.println("IsEmpty Tests");
		//Test isEmpty function
		
		System.out.println(testSet1.toString());
		Driver.assertEqualBoolean(testSet1.isEmpty(), false);
		
		System.out.println(testSet2.toString());
		Driver.assertEqualBoolean(testSet2.isEmpty(), true);
		
		System.out.println(testSet3.toString());
		Driver.assertEqualBoolean(testSet3.isEmpty(), false);
		
		System.out.println(testSet4.toString());
		Driver.assertEqualBoolean(testSet4.isEmpty(), false);
		
		System.out.println(testSet5.toString());
		Driver.assertEqualBoolean(testSet5.isEmpty(), false);
		
		System.out.println("Intersect Tests");
		//Test intersect function
		testSet4.intersect(testSet5);
		Driver.assertEqualSet(testSet4, new ArrayList<>(Arrays.asList(1, -3, -1)));
		
		System.out.println("Clear Union Tests");
		//Test union function
		testSet1.union(testSet3);
		Driver.assertEqualSet(testSet1, new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4,11, 21,31, 41)));
		
		
		System.out.println("Clear Diff Tests");
		//Test diff function
		testSet1.diff(testSet3);
		Driver.assertEqualSet(testSet1, new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4)));

		
		System.out.println("Clear Tests");
		//Test clear function
		testSet1.clear();
		Driver.assertEqualSet(testSet1, new ArrayList<>(Arrays.asList()));
		
		testSet2.clear();
		Driver.assertEqualSet(testSet2, new ArrayList<>(Arrays.asList()));
		
		testSet3.clear();
		Driver.assertEqualSet(testSet3, new ArrayList<>(Arrays.asList()));
		
		testSet4.clear();
		Driver.assertEqualSet(testSet4, new ArrayList<>(Arrays.asList()));
		
		testSet5.clear();
		Driver.assertEqualSet(testSet5, new ArrayList<>(Arrays.asList()));
	}
	
}
