package dgsw.y2.c1.n11.animal;

public abstract class MeatEater extends Animal {

	public MeatEater(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.printf("%s��(��) ��⸦ �Խ��ϴ�.\n", getName());
	}
}
