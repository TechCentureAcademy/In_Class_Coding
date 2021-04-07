package Abstraction_practice;

public interface Universe {
	
	// Difference between abstract class and interface?
	
	/*
	 *  implements vs extends
	 *  We can use all member types in abstract class but we can have only variables and methods
	 *  In abstract class we can have abstract and non-abstract members, in interface we must have only abstract members (variables, methods).
	 *  We can implement multiple interfaces but we can extend only one class (regular or abstract)
	 *  In interface all variables are public static final by default and you have an option to create a different access modifier variable in abstract class
	 *  default method and static method
	 */
	
	default void doSomething() {
	}
	static void flyToMars() {
	}
	
	void flyToTheMoon();
	

	// COME BACK AT 8:10
	
}
