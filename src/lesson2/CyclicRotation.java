package lesson2;

public class CyclicRotation {
	public int[] solution(int[] A, int K) {
        int length = A.length;
        int[] temp = new int[length];
        for(int i=0; i<K; i++){
            temp[0] = A[length-1];
            for(int j=0; j<length-1; j++){
               temp[j+1] = A[j];    
            }
            for(int k=0; k<length; k++){
                A[k] = temp[k];
            }
        }
        return temp;
    }
}
