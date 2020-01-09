package nayem.md.nttit.com;

public class Polymorphisms{
	
	public void method1 (String car, String fruit, int number) {
		System.out.println(car+" "+fruit+" "+number);
	}
	public void method1 (String car, String fruit, int number, int m) {
		System.out.println(car+" "+fruit+" "+number);
	}
	public void method1 (String car, String fruit) {
		System.out.println(car+" "+fruit);
	}
	public void ligin (String firstname, String Lastname, int Password) {
		System.out.println(firstname+Lastname+Password);
	
	/* 2 types of Polymorphisms
	 * 1. method of over loading, same method name but different
	  	signature or parameter. 
	  
	 * 2. method over writing, has to be doing something with
	 	parents and child relationship. 
	 */
	
	}	
}
