package lesson6;

import java.util.Arrays;

public class Triangle {
	public static void main(String [] args) {
		int[] A = {10, 2, 5, 1, 8, 20};
		long result1;
        long result2;
        if(A.length < 3){
            System.out.println(0);
        }
        Arrays.sort(A);
        for(int i=0; i<A.length-2; i++) {
            result1 = (long)A[i] + (long)A[i+1];
            result2 = (long)A[i+2];
			if(result1 > result2) {
				System.out.println(1);
				break;
			}else {
				System.out.println(0);
			}
		}
	}
}
