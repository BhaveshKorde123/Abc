package Polymorphism;
// method overloading 
public class Prog1 {
	
	public void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("Addition of two no. with zero parameters="+c);
	}
	
	public void add(int a) 
	{
		System.out.println("Addition of same no.="+(a+a));
	}                                                        // multiple methods of same name called              
	                                                         // Polymorphism
	public void add(int a, int b) 
	{
		System.out.println("Addition of two no.="+(a+b));
	}
	
	public void add(int a, int b, int c) 
	{
		System.out.println("Addition of three no="+(a+b+c));
	}
	
	public void add(double z)
	{
		System.out.println("Addition of same double="+(z+z));
	}
	
	public void add(String name)
	{
		System.out.println("Priting of name="+name);
	}
	
	public static void main(String[] args)
	{
		Prog1 x=new Prog1();
		
		x.add();
		x.add(12);
		x.add(1, 2, 3);
		x.add(20.25);
		x.add("Sham");
	}

}
