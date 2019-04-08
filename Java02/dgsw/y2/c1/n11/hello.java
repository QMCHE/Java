package dgsw.y2.c1.n11;

import java.util.Scanner;

public class hello {
	public static String inputName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요> ");
		String name = sc.nextLine();
		sc.close();
		return name;
	}
	public static void outputName(String name) {
		System.out.printf("Hello %s", name);
	}
	
	public static void main(String[] args) {
		String name = inputName();
		outputName(name);
	}

}
