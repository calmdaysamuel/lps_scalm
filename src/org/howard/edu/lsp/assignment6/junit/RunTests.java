package org.howard.edu.lsp.assignment6.junit;

import java.util.ArrayList;
import java.util.Arrays;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;



public class RunTests {

	public static void main(String[] args) throws IntegerSetException {
		// TODO Auto-generated method stub
		IntegerSetTest test = new IntegerSetTest();
		
		test.testAdd();
		test.testClear();
		test.testContains();
		test.testDiff();
		test.testIntersect();
		test.testIsEmpty();
		test.testLargest();

		test.testLength();
		test.testRemove();
		test.testSmallest();
		test.testUnion();
	}

}
