package nayem.md.nttit.com;

public class Array {

	public static void main(String[] args) {
//int a=1;
		
		int[] Number = {1,2,3,4,5};
		String[] Fruits = {"apple","orange","banana","mango","grape"};
		String[] Car = {"toyota","honda","Kia","ford","Volvo"};
		double[] Des = {1.5,2.5,3.5,4.5,5.5};
		
		//Array works with index. Index start with 0
		System.out.println(Car[0]+" "+Des[3]+" "+Des[4]);

      // Fruits[0]="pineapple";
       System.out.println(Fruits[0]);
       
      // Array Length
       
       System.out.println(Car.length);
       
       //Loop Through Array
       for (int i=0; i<Number.length; i++) {
    	   System.out.println(Number[i]);}
    	  /* i++
    	   i=i+1=0+1=1
    	   i=i+1=1+1=2,3,4,5 */
    	   
    	 for (int j= 1; j<Fruits.length; j+=2) {
    		 System.out.println(Fruits[j]);
       }
       
       // 2nd way
    	 for (String k:Fruits) {System.out.println(k);}
    	 for (double l:Des) {System.out.println(l);}
    	 
    	 
    	 

}}
