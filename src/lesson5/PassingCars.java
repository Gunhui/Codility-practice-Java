package lesson5;

import java.util.ArrayList;

public class PassingCars {
	public int solution(int[] A) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int count = 0;
		for(int i=0; i<A.length; i++) {
			if(A[i] == 0) {
				temp.add(i);
			}
		}
		for(int k=0; k<temp.size(); k++) {
			for(int j=temp.get(k)+1; j<A.length; j++) {
				if(A[j] == 1) {
					count++;
				}
			}
		}
		return count;
	}
}