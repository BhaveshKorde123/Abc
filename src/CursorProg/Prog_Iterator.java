package CursorProg;

import java.util.Iterator;
import java.util.Vector;

public class Prog_Iterator {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		for(int i=0;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		

		Iterator i=v.iterator();
		
		while(i.hasNext())
		{
			int value1=(int) i.next();
			if(value1%2==0)
			 {
				System.out.println(value1);
			 }
			else
			{
				i.remove();
			}		
		}
		System.out.println(v);
	}

}
