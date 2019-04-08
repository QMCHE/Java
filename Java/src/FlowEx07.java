import java.util.Scanner;

public class FlowEx07 {

	public static void main(String[] args) {
		int user, com;
		System.out.print("가위(1), 바위(2), 보(3) 중 하나입력> ");
		Scanner scanner = new Scanner(System.in);
		user = scanner.nextInt();
		scanner.close();
		com = (int) (Math.random()*3+1);
		switch(user-com) {
		case 2: case -1:
			System.out.println("You lose!"); break;
		case 1: case -2:
			System.out.println("You win!"); break;
		case 0:
			System.out.println("비겼습니다!");
		}
	}

}
