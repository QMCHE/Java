package dgsw.y2.c1.n11.list;

import java.util.ArrayList;

public class Stack {
	
	private ArrayList<String> list;
	private int count = 0;
	
	public Stack() {
		this.list = new ArrayList<String>();
	}
	
	public void push(String value) {
		list.add(value);
	}
	
	public String pop() {
		return list.remove(list.size() - 1);
	}
	
	public String top() {
		return list.get(list.size() - 1);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int size() {
		return this.count;
	}
}
