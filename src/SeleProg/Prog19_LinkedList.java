package SeleProg;

import java.util.LinkedList;

public class Prog19_LinkedList {

	public static void main(String[] args) {
		LinkedList ll1=new LinkedList();
		LinkedList ll2=new LinkedList(ll1);
	  System.out.println(ll1.size());
	  System.out.println(ll1.isEmpty());
	  
		ll1.add("Tokyo");
		ll1.add("Rio");
		ll1.add("Moscow");
		ll1.add('+');
		ll1.add(222);
		ll1.add("Null");
		ll1.add("Rio");
		ll1.add("Tokyo");
		ll1.add("Rio");
		
	  System.out.println(ll1);
		ll1.add("Bhavesh");
		ll1.add("Korde");
		
		System.out.println(ll1);
	    ll1.remove();
	   System.out.println(ll1);
	    ll1.remove("Korde");
	   System.out.println(ll1);
	    ll1.removeFirstOccurrence("Rio");
	   System.out.println(ll1);
	   
	   for(Object value : ll1)
	   {
		   System.out.println(value + " ");
	   }
	   
//	   for(int i=0;i<ll1.size();i++) 
//	   {
//	   System.out.println(ll1.get(i));
//	   }
	   
	}

}
