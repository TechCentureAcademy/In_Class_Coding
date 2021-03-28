package Practice;

public final class Final_Practice extends Inheritance_verification {
	
	public final int ssnnumber = 123456789;

	public static void main(String[] args) {
		   Final_Practice practice = new Final_Practice();  
           System.out.println(practice.ssnnumber);
           
          // practice.ssnnumber = 1234; --> going to complain, can't assign the value to final variable
	}
	
	
	// Static members can access only static members
	// Non static members can access both static and 
	// non static members
	
	// COME BACK AT 8:45

}
