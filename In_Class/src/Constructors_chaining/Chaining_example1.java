package Constructors_chaining;

public class Chaining_example1 {
	
	public Chaining_example1() {
		this(5);
		System.out.println("Adding url to open --> amazon.com");
	}
	
	// COME BACK AT 8:10
	
	public Chaining_example1(int number) {
		this("Hi there");
		System.out.println("Constructor with integer " + number);
	}
	
	public Chaining_example1(String text) {
		System.out.println("Constructor with string " + text);
	}
	
	public static void main(String[] args) {
		//Chaining_example1 example = new Chaining_example1();
		
		int number1 = 10;
		int number2 = 25;
		
		int result = AddTwoNumbers(number1, number2);
		
		System.out.println("Please provide two numbers");
		
		System.out.println("The result is: " + result);
	}
	
	
	public static int AddTwoNumbers(int first, int second) {
		return first + second;
	}
}