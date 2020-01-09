package nayem.md.nttit.com;

public class Method {
	/* Why use method
	 1.Method is a block of codes
	 2. we can pass data through argument/ parameter
	 3. reuse codes
	 * */
	
	static void methodname() {
		System.out.println(" my first method");
	}
	
	static void methodname2(){
		
		System.out.println("my second method");
		
	}
 static void method4(String car) {
		
		System.out.println(car+" IS MY FAB ");
		}
	
	static void methodname3(int x) {System.out.println(x+" created"); }

	public static void main(String[] args) {
		
	// for static we don't need to create any object, instead of creating object 
		// we can directly -
	//	call through method name to execute code inside the method
		
		methodname();
		methodname2();
		methodname3(10);
		method4("BMW");
		method4("Toyota");
		method4("honda");
		
		
		
		
		

	}

}
