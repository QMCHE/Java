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
		System.out.println("다시 하시겠습니까?");
		return "Y".equals(rspUserInput.inputRetry());
	}
	
	private void showPrompt() {
		System.out.println("안내면 진다 가위바위보");
	}
	
	private String makeComputerSelection() {
		Random random = new Random();
		int value = random.nextInt(3);
		if(value==0) {
			return "가위";
		}else if(value==1) {
			return "바위";
		}else {
			return "보";
		}
	}
	
	private String decideWinLose(String userInput, String computerSelection) {
		if("가위".equals(userInput)) {
			if("바위".equals(computerSelection)) {
				return "패";
			}else if("보".equals(computerSelection)) {
				return "승";
			}
		}
		if("바위".equals(userInput)) {
			if("보".equals(computerSelection)) {
				return "패";
			}else if("가위".equals(computerSelection)) {
				return "승";
			}
		}
		if("보".equals(userInput)) {
			if("가위".equals(computerSelection)) {
				return "패";
			}else if("바위".equals(computerSelection)) {
				return "승";
			}
		}
		return null;
	}
	
	private void showResult(String winLose) {
		if("승".equals(winLose)) {
			System.out.println("당신이 이겼습니다.");
		}else if("패".equals(winLose)) {
			System.out.println("당신이 졌습니다.");
		}else {
			System.out.println("비겼습니다.");
		}
	}
	
	public static void main(String[] args) {
		RspGame game = new ConsoleRspUserInput();
		game.executeGame();
	}
	
}
