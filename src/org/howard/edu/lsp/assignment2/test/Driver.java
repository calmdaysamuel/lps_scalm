package org.howard.edu.lsp.assignment2.test;

import org.howard.edu.lsp.assignment2.combination.CombinationSolution;

import java.util.ArrayList;
import java.util.HashSet;

public class Driver {

    public Boolean assertCombination(ArrayList<Integer> arrayArgument, int target, ArrayList<HashSet<Integer>> expectedOutput) {

        CombinationSolution cs = new CombinationSolution();
        var ans = cs.arrayCombination(arrayArgument, target);
        System.out.println("----------------------------------");
        System.out.println("Input Arguments: " + arrayArgument + " , " + target);
        System.out.println("output: " + ans);
        System.out.println("expected output: " + expectedOutput);
        System.out.println("----------------------------------");
        
        for(int i = 0; i < expectedOutput.size(); i++) {
        	if(!ans.contains(expectedOutput.get(i))) {
        		return false;
        	}
        }
        return true;
    }
}
