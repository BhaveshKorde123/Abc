package SeleProg;

import java.util.ArrayList;

public class Prog1_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList(800);
		ArrayList al3=new ArrayList(al2);
		
		System.out.println(al1.size());
		System.out.println(al2.size());
		System.out.println(al3.size());
		
		al1.add("Bhavesh");
		al1.add("Ram");
		al1.add(2);
		al1.add('A');
		al1.add(50000.784);
		
		System.out.println(al1.size());
		System.out.println("AL1="+al1);
		
		al1.add(2, "Dobby");
		System.out.println("AL1="+al1);
		
		for(int i=20;i<30;i++) 
		{
		al1.add(i);
		}
		System.out.println("AL1="+al1);
		
		al1.addAll(al1);
		System.out.println("AL1="+al1);
//		al1.clear();
//		System.out.println("AL1="+al1);
		
		System.out.println("Is AL1 Contain Ram="+al1.contains("Ram"));
		System.out.println("Is AL1 Contain 30="+al1.contains(30));
		
		System.out.println("Value at Index 17="+al1.get(17));
		System.out.println("Index of Dobby="+al1.indexOf("Dobby"));
		
		System.out.println("Index of First Bhavesh ="+al1.indexOf("Bhavesh"));
		System.out.println("Index of Last Bhavesh="+al1.lastIndexOf("Bhavesh"));
		
		System.out.println("AL1="+al1);
		al1.remove(50000.784);
		System.out.println("AL1="+al1);
		al1.set(2,"Korde");
		System.out.println("AL1="+al1);
		
		System.out.println("*****************************************************************");
		
		System.out.println("In Forward");
		for(int i=0;i<al1.size();i++)
		{
			
			System.out.print(al1.get(i)+"=");
		}
		
		System.out.println();
		System.out.println("*****************************************************************");
		
		System.out.println("In Reverse");
		for(int i=al1.size()-1;i>=0;i--)
		{
			
			System.out.print(al1.get(i)+"-");
		}
		

	}

}
