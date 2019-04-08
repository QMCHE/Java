package dgsw.y2.c1.n11;

import java.util.Scanner;

public class calculator {
	static class Calc{
		public int setWay() {
			Scanner sc = new Scanner(System.in);
			String choose;
			while(true) {
				System.out.println("1. 더하기");
				System.out.println("2. 빼기");
				System.out.println("3. 곱하기");
				System.out.println("4. 나누기");
				System.out.print("계산 방식을 선택해주세요 (종료 q)> ");
				choose = sc.nextLine();
				try {
					if(choose.equals("q")){
						System.exit(0);
					}else if(Integer.parseInt(choose)<1||Integer.parseInt(choose)>4){
						System.out.println("다시 입력해 주세요.");
					}else break;
				}catch(Exception e) {
					System.out.println("다시 입력해 주세요.");
				}
			}
			return Integer.parseInt(choose);
		}

		public int setFirstNum(int calWay) {
			Scanner sc = new Scanner(System.in);
			String num;
			while(true) {
				System.out.print("첫 번째 숫자를 입력하세요> ");
				num = sc.nextLine();
				try {
					if(calWay==4) {
						if(Integer.parseInt(num)>0) break;
						System.out.println("0 이하의 숫자로는 나눌 수 없습니다.");
					}else break;
				}catch(Exception e) {
					System.out.println("다시 입력해 주세요.");
				}
			}
			return Integer.parseInt(num);
		}

		public int setSecondNum(int calWay) {
			Scanner sc = new Scanner(System.in);
			String num;
			while(true) {
				System.out.print("두 번째 숫자를 입력하세요> ");
				num = sc.nextLine();
				try {
					if(calWay==4) {
						if(Integer.parseInt(num)>0) break;
						System.out.println("0 이하의 숫자로는 나눌 수 없습니다.");
					}else break;
				}catch(Exception e) {
					System.out.println("다시 입력해 주세요.");
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
			System.out.printf("계산 결과 : %d\n\n", val);
		}
	}

	public static void main(String[] args) {
		Calc c = new Calc();
		int val = 0;
		while(true) {
			int calWay = c.setWay();	// 계산 방식 입력받기
			int fNum = c.setFirstNum(calWay);	//첫 번째 숫자 입력받기
			int sNum = c.setSecondNum(calWay);	//두 번째 숫자 입력받기
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
