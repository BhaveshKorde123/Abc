package LogicalProg;

public class Prog6_AdditionOfNos {

	public static void main(String[] args) {
		
		int num = 12345;
		int temp, sum = 0;
		
		//for(int i=0;i<5;i++)            //using for loop
		while(num>0)                      //using while loop
		{
			 temp = num%10;
			 sum = sum+temp;
			 num=num/10;
		}
		System.out.println(sum);
		
	}

}
