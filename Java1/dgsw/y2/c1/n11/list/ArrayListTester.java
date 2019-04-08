package dgsw.y2.c1.n11.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTester {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ÀÚ¹Ù");
		list.add("C#");
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.indexOf("C++"));
		System.out.println(list.remove(1));
		
		LinkedList<String> List1 = new LinkedList<String>();
	}
}
