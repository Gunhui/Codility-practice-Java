package lesson6;

import java.util.ArrayList;

public class Distinct {
	public static void main(String [] args) {
		int[] A = {2, 1, 1, 2, 3, 1};
		boolean check;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0; i<A.length; i++) {
			check = true;
			if(i==0) {
				temp.add(A[i]);
			}else {
				for(int j=0; j<temp.size(); j++) {
					if(temp.get(j) == A[i]) {
						check = false;
					}
				}
				if(check != false) {
					temp.add(A[i]);
				}
			}
		}
		System.out.println(temp.size());	
	}
}
