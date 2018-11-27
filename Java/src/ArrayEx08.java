
public class ArrayEx08 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		for(int i=0; i<ball.length; i++)
			ball[i] = (int) Math.random();
		int temp = 0;	int t = 0;
		for(int i=0; i<6; i++) {
			t=
			temp = ball[i];
			
			ball[t] = temp;
		}
	}

}
