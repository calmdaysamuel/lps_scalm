package org.howard.edu.lsp.assignment2.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 
 * @author Samuel Calmday
 * @apiNote Entry point for the org.howard.edu.lsp.assignment2 package
 *
 */
public class Test {
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote Define your tests here using an instance of the Driver class
	 * 
	 *
	 */
    public static void main(String[] args) {

        Driver driver = new Driver();

        System.out.println(
        		driver.assertCombination(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)), 6, new ArrayList<HashSet<Integer>>(
	                Arrays.asList(
	                        new HashSet<Integer>(Arrays.asList(0, 1, 2)),
	                        new HashSet<Integer>(Arrays.asList(0, 4)),
	                        new HashSet<Integer>(Arrays.asList(1, 3)),
	                        new HashSet<Integer>(Arrays.asList(5))
	                )
        		)
        	)
        );

        System.out.println(driver.assertCombination(new ArrayList<Integer>(Arrays.asList(5, 5, 15, 10)), 15, new ArrayList<HashSet<Integer>>(
                Arrays.asList(
                        new HashSet<Integer>(Arrays.asList(2)),
                        new HashSet<Integer>(Arrays.asList(0, 3)),
                        new HashSet<Integer>(Arrays.asList(1, 3))
                	)
        		)
        	)
        );

        System.out.println(driver.assertCombination(new ArrayList<Integer>(Arrays.asList(10, 3, 7, 1)), 4, new ArrayList<HashSet<Integer>>(
                Arrays.asList(
                        new HashSet<Integer>(Arrays.asList(1, 3))
                	)
        		)
        	)
        );

        System.out.println(driver.assertCombination(new ArrayList<Integer>(Arrays.asList(1, 4, 7, 2, 3)), 9, new ArrayList<HashSet<Integer>>(
                Arrays.asList(
                        new HashSet<Integer>(Arrays.asList(2, 3)),
                        new HashSet<Integer>(Arrays.asList(1, 3, 4))
                	)
        		)
        	)
        );
    }
}
