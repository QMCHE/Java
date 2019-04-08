package dgsw.y2.c1.n11.animal;

public abstract class GrassEater extends Animal {

	public GrassEater(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.printf("%s은(는) 풀을 먹습니다.\n", getName());
	}
}
