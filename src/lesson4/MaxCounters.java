package lesson4;

public class MaxCounters {
	public int[] solution(int N, int[] A) {
		int[] temp = new int[N];
		int max = 0;
		int count = 0;
		for(int i=0; i<A.length; i++) {
			if(A[i] <= N) {
				if(temp[A[i]-1] < count) {
					A[i] = count;
				}
				temp[A[i]-1]++;
				if(max <= temp[A[i]-1]) {
					max = temp[i];
				}
			}else {
				count = max;
			}
		}
		for(int i=0; i<temp.length; i++) {
			if(temp[i] == 0) {
				temp[i] = count;
			}
		}
		return temp;
	}
}
