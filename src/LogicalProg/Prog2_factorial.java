package LogicalProg;

public class Prog2_factorial {

	public static void main(String[] args) {
		
		int num=5, fact=1;
		
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
			System.out.println("Output=" +fact);
		}
		System.out.println("**************");
		System.out.println("Final output=" +fact);

	}

}




//5!=5*4*3*2*1