package dgsw.y2.c1.n11;

import java.util.Scanner;

public class calculator {
	static class Calc{
		public int setWay() {
			Scanner sc = new Scanner(System.in);
			String choose;
			while(true) {
				System.out.println("1. ���ϱ�");
				System.out.println("2. ����");
				System.out.println("3. ���ϱ�");
				System.out.println("4. ������");
				System.out.print("��� ����� �������ּ��� (���� q)> ");
				choose = sc.nextLine();
				try {
					if(choose.equals("q")){
						System.exit(0);
					}else if(Integer.parseInt(choose)<1||Integer.parseInt(choose)>4){
						System.out.println("�ٽ� �Է��� �ּ���.");
					}else break;
				}catch(Exception e) {
					System.out.println("�ٽ� �Է��� �ּ���.");
				}
			}
			return Integer.parseInt(choose);
		}

		public int setFirstNum(int calWay) {
			Scanner sc = new Scanner(System.in);
			String num;
			while(true) {
				System.out.print("ù ��° ���ڸ� �Է��ϼ���> ");
				num = sc.nextLine();
				try {
					if(calWay==4) {
						if(Integer.parseInt(num)>0) break;
						System.out.println("0 ������ ���ڷδ� ���� �� �����ϴ�.");
					}else break;
				}catch(Exception e) {
					System.out.println("�ٽ� �Է��� �ּ���.");
				}
			}
			return Integer.parseInt(num);
		}

		public int setSecondNum(int calWay) {
			Scanner sc = new Scanner(System.in);
			String num;
			while(true) {
				System.out.print("�� ��° ���ڸ� �Է��ϼ���> ");
				num = sc.nextLine();
				try {
					if(calWay==4) {
						if(Integer.parseInt(num)>0) break;
						System.out.println("0 ������ ���ڷδ� ���� �� �����ϴ�.");
					}else break;
				}catch(Exception e) {
					System.out.println("�ٽ� �Է��� �ּ���.");
				}
			}
			return Integer.parseInt(num);
		}

		public int plus(int fNum, int sNum) {
			int val = fNum + sNum;
			return val;
		}


		public int minus(int fNum, int sNum) {
			int val = fNum - sNum;
			return val;
		}

		public int multiply(int fNum, int sNum) {
			int val = fNum * sNum;
			return val;
		}

		public int division(int fNum, int sNum) {
			int val = fNum / sNum;
			return val;
		}
		public void outputVal(int val) {
			System.out.printf("��� ��� : %d\n\n", val);
		}
	}

	public static void main(String[] args) {
		Calc c = new Calc();
		int val = 0;
		while(true) {
			int calWay = c.setWay();	// ��� ��� �Է¹ޱ�
			int fNum = c.setFirstNum(calWay);	//ù ��° ���� �Է¹ޱ�
			int sNum = c.setSecondNum(calWay);	//�� ��° ���� �Է¹ޱ�
			switch(calWay) {
			case 1:
				val = c.plus(fNum, sNum);
				break;
			case 2:
				val = c.minus(fNum, sNum);
				break;
			case 3:
				val = c.multiply(fNum, sNum);
				break;
			case 4:
				val = c.division(fNum, sNum);
				break;
			}
			c.outputVal(val);
		}
	}
}
