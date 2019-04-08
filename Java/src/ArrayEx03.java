
public class ArrayEx03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) arr[i]=i+1;
		System.out.println("arr.length: " + arr.length);
		System.out.println("[" + arr + "]");
	}

}
