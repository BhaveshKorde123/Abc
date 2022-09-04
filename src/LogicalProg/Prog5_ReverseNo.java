package LogicalProg;

public class Prog5_ReverseNo {

	public static void main(String[] args) {
		
		int	num	= 58693, revInt=0, temp=0;
		int multFactor=10000;
		
		for(int i=0;i<=5;i++)
		{
			temp=num%10;  
			revInt=revInt+temp*multFactor; //0+5*10000
			multFactor=multFactor/10;
			num=num/10;//5
		}
		System.out.println(revInt);
	}

}
