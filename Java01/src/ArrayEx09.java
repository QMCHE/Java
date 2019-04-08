
public class ArrayEx09 {

	public static void main(String[] args) {
		int[] code = {-4, -1, 3, 6, 11};
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)Math.random()*10;
			arr[i] = code[tmp];
		}
	}

}
