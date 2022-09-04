package CursorProg;

import java.util.ListIterator;
import java.util.Vector;

public class Prog_ListIterator {

	public static void main(String[] args) {
		
        Vector v=new Vector();
		
		for(int i=0;i<=10;i++) 
		{
	       v.add(i);
	    }
		System.out.println(v);
		
		ListIterator le=v.listIterator();
		
//		while(le.hasNext())                             //SimpleWay
//		{
//			System.out.println(le.next());
//		}
		
		while(le.hasNext())
		{
			int val=(int) le.next();
			 if(val==5)
			{
				le.remove();
			}
			 else
			{
				if(val==2)
				{
					le.add(22);
				}
				else
				{
					if(val==3)
					{
						le.set(33);
					}
				}
			}
			
		}
		System.out.println(v);
	}
	 
}
