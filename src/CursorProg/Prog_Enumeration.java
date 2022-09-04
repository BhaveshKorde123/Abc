package CursorProg;

import java.util.Enumeration;

import java.util.Vector;

public class Prog_Enumeration {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		for(int i=0;i<=10;i++) 
		{
	       v.add(i);
	    }
		System.out.println(v);
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements()) 
	    {
			System.out.println(e.nextElement());
		}
		
		
		
	
	
	}
	
		
		
		
		
		
		
		

}
