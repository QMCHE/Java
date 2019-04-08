package dgsw.y2.c1.n11.inheritance;

public class Teacher extends Person {
	public Teacher(String name) {
		super("교사", name);
	}
	
	@Override
	public String talk() {
		return "숙제가 없어요";
	}
}
