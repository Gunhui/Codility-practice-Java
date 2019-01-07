package date_2019_01_02;

import java.util.Arrays;

public class PermCheck {
	public int solution(int[] A) {
        boolean check = false;
		Arrays.sort(A);
		for(int i=0; i<A.length-1; i++) {
			if(A[i+1] == A[i] + 1) {
				check = true;
			}else{
			    check = false;
			    break;
			}
		}
		if(check == true) {
			return 1;
		}else {
			return 0;
		}
    }
}