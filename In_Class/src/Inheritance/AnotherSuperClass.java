package Inheritance;

public class AnotherSuperClass {
	
	public AnotherSuperClass() {
		System.out.println("Hi, this is AnotherSuperClass!");
	}
	
	public AnotherSuperClass(int speed) {
		
	}
	
	int speed = 35;
	int carYear = 2020;
	String carModel = "Tesla";
	
	public void print() {
		System.out.println("My car is " + carModel + " and I bought it in " + carYear);
	}
	
	public static void main(String[] args) {
		First_Inheritance_Class test = new First_Inheritance_Class();
		
	}

}
