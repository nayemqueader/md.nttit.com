package javacoding;

import java.util.ArrayList; //import arraylist class , java.util is the package for java
import java.util.Collections;


public class ArreyList {



	public static void main(String[] args) {
	/*array list class is a resizable array
	 * difference is the size
	 * array is not resizable and it is fixed
	 * array list is resizable and not fixed
	 * we can add and remove eliment from array list whenever we want
	 * in array we can replace the value.
	 * we can manupulate the size in arraylist.
	 * 
	 * 
	 */
		ArrayList<String> car=new ArrayList<String>(); // Create an array list object
		car.add("nissan"); // 0
		car.add("toyota"); // 1
		car.add("ford");
		car.add("kia");
		car.add("bmw");
		car.add("volvo");
		car.add("mercidese");
		// we use colletion to get the value numerically and alphabetically.
		System.out.println(car);
		Collections.sort(car);
		for(String j: car) {
			System.out.println(car);
		}
	/* access an item
	 * access an element in arraylist we use get() method and refer to 
	 * index number.
	 */
		car.get(0);
		System.out.println(car.get(0));
		System.out.println(car.get(2));
	// change/modify an item in arraylist	
		// we are going to use set() method and refer to index number.
		
		car.set(0, "miabari");
		System.out.println(car.set(0, "miabari"));
		
		// to know the size we use size() method 
		
		car.size();
		System.out.println(car.size());
		
		// loop through arraylist 
		for (int i = 0; i<car.size(); i++) {
			System.out.println(car.get(i));
		}  
		
		
	// to remove an item we use remove() method and refer to index number
		

		
	car.remove(1);
	System.out.println(car);
	
	// to remove all the element we use clear() method and refer to index
	
//	car.clear();
	
	// System.out.println(car);
	
	// Arraylist for integer value 
	ArrayList<Integer> obj=new ArrayList<Integer>();
	obj.add(2);
//Sort an ArrayList Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:
	Collections.sort(car);
	
for(String j:car) {
	System.out.println(j);
}
	}

}
