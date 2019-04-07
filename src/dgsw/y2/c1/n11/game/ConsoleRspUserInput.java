package dgsw.y2.c1.n11.game;

import java.util.Scanner;

public class ConsoleRspUserInput extends RspUserInput {
	
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public String inputUserSelection() {
		System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
		String input = scanner.next();
		return input;
	}
	
	@Override
	public String inputRetry() {
		System.out.println("��? ��?");
		String input = scanner.next();
		return input;
	}
}
