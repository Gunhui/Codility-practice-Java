package lesson2;

public class OddOccurrencesInArray {
	public int solution(int [] A) {
		 int temp = 0;
	       for(int i = 0 ; i < A.length ; i++) {
	          for(int j = 0 ; j < A.length ; j++) {
	             if(A[i] == A[j]) {
	                temp++;
	             }
	          }
	          if(temp % 2 == 1) {
	             return A[i];
	          }
	          temp = 0;
	       }
	       return 0;
	}
}
