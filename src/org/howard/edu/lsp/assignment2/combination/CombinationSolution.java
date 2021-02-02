package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author Samuel Calmday
 * @apiNote Container class for the array combination  solution
 *
 */
public class CombinationSolution {
	
	/**
	 * 
	 * @author Samuel Calmday
	 * @apiNote This method computes the results the possible solutions
	 * 
	 * @apiNote This method uses a recursive algorithm to pick integers from the input array and compare their sum to the target value.
	 */
    public ArrayList<HashSet<Integer>> arrayCombination(ArrayList<Integer> arr, Integer target) {

        HashSet<HashSet<Integer>> possibleSolution = new HashSet<HashSet<Integer>>();
        for (int i = 0; i < arr.size(); i++) {

            ArrayList<HashSet<Integer>> temp = this.combinationHelper(
                    arr,
                    target,
                    i,
                    new HashSet<Integer>(Arrays.asList(i)),
                    arr.get(i),
                    new ArrayList<HashSet<Integer>>()
            );

            for (int x = 0; x < temp.size(); x++) {
                possibleSolution.add(temp.get(x));
            }
        }

        return new ArrayList<HashSet<Integer>>(possibleSolution);
    }
    
    /**
     * 
     * @author Samuel Calmday
     * @apiNote This function assists the arrayCombination method in generating a solution
     *
     */
    public ArrayList<HashSet<Integer>> combinationHelper(

            ArrayList<Integer> arr,
            Integer target,
            int index,
            HashSet<Integer> used,
            int curValue,
            ArrayList<HashSet<Integer>> arrayList) {

        if (curValue > target) {
        	
            return new ArrayList<HashSet<Integer>>();
            
        } else if (curValue == target) {
        	
            arrayList.add(used);
            
        } else {
        	
        	for (int i = index; i < arr.size(); i++) {
                if (used.contains(i)) {
                    continue;
                }
                HashSet<Integer> nxtUsed = new HashSet<Integer>(used);
                nxtUsed.add(i);
                this.combinationHelper(arr, target, index, nxtUsed, curValue + arr.get(i), arrayList);
            }
        	
        }

        return arrayList;
    }
}
