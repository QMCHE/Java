
public class Exercise4_04 {

	public static void main(String[] args) {
		int sum = 0, s = 1, num = 0;
		for(int i = 1; true; i++) {
			num=s*i;
			sum+=num;
			if(sum>=100)break;
			s=-s;
		}
		System.out.println("num = " + num);
	}

}