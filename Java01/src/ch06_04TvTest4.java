
public class ch06_04TvTest4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;	//tvArr[i]의 channel에 i+10을 저장
		}
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();	//채널 1 증가
			System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
		}
	}

}
