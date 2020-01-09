package javacoding;

import java.util.HashMap;

public class HashMapp {

	public static void main(String[] args) {// (string,string),(string , interger),(integer, integer) (integer, string)
//Create a HashMap object called obj that will store String keys and String values:
		HashMap <String,String> capital=new HashMap <String,String>();
		capital.put("Bangladesh","Dhaka");
		capital.put("USA", "wasiDC");
		System.out.println(capital);
		 // Create a HashMap object called obj1 that will store String keys 
		// and Integer values:
		HashMap <Integer,String> list=new HashMap <Integer, String>();
		list.put(1, "onion");
		list.put(2, "chili");
		System.out.println(list);
		//size 
		System.out.println(list.size());
		//get access  any item
		capital.get("Bangladesh");
		System.out.println(capital.get("Bangladesh"));
		System.out.println(capital.get("canada"));
		
		// if we can to print keys only we have use KeySet() method 
		for(String i: capital.keySet()) {
			System.out.println(i);	
			
		}
		// to print value use value()
		for(String j:capital.values()) {
			System.out.println(j);
		}
		
		
		for (String k:capital.keySet())
			System.out.println("country "+k+" capital "+capital.get(k));
		// to remove 
				capital.remove("Bangladesh");
				System.out.println(capital);
				//System.out.println(capital);
				// if we wanna remove all then use clear() method
				capital.clear();
				System.out.println(capital);
	}

}
