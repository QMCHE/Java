package dgsw.y2.c1.n11.intereface;

public class ExceptionLab {

	public void method1() throws Exception {
		throw new RuntimeException("예외 테스트");
	}

	public void method2() {
		throw new NullPointerException();
	}

	public static void main(String[] args) {
		ExceptionLab lab = new ExceptionLab();

		try {
			lab.method1();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
