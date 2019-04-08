package dgsw.y2.c1.n11.inheritance;

public class ConstructorChild2 extends ConstructorParent2 {
	public ConstructorChild2() {
		super("Hello");
		
		System.out.println("자식 클래스의 생성자가 호출됨");
	}
}
