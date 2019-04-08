
public class ch06_07CallStackTest {

	public static void main(String[] args) {
		firstMethod();
	}
	static void firstMethod(){
		secondMethod();
	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
