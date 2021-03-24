package Inheritance;

public class Tesla extends Car {
	
	static String make = "Tesla";
	static int year = 2021;

	public Tesla(String model) {
		super(make, model, year);
	}
	
	public Tesla(String make, int year) {
		super(make, year);
	}
	
	public static void main(String[] args) {
		//Tesla tesla = new Tesla("Tesla", "Roadster", 2021);
		//tesla.print();
		
		Tesla newTesla = new Tesla(make, year);
	}

}
