
public class ch06_02TvTest3 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1 ä�ΰ��� " + t1.channel + "�Դϴ�.");
		System.out.println("t2 ä�ΰ��� " + t2.channel + "�Դϴ�.");
		t1 = t2;
		t1.channel = 7;
		System.out.println("t1 ä�ΰ��� 7�� ����Ǿ����ϴ�.");
		System.out.println("t1 ä�ΰ��� " + t1.channel + "�Դϴ�.");
		System.out.println("t2 ä�ΰ��� " + t2.channel + "�Դϴ�.");
	}

}
