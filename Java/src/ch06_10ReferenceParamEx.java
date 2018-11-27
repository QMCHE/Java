
public class ch06_10ReferenceParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("Main() : x = " + d.x);
		change(d);
		System.out.println("After Change(d)");
		System.out.println("main() : x = " + d.x);
	}
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
