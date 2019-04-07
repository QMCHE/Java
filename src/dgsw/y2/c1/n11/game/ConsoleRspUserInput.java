package dgsw.y2.c1.n11.game;

import java.util.Scanner;

public class ConsoleRspUserInput extends RspUserInput {
	
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public String inputUserSelection() {
		System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
		String input = scanner.next();
		return input;
	}
	
	@Override
	public String inputRetry() {
		System.out.println("ㅇ? ㄴ?");
		String input = scanner.next();
		return input;
	}
}
