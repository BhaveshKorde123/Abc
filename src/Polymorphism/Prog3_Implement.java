package Polymorphism;
                                // Method overriding:- Runtime polymorphism
public class Prog3_Implement {

	public static void main(String[] args)
	{
		
		Prog3_1 a=new Prog3_1();   //super class method call by creating object of super class
		a.employee();
  
		Prog3_2 b=new Prog3_2();   //sub class method call by creating object of sub class
		b.employee();
		
		Prog3_1 x=new Prog3_2();   // Overriding method of sub class to method of super class
		x.employee();
	}

}
