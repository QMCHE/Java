package dgsw.y2.c1.n11.animal;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void eat();
	
	public abstract void bark();
	
	public static void main(String[] args) {
//		Animal lion = new Lion();
//		lion.eat();
//		lion.bark();
		
		Animal rabbit = new Rabbit();
		rabbit.eat();
		rabbit.bark();
		
		Animal mouse = new Mouse();
		mouse.eat();
	}
}
