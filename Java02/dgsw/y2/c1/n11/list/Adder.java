package dgsw.y2.c1.n11.list;

import java.util.ArrayList;

public class Adder {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	private int count;
	
	public Adder() {
		this.list = new ArrayList<Integer>();
		this.count = 0;
	}
	
	public Adder(int initValue) {
		this();
		this.list.add(initValue);
	}
	
	public void add(int value) {
		list.add(value);
		this.count++;
	}
	
	public int getAccumulatedValue(int value) {
		// TODO
		return 0;
	}
}
