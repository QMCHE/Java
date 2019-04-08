package dgsw.y2.c1.n11.game;

import java.util.Random;

public abstract class RspGame {
	
	private RspUserInput rspUserInput = new ConsoleRspUserInput();
	
	public void executeGame() {
		do {
		showPrompt();
		String userInput = rspUserInput.inputUserSelection();
		String computerSelection = makeComputerSelection();
		String winLose = decideWinLose(userInput, computerSelection);
		showResult(winLose);
		}while(retry());
	}
	
	private boolean retry() {
		System.out.println("�ٽ� �Ͻðڽ��ϱ�?");
		return "Y".equals(rspUserInput.inputRetry());
	}
	
	private void showPrompt() {
		System.out.println("�ȳ��� ���� ����������");
	}
	
	private String makeComputerSelection() {
		Random random = new Random();
		int value = random.nextInt(3);
		if(value==0) {
			return "����";
		}else if(value==1) {
			return "����";
		}else {
			return "��";
		}
	}
	
	private String decideWinLose(String userInput, String computerSelection) {
		if("����".equals(userInput)) {
			if("����".equals(computerSelection)) {
				return "��";
			}else if("��".equals(computerSelection)) {
				return "��";
			}
		}
		if("����".equals(userInput)) {
			if("��".equals(computerSelection)) {
				return "��";
			}else if("����".equals(computerSelection)) {
				return "��";
			}
		}
		if("��".equals(userInput)) {
			if("����".equals(computerSelection)) {
				return "��";
			}else if("����".equals(computerSelection)) {
				return "��";
			}
		}
		return null;
	}
	
	private void showResult(String winLose) {
		if("��".equals(winLose)) {
			System.out.println("����� �̰���ϴ�.");
		}else if("��".equals(winLose)) {
			System.out.println("����� �����ϴ�.");
		}else {
			System.out.println("�����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		RspGame game = new ConsoleRspUserInput();
		game.executeGame();
	}
	
}
