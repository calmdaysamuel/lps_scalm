/**
 * 
 */
package org.howard.edu.lsp.assignment4.implementation;

import java.util.ArrayList;

/**
 * @author Samuel Calmday
 *
 */
public class IntegerSet {
	
	private ArrayList<Integer> set = new ArrayList<>();
	
	
	public IntegerSet(ArrayList<Integer> arr) {
		set = arr;
	}
	
	public IntegerSet() { }
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote Empties the set
	 */
	public void clear() {
		this.set.clear();
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @return Return the Length of the Set
	 */
	public int length() {
		return this.set.size();
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote Checks if a value is in a set
	 * @return Returns a boolean
	 */
	public boolean contains(int item) {
		for (int val: this.set) {
			if (val == item) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @throws IntegerSetException if set is empty
	 * @author Samuel Calmday
	 * @return Returns the largest value in the set
	 */
	public int largest() throws IntegerSetException {
		int largestValue = Integer.MIN_VALUE;
		
		for (int val: this.set) {
			if (val > largestValue) {
				largestValue = val;
			}
		}
		
		return largestValue;
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @return Returns the smallest value in the set
	 * @throws IntegerSetException if set is empty
	 */
	public int smallest() throws IntegerSetException {
		int smallestValue = Integer.MAX_VALUE;
				
				for (int val: this.set) {
					if (val < smallestValue) {
						smallestValue = val;
					}
				}
				
				return smallestValue;
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote Adds an item to the set
	 * @param An item to add
	 */
	public void add (int item) {
		
		for (int val: this.set) {
			if (val == item) {
				return;
			}
		}
		this.set.add(item);
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote Removes a value from a set
	 * @param The value to remove
	 */
	public void remove(int item) {
		this.set.remove(Integer.valueOf(item));
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote computes the union of two set
	 * @param An instance of an IntegerSet
	 */
	public void union(IntegerSet intSetb) {
		for (int val: intSetb.values()) {
			this.add(val);
		}
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote computes the intersection of two set
	 * @param An instance of an IntegerSet
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> intersection = new ArrayList<>();
		for (int val: this.set) {
			for (int otherVal: intSetb.values()) {
				if (otherVal == val) {
					intersection.add(val);
					continue;
				}
			}
		}
		
		this.set = intersection;
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote computes the difference of two set
	 * @param An instance of an IntegerSet
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> tempDiff = new ArrayList<Integer>();
		for (int val: this.set) {
			if (!intSetb.values().contains(val)) {
				tempDiff.add(val);
			}
		}
		
		this.set = tempDiff;
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote checks if set is empty
	 * @return returns a boolean
	 */
	public boolean isEmpty() {
		return this.set.size() == 0;
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote converts set to string
	 * @return returns string version of the set
	 */
	public String toString() {

		
		String stringVersion = "(";
		
		for (int val: this.set) {
			stringVersion += Integer.toString(val) + ", ";
		}
		
		return stringVersion += ")";
	}
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote returns the values in the list
	 * @return returns the values in the list
	 */
	public ArrayList<Integer> values() {
		return this.set;
	}
}
