package LogicalProg;

import java.util.Scanner;

public class Prog1_EvenAndOdd {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter a no.");
		
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		if(num%2==0)
		{
			System.out.println("No. is Even");
		}
		else
		{
			System.out.println("No. is Odd");
		}
	}

}
