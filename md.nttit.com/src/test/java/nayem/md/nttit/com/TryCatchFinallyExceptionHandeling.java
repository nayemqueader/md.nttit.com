package nayem.md.nttit.com;

public class TryCatchFinallyExceptionHandeling {

	public static void main(String[] args) {
	
		try {
		int [] number = {1,2,3,4,5};
		number[0] = 6;
		
		System.out.println(number[10]);
		}
		catch  (Exception e) {
			System.out.println("run time error");
			
		}
		try {
			int [] number1 = {1,2,3,4,5};
		
			
			System.out.println(number1[4]);
			}
			catch  (Exception e) {
				System.out.println("run time error1");
				
			}
		
		//finally statement 
		finally {
			System.out.println("I dont care execute me");
		}
		

	}

}
