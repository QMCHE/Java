package dgsw.y2.c1.n11.inheritance;

public class Teacher extends Person {
	public Teacher(String name) {
		super("����", name);
	}
	
	@Override
	public String talk() {
		return "������ �����";
	}
}
