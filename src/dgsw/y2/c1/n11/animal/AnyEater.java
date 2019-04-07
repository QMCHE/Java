package dgsw.y2.c1.n11.animal;

public abstract class AnyEater extends Animal {

	public AnyEater(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.printf("%s은(는) 아무거나 먹습니다.\n", getName());
	}

}
