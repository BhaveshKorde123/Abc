package SeleProg;
import java.util.Vector;

public class Prog_Vector {

	public static void main(String[] args) 
	{
		Vector v1=new Vector();            //defaut cap=10
        Vector v2=new Vector(100);         //cap=100
        Vector v4=new Vector(); 
        
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        System.out.println(v2.capacity());

        System.out.println(v4.capacity());
        
        v1.add("Bhavesh");
        v1.add(0, "Korde");
        
        System.out.println(v1);
        
        for(int i=1;i<10;i++)
        	v2.add(i);
        	
        System.out.println(v2);
        v2.add(0, "Ron");
        System.out.println(v2);
        System.out.println(v2.capacity());
        System.out.println(v2.size());
        
       v1.addElement(20);
       System.out.println(v1);
       
       v1.add("kelly");
       System.out.println(v1);
       
       System.out.println(v2);
       v2.setElementAt("computer", 9);
       System.out.println(v2);
       v2.set(5,"google");
       System.out.println(v2);
       
      System.out.println(v2.firstElement());
       System.out.println(v2.add(12));
       System.out.println(v2);  
      System.out.println(v2.lastElement());
      
      Vector v3=new Vector(v1);
      System.out.println(v3.capacity());
      System.out.println(v3.size());
      
      Vector v5=new Vector();
       v5.add(1);
       v5.add(1);
       v5.add(1);
       v5.add(1);
       
       System.out.println(v5);
	}

}
