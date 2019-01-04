package date_2019_01_02;

public class FrogJmp {
	public int solution(int X, int Y, int D) {
		int diff = Y - X;
		int count = diff/D;
		
		return count + 1; 
		
	}
}
