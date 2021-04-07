package Wrappers;

public class ParseToPrimitive {

	//

	/*
	 * Write a program to convert String back to its primitive data types using
	 * parseXXX() methods and print them out
	 * 
	 * String rate = "5.8f"; String tax ="50.2"; String speed = "65"; String
	 * isAlreadySpring = "true";
	 * 
	 * 
	 * Example: String price ="100"; int x = Integer.parseInt(price); sout(x);
	 * 
	 */

	public static void main(String[] args) {
		String rate = "5.8f";
		String tax = "50.2";
		String speed = "65";
		String isAlreadySpring = "true";
		float floatRate = Float.parseFloat(rate);
		double doubleTax = Double.parseDouble(tax);
		int intSpeed = Integer.valueOf(speed);
		boolean bIsAlreadySpring = Boolean.parseBoolean(isAlreadySpring);
		System.out.println(floatRate);
		System.out.println(doubleTax);
		System.out.println(intSpeed);
		System.out.println(bIsAlreadySpring);
	}

}
