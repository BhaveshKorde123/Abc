package SeleProg;

import java.util.HashSet;
import java.util.Vector;

import com.graphbuilder.struc.LinkedList;

public class Prog20_HashSet {

	public static void main(String[] args) {
		HashSet a=new HashSet();
		HashSet b=new HashSet(1000);
		HashSet c=new HashSet(1000, 90);    //size always increase by double but fill ratio we define 90%
		HashSet d=new HashSet();                                      //by default it is 75%
		
		  a.add("Manual");
		  a.add("Automation");
		  a.add('A');
		  a.add("H");
		  a.add("Bh");
		  a.add("Manual");
		  
		System.out.println(a);
		  a.add(null);
		System.out.println(a);
		 a.add(null);
		System.out.println(a);
		
		Vector v1=new Vector();
		v1.add("Amar");
		v1.add(1, "BNK");
		v1.addElement("Sham");
		v1.add("Sham");
		v1.add("Amar");
		System.out.println(v1);
		
		HashSet h=new HashSet(v1);		
		System.out.println(h);
			
		v1=new Vector(h);
		System.out.println(v1);
	}

}
