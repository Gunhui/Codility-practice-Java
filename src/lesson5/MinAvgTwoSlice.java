package lesson5;

public class MinAvgTwoSlice {
	public int solution(int[] A) {
		double avg;
		double sum;
		double min = 0;
		int result=0;
		int count;
		for(int i=0; i<A.length-1; i++) {
			sum = A[i];
			count = 1;
			for(int j=i; j<A.length-1; j++) {
				sum += A[j+1];
				avg = sum/(count+1);		
				if(j==0) {
					min = avg;
				}
				if(min >= avg) {
					min = avg;
					result = i;
				}
				count++;
			}
			avg = sum/(A.length-i-1);

		}
		return result;
	}
}
