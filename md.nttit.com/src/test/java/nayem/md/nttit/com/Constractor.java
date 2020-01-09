package nayem.md.nttit.com;

public class Constractor {
	public void method1() {}
	/* String Car; // created a class attribute 
	public Constractor (){
		Car = "toyota"; //set the initial value for the attribute car
	} */
	String car;
	String fruite;
	int number;
	public Constractor (String C, String F, int N) {
		car = C;
		fruite = F;
		number = N;		
	}

	public static void main(String[] args) {
		 // Constractor con = new Constractor();
		 // System.out.println(con.Car);
		Constractor con = new Constractor("toyota", "orange",7)       ;
				System.out.println(con.car + " "+ con.fruite +" " + con.number);
				
	/* constractor is a special type of method, 
	 * it can be used to set initial value for object attribute. 
	 * This is a special type of method that is used to initialized the object.
	 * constractor is invoked (Called) at
	 * the time of object creation and it constract the 
	 * value (provides data for objects) that's why
	 * it is known as constractor, 
	 * 
	 * rules for creating java constractor:
	 * 1 constractor name must be same as class name
	 * 2 constractor must have no return type
	 * 
	 * types of constractor
	 * there are two types of constractor
	 * 1. Default constructor (no argument constractor (No parameter)
	 * 2. parameterized constractor (regular )
	 * 
	 * Purpose of constractor:
	 * we use constractor to initialize object of the class
	 * 
	 * constractor cant be abstract, static, final, 
	 */
		
	}



}
