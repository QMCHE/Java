class Tv{
		//Tv�� �Ӽ�
		String color;
		boolean power;
		int channel;
		
		//Tv�� ���
		void power() {power=!power;}
		void channelUp() {channel++;}
		void channelDown() {channel--;}
}

public class ch06_01TvTest {
	
	public static void main(String[] args) {
		//Tv�ν��Ͻ��� �����ϱ� ���� ���� t ����
		Tv t;
		//Tv�ν��Ͻ� ����
		t = new Tv();
		//Tv�ν��Ͻ��� ������� ä���� ���� 7�� ����
		t.channel = 7;
		//Tv�ν��Ͻ��� �޼��� ä�� �ٿ�
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
	}

}
