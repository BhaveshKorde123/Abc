package LogicalProg;
	//Sir done in this Way//
public class Prog4_ReverseString {
		
		public static void main(String[] args) {
			
			String str="Velocity";
			String strRev="";
			char ch;
			
			for(int i=str.length()-1;i>=0;i--)
			{
				 ch = str.charAt(i);
				 strRev=strRev+ch;			
			}
			
			System.out.println(strRev);
		}

}
