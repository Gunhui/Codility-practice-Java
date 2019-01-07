package lesson3;

import java.util.Arrays;

public class PermMissingElem {
	int result;
	public int solution(int [] A) {
		Arrays.sort(A);
		for(int i=0; i<A.length; i++) {
			if(A[i+1] != A[i] + 1) {
				result = A[i]+1;
				break;
			}
		}
		return result;
	}
}
