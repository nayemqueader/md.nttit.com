package nayem.md.nttit.com;

public class IfElseCodition {

	//double x = 5; 
	public void methodx(int x) {
		System.out.println(x);
	}
	public void methodWatch() {
		System.out.println("i should get access through object from other class");
	}
	
	public static void main(String[] args) {
		/*       == equal to
		         != not equal to
				> greater than 
				< smaller/less than
				>= is greater than euqal to
				<= is less than or equal to
		*/

		double value=3.6;
		
		// if(value, parameter, arge) { body }
		if (value==3.5)
		{
			System.out.println("print  3");
		}
		else 
		{
			System.out.println("print null");
}
		
		
	
	// && = AND, ||= or 
	  int  m=5;
	  double n=10;
	  
	  if ((n>12) && (m<12)) {System.out.println("the condition is true");}
	  else {System.out.println("condition false"); }
	  
	  if ((n<12) && (m>12)) { System.out.println("the condition is true");}
	  else {System.out.println("condition false");}
	
	  if ((n<12) && (m<12)) { System.out.println("the condition is true");}
	  else {System.out.println("condition false");}
	  
	  if ((n>=12) && (m<=12)) { System.out.println("the condition is true");}
	  else {System.out.println("condition false");}
	  
	  if ((n<=12) && (m<=12)) { System.out.println("the condition is true");}
	  else {System.out.println("condition false");}

	  // int  m=5; double n=10;
	  
	  if ((n<12) || (m<12)) { System.out.println("the condition is true");}
	  else {System.out.println("condition false");}
	  
	  if ((n>12) || (m>12)) { System.out.println("the condition is true");}
	  else {System.out.println("condition false");}
	  
	  if ((n<=12) || (m<12)) { System.out.println("the condition is true");}
	  else {System.out.println("condition false");}
	  
	  if ((n<12) || (m<=12)) { System.out.println("the condition is true");}
	  else {System.out.println("condition false");}
	  
	  
}}



