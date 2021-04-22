package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

public class RemoveZeroes {

	
	
	ArrayList<Integer> removeZeroes(ArrayList<Integer> list) {
		
		int listEnd = list.size() - 1;
		
		while (listEnd > -1) {
			if (list.get(listEnd) == 0) {
				list.remove(listEnd);
			}
			
			listEnd--;
		}
		
		return list;
	}

}
