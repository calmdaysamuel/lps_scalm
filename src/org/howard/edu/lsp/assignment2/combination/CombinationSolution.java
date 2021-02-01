package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CombinationSolution {
    public ArrayList<Set<Integer>> arrayCombination(ArrayList<Integer> arr, Integer target) {

        Set<Set<Integer>> possibleSolution = new HashSet<Set<Integer>>();
        for (int i = 0; i < arr.size(); i++) {

            ArrayList<HashSet<Integer>> temp = this.combinationHelper(
                    arr,
                    target,
                    i,
                    new ArrayList<Integer>(Arrays.asList(arr.get(i))),
                    new HashSet<>(Arrays.asList(i)),
                    arr.get(i),
                    new ArrayList<HashSet<Integer>>()
            );

            for (int x = 0; x < temp.size(); x++) {
                possibleSolution.add(temp.get(x));
            }
        }

        return new ArrayList<>(possibleSolution);
    }

    public ArrayList<HashSet<Integer>> combinationHelper(

            ArrayList<Integer> arr,
            Integer target,
            int index,
            ArrayList<Integer> curArray,
            HashSet<Integer> used,
            int curValue,
            ArrayList<HashSet<Integer>> arrayList) {

        if (curValue > target) {
            return new ArrayList<HashSet<Integer>>();
        } else if (curValue == target) {
            arrayList.add(used);
        }

        for (int i = index; i < arr.size(); i++) {
            if (used.contains(i)) {
                continue;
            }
            ArrayList<Integer> nxtArray = new ArrayList<>(curArray);
            nxtArray.add(arr.get(i));
            HashSet<Integer> nxtUsed = new HashSet<>(used);
            nxtUsed.add(i);
            this.combinationHelper(arr, target, index, nxtArray, nxtUsed, curValue + arr.get(i), arrayList);
        }

        return arrayList;
    }
}
