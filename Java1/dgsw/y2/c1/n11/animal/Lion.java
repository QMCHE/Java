package dgsw.y2.c1.n11.animal;

import dgsw.y2.c1.n11.intereface.UserManager;

public abstract class Lion extends MeatEater implements UserManager {
	
	public Lion() {
		super("����");
	}
	
	@Override
	public void bark() {
		System.out.println("����");
	}
}
