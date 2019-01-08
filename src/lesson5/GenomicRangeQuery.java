package lesson5;

public class GenomicRangeQuery {
	public int[] solution(String S, int[] P, int[] Q) {
		int[] temp = new int[S.length()];
		int[] result = new int[P.length];
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) == 'A') {
				temp[i] = 1;
			}else if(S.charAt(i) == 'C') {
				temp[i] = 2;
			}else if(S.charAt(i) == 'G') {
				temp[i] = 3;
			}else if(S.charAt(i) == 'T') {
				temp[i] = 4;
			}else {
				break;
			}
		}
		int min;
		for(int i=0; i<P.length; i++) {
			min = 0; 
			for(int j=P[i]; j<=Q[i]; j++) {
				if(j==P[i]) {
					min = temp[j];
				}
				if(min >= temp[j]) {
					min = temp[j];
					result[i] = min;
				}
			}
		}
		return result;
	}
}