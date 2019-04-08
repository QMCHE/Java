class Tv{
		//Tv의 속성
		String color;
		boolean power;
		int channel;
		
		//Tv의 기능
		void power() {power=!power;}
		void channelUp() {channel++;}
		void channelDown() {channel--;}
}

public class ch06_01TvTest {
	
	public static void main(String[] args) {
		//Tv인스턴스를 참조하기 위한 변수 t 선언
		Tv t;
		//Tv인스턴스 생성
		t = new Tv();
		//Tv인스턴스의 멤버변수 채널의 값을 7로 설정
		t.channel = 7;
		//Tv인스턴스의 메서드 채널 다운
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}

}
