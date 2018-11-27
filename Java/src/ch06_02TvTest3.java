
public class ch06_02TvTest3 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1 채널값은 " + t1.channel + "입니다.");
		System.out.println("t2 채널값은 " + t2.channel + "입니다.");
		t1 = t2;
		t1.channel = 7;
		System.out.println("t1 채널값은 7로 변경되었습니다.");
		System.out.println("t1 채널값은 " + t1.channel + "입니다.");
		System.out.println("t2 채널값은 " + t2.channel + "입니다.");
	}

}
