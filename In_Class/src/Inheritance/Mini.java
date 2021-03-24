package Inheritance;

public class Mini extends Car {

	public Mini(String make, String model, int year) {
		super(make, model, year);
	}
	
	public static void main(String[] args) {
		Mini cooper = new Mini("Mini", "Cooper S", 2021);
		cooper.print();
	}
	

}
