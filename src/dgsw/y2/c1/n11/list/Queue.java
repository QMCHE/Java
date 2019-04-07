package dgsw.y2.c1.n11.list;

import java.util.ArrayList;

public class Queue {
	private ArrayList<String> list;
	
	public Queue() {
		list = new ArrayList<String>();
	}
	
	public void add(String value) {
		list.add(value);
	}
	
	public String poll() {
		return list.remove(list.size()-1);
	}
	
	public String peek() {
		return list.get(0);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int size() {
		return list.size();
	}
}
