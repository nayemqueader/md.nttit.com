package nayem.md.nttit.com;

public class MultiDimOrTwoDim {

	public static void main(String[] args) {
		
//Multidimensional Array
		
		int[][] numbers = {{2,4,6,8},{1,3,5,7}} ;
		
	//	int x= numbers[1][3];
	//	System.out.println(x);
		try {
		for(int a=0; a<numbers.length; ++a) {
			for( int b=0; b<numbers[a].length; ++b) {
			System.out.println(numbers[a][b]);}
		}}
		catch (Exception e) {System.out.println("error");}
		
		// try catch block, how you handle exception 
		try {
			// codes
			}
		catch(Exception e) {
			//code to handle error
		}
	
}}
