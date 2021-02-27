package Custom_methods;

public class Method_signature {

	public static void main(String[] args) {
		
		String username = "Jane.Doe";
		String underscore = ".";
		
		String firstName = getFirstName(username, underscore);
		
		System.out.println(firstName);
		

	}
	
 // modifier         // return type     //method name
	public   static   void              Practice_method() {
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

}
