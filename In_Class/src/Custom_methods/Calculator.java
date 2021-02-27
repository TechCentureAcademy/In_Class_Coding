package Custom_methods;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		// saving the first number
		double numberOne = getNumberFromScanner();
		
		// saving the second number
		double numberTwo = getNumberFromScanner();
		
		// verifying plus method
		double AdditionResult = Plus(numberOne, numberTwo);
		System.out.println("Addition verification of " + numberOne + " and " + numberTwo + " = " + AdditionResult);
		
		// verifying minus method
		double minusResult = Minus(numberOne, numberTwo);
		System.out.println("Minus verification of " + numberOne + " and " + numberTwo + " = " + minusResult);
		
		// verify multiply method
		double multiplyResult = Multiply(numberOne, numberTwo);
		System.out.println("Multiply verification of " + numberOne + " and " + numberTwo + " = " + multiplyResult);
		
		// verify divide method
		double divisionResult = Divide(numberOne, numberTwo);
		System.out.println("Divide verification of " + numberOne + " and " + numberTwo + " = " + divisionResult);
		
		
	}
	
	
	public static double Plus(double firstNumber, double secondNumber) {
		double sum = firstNumber + secondNumber;  // or you can add return right away: return firstNumber + secondNumber;
		return sum;
	}
	
	public static double Minus(double firstNumber, double secondNumber) {
		double result = 0;
		if(firstNumber >= secondNumber) {
			result = firstNumber - secondNumber;  // you can have return keyword - return firstNumber - secondNumber;  
		} else {
			result = secondNumber - firstNumber;  // you can have return keyword - return secondNumber - firstNumber;
		}
		return result;
	}
	
	public static double Multiply(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public static double Divide(double firstNumber, double secondNumber) {
		double result = 0;
		if(secondNumber != 0) {
			result = firstNumber/secondNumber;  // you can have return keyword - return firstNumber/secondNumber;
		} else {
			System.out.println("We cannot divide by 0");  // you can have return keyword - return 0;
		}
		return result;
	}
	
	public static double getNumberFromScanner() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number!");
		return scan.nextDouble();
	}

}
