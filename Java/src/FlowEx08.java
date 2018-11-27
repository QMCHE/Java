import java.util.Scanner;

public class FlowEx08 {

	public static void main(String[] args) {
		String regNo;
		char gender;
		System.out.println("당신의 주민번호를 입력하시오.> ");
		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();
		gender = regNo.charAt(7);
		scanner.close();
		switch(gender) {
		case '1': case'3':
			System.out.println("당신은 남자입니다.");
		case '2': case '4':
			System.out.println("당신은 여자입니다.");
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}
	}

}
