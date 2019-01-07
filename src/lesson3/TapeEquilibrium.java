package lesson3;

public class TapeEquilibrium {
	public int solution(int [] A) {
		int cha = 0;
		int min = 0;
		
		for(int i=0; i<A.length-1; i++) {
			int front = 0;
			int end = 0;
			for(int j=0; j<=i; j++) {
				front += A[j];
			}
			for(int k=A.length-1; k>i; k--) {
				end += A[k];
			}
			cha = Math.abs(front - end);
			if(i==0) {
				min = cha;
			}
			if(min >= cha) {
				min = cha;
			}
		}
		return min;
	}
}