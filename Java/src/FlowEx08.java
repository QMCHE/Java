import java.util.Scanner;

public class FlowEx08 {

	public static void main(String[] args) {
		String regNo;
		char gender;
		System.out.println("����� �ֹι�ȣ�� �Է��Ͻÿ�.> ");
		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();
		gender = regNo.charAt(7);
		scanner.close();
		switch(gender) {
		case '1': case'3':
			System.out.println("����� �����Դϴ�.");
		case '2': case '4':
			System.out.println("����� �����Դϴ�.");
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
	}

}
