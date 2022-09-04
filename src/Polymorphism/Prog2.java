package Polymorphism;
                              // constructor overloading
public class Prog2 {
	
	public Prog2()
	{
		int a=10, b=20;
		int c=a+b;
		System.out.println("Addition="+c);
	}

	public Prog2(int a)
	{
		System.out.println("Addition="+(a+a));
	}
	
	public Prog2(int a, int b)
	{
		System.out.println("Addition="+(a+b));
	}
	
	public Prog2(int a, int b, int c)
	{
		System.out.println("Addition="+(a+b+c));
	}
	
	public Prog2(double b)
	{
		System.out.println("Addition="+(b+b));
	}
	
	public Prog2(char s)
	{
		this(1.5);
		System.out.println("Grade="+s);
	}
	
	public static void main(String[] args) 
	{
		Prog2 z=new Prog2();         //you can call multiple constructor by creating multiple object
		                              
	 // But now i want to use this keyword
		Prog2 x=new Prog2('A');
	}

}
