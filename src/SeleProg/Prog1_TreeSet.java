package SeleProg;

import java.util.TreeSet;

public class Prog1_TreeSet {

	public static void main(String[] args) {
		
		  TreeSet ts1=new TreeSet();
		  
		   ts1.add("A");
		   ts1.add("Z");
		   ts1.add("E");
//		   ts1.add(null);
		   
		  System.out.println(ts1);
		   ts1.add("10");
		  System.out.println(ts1);
		  
		  TreeSet ts=new TreeSet();
		  ts.add(10);
		  ts.add(100);
//		  ts.add("bh");
		  ts.add(10);
		  System.out.println(ts);
		  
	}

}
