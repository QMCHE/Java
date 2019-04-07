package dgsw.y2.c1.n11.intereface;

import java.util.Arrays;

public class StringLab {
	
	private static final String SAMPLE = "나 보기가 역겨워 가실 때에는 말없이 고이 보내 드리오리다.";
	private static final String STR1 = "abcde";
	private static final String STR2 = "01234";
	private static final String STR3 = "가";
	
	public static void main(String[] args) {
		/*
		System.out.printf("길이 : %d\n", SAMPLE.length());
		System.out.printf("'말없이'의 위치 : %d\n", SAMPLE.indexOf("말없이"));
		System.out.printf("두 번째 '가'의 위치 : %d\n", SAMPLE.indexOf("가", SAMPLE.indexOf("가")+1));
		System.out.printf("12번째부터 끝까지 문자열 : %s\n", SAMPLE.substring(12));
		System.out.printf("12번째부터 20번째까지 문자열 : %s\n", SAMPLE.substring(12, 20));
		*/
		
		byte[] bytes = STR3.getBytes();
		System.out.println(Arrays.toString(bytes));
		
		byte[] bytes1 = new byte[] {-80, -95};
		String str = new String(bytes1);
		System.out.println(str);
	}
}
