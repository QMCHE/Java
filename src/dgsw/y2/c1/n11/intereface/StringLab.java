package dgsw.y2.c1.n11.intereface;

import java.util.Arrays;

public class StringLab {
	
	private static final String SAMPLE = "�� ���Ⱑ ���ܿ� ���� ������ ������ ���� ���� �帮������.";
	private static final String STR1 = "abcde";
	private static final String STR2 = "01234";
	private static final String STR3 = "��";
	
	public static void main(String[] args) {
		/*
		System.out.printf("���� : %d\n", SAMPLE.length());
		System.out.printf("'������'�� ��ġ : %d\n", SAMPLE.indexOf("������"));
		System.out.printf("�� ��° '��'�� ��ġ : %d\n", SAMPLE.indexOf("��", SAMPLE.indexOf("��")+1));
		System.out.printf("12��°���� ������ ���ڿ� : %s\n", SAMPLE.substring(12));
		System.out.printf("12��°���� 20��°���� ���ڿ� : %s\n", SAMPLE.substring(12, 20));
		*/
		
		byte[] bytes = STR3.getBytes();
		System.out.println(Arrays.toString(bytes));
		
		byte[] bytes1 = new byte[] {-80, -95};
		String str = new String(bytes1);
		System.out.println(str);
	}
}
