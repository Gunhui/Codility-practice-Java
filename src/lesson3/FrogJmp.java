package lesson3;

public class FrogJmp {
	public int solution(int X, int Y, int D) {
		int diff = Y - X;
		int count = diff/D;
		int left = diff%D;
		
		if(left == 0) {
			return count;
		}else {
			return count+1;
		}
	}
}
