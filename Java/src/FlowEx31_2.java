
public class FlowEx31_2 {

	public static void main(String[] args) {
		int res=0;
		for(int i=1; i<=1100; i++) {
			if(i%2!=0||i%3!=0)continue;
			res+=i;
		}
		System.out.println(res);
	}

}
