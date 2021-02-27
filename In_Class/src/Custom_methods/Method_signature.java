package Custom_methods;

public class Method_signature {

	public static void main(String[] args) {
		
		String username = "Jane.Doe";
		String underscore = ".";
		
		String firstName = getFirstName(username, underscore);
		
		System.out.println(firstName);
		
		// COME BACK AT 11:40
		

	}
	
 // modifier         // return type     //method name
	public   static   void              Practice_method() {  // method body
		System.out.println("Hi, I'm here to practice");
	}
	 
	                                    // parameters, can have multiple parameters inside perentacies 
	 private static String getFirstName(String name, String divideWith) { 
		 String firstName = name.substring(0, name.indexOf(divideWith));
		 return firstName;	 
	 }
	
	/*
	 *  Modifiers in java:
	 *  
	 *  public, private, protected, default
	 *  
	 *  
	 *  Return types in a methods:
	 *  
	 *  void - return nothing;
	 *  String - returns string
	 *  int - returns integer
	 *  boolean
	 *  short
	 *  long
	 *  double
	 *  float
	 *  bite
	 *  char
	 *  
	 *  Parameters in a custom method - is a parameters that your method requires to 
	 *  
	 */
	 
	 /*
	  * Step by step instruction on how to create a custom method
	  * 
	  * 1. Start with any access modifier you think it's right for your case
	  * 2. Add static to your method signature
	  * 3. Choose a return type of your method - means whatever you want to return.
	  * 4. Add a method name.
	  * 5. Add parameters if needed.
	  * 6. Add a method body. -  { method body }
	  * 7. Add a return keyword if your return type is other then void.
	  */
	 
 // access modifier  // return type  // method name	- required fields      // method parameters - optional (if needed)
	 public static        int          AddTwoNumbers                     (int firstNumber, int secondNumber) {  // non-static method can access static and non-static methods
		 return firstNumber + secondNumber;
		 //return 123;
	 }
	 
	 

}
