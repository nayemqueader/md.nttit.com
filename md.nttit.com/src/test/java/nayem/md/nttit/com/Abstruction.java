package nayem.md.nttit.com;

public abstract class Abstruction {
	
	public abstract void idea1(); 
	public abstract void fblogin();
	public abstract void fblogout();
	public abstract void fbsignup();
	
	public void fbhomepage(String first_name) {
		System.out.println(first_name);
	}  // non abstraction method
	
	public static void main(String[] args) {	
//abstraction is quality of dealing with ideas rather than events.
// It is the process of hiding implementation details/body,code..
//we use abstract keyword before class name.
//we can not create any object for abstraction class.
// this method does not have any body
// to access abstract class it must be inherited by other class
			
	}
}
