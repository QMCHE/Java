package dgsw.y2.c1.n11.animal;

public abstract class GrassEater extends Animal {

	public GrassEater(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.printf("%s��(��) Ǯ�� �Խ��ϴ�.\n", getName());
	}
}
