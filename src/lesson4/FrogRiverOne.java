package date_2019_01_02;

import java.util.ArrayList;

public class FrogRiverOne {
	public int solution(int X, int[] A) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
        int position = -1;
        int time = 0;
        for(int i=1; i<=X; i++){
            temp.add(i);
        }
        for(int j=0; j<A.length; j++){
            if(temp.contains(A[j])){
                position = temp.indexOf(A[j]);
                temp.remove(position);
            }
            if(temp.isEmpty()){
                time = j;
                break;
            }
        }
        if(!temp.isEmpty()) {
        	return -1;
        }
        return time;
	}
}