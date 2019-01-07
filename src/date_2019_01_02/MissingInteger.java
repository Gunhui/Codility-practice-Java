package date_2019_01_02;

import java.util.Arrays;

public class MissingInteger {
	public int solution(int[] A) {
//		 int min = 0;
//	        Arrays.sort(A);
//	        for(int i=0; i<A.length; i++){
//	            if(i == A.length-1){
//	                min = A[i] + 1;
//	                break;
//	            }
//	            if(A[A.length-1] < 0){
//	                min = 1;
//	                break;
//	            }
//	            if(!(A[i+1] == A[i] || A[i+1] == A[i]+1)){
//	                min = A[i]+1;
//	                break;
//	            }
//	        }
//	        return min;
			int max = 2;
				for(int i=0 ; i<A.length ; i++) 
					if(max < A[i])   max = A[i];

	      int pos_int[] = new int[max+2];
	      for(int i=0 ; i<A.length ; i++) 
	         if(A[i]>0) pos_int[A[i]] = A[i];
	      
	      for(int i=1 ; i<pos_int.length ; i++) {
	         if(pos_int[i] == 0) return i;
	         //System.out.println(i+ " : "+ pos_int[i]);
	      }
	      return 1;
	}
}