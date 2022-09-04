package SeleProg;

import java.util.LinkedHashSet;

public class Prog1_LinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("A");
		lhs.add("N");
		lhs.add("A");
		lhs.add("Bhavesh");
		lhs.add(22);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains("j"));
		System.out.println(lhs.contains("A"));
	}
}
