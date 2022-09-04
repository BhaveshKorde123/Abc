package SeleProg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Prog_Map {

	public static void main(String[] args) {
		HashMap hm1=new HashMap();
		HashMap hm2=new HashMap(200);
		HashMap hm3=new HashMap(1000,90);
		HashMap hm4=new HashMap(hm1);
		
		hm1.put(4, "Bhavesh");
		hm1.put(2, "Ashverya");
		hm1.put(8, "Poimn");
		hm1.put(1, "Raman");
		hm1.put(1, "Shifa");
		
		System.out.println(hm1);
		hm1.put("Y", "1452");
		hm1.put("C", "5656");
		hm1.put("S", "1212");
		hm1.put(5, "Raman");
		hm1.put(7, "Raman");
		hm1.put("H", "1212");
		hm1.put("D", "5656");
		
		System.out.println(hm1);
		System.out.println(hm1.keySet());        //Return values of keys only
		System.out.println(hm1.containsKey(6));
		System.out.println(hm1.values());
		System.out.println(hm1.entrySet());
		
		Set s=hm1.entrySet();
	
		Iterator it1=s.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		

	}

}
