package lesson6;

import java.util.Arrays;

public class MaxProductOfThree {
	public int solution(int[] A) {
		Arrays.sort(A);
		int result1 = A[0]*A[1]*A[A.length-1];
		int result2 = A[A.length-1]*A[A.length-2]*A[A.length-3];
		if(result1 > result2) {
			return result1;
		}else {
			return result2;
		}
	}
}