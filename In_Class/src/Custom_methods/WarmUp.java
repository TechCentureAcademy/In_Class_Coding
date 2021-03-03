package Custom_methods;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {

		/*
		 * Task 1: Looper
		 * 
		 * Create a custom method to print all numbers, starting from smaller to the
		 * grater one.
		 * 
		 * Example output:
		 * 
		 * Enter first number: 69 Enter second number: 36
		 * 
		 * 25, 26, 27, 28..... 45, 46. Done
		 */
		// Getting two numbers
		int firstNumber = getTheNumber();	
		int secondNumber = getTheNumber();
		
		// printing all numbers from smaller to the greater
		printAllNumbers(firstNumber, secondNumber);
		

	}

	public static int getTheNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the number!");
		int number = scanner.nextInt();
		return number;	
	}

	public static void printAllNumbers(int firstNum, int secondNum) {
		if(firstNum < secondNum) {
			for(int index = firstNum; index <= secondNum; index++) {
				System.out.print(index + ", ");
			}
		} else 
			for(int index = secondNum; index <= firstNum; index++) {
				System.out.print(index + ", ");
			}
		
	}
}
