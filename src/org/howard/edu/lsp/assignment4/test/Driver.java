package org.howard.edu.lsp.assignment4.test;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;

/**
 * 
 * @author Samuel Calmday
 * @apiNote Runs helper functions for all the methods in the org.howard.edu.lsp.assignment4.implementation package
 *
 */
public class Driver {

	
	/**
	 * 
	 * @author Samuel Calmday
	 * @param The computed result and the expected result
	 * @return Returns a boolean if indicates if the computed set is equal to the expected set
	 */
	public static Boolean assertEqualSet(IntegerSet set, ArrayList<Integer> list) {
		
		for (int val: set.values()) {
			if (list.contains(val) == false) {
				return false;
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("Computed set: " + set.toString() + "\nExpected set: " + list);
		System.out.println("--------------------------------------------");
		System.out.println(" ");
		return true;
	}
	
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @param The computed result and the expected result
	 * @return Returns a boolean if indicates if the computed integer is equal to the expected integer
	 */
	public static Boolean assertEqualInteger(Integer computed, Integer expected) {
		
		System.out.println("--------------------------------------------");
		System.out.println("Computed Integer: " + computed + "\nExpected Integer: " + expected);
		System.out.println("--------------------------------------------");
		System.out.println(" ");
		
		return computed == expected;
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @param The computed result and the expected result
	 * @return Returns a boolean if indicates if the computed boolean is equal to the expected boolean
	 */
	public static Boolean assertEqualBoolean(Boolean computed, Boolean expected) {
		
		System.out.println("--------------------------------------------");
		System.out.println("Computed Boolean: " + computed + "\nExpected Boolean: " + expected);
		System.out.println("--------------------------------------------");
		System.out.println(" ");
		
		return computed == expected;
	}
}
