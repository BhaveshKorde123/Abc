package LogicalProg;

public class Prog7_ArmstrongNos {

	public static void main(String[] args) {
		
		int num=375;
		int num2=num;
		int temp, num1 = 0;
		
		while(num>0)
		{
			 temp = num%10;
			num1=num1+temp*temp*temp;
			 num=num/10;
		}
		
		if(num2==num1)
		{
			System.out.println("Armstrong No.");
		}
		else
		{
			System.out.println("Not a Armstrong No.");
		}

	}

}
