package Inheritance;

public class Mercedes extends Car {

	public Mercedes(String make, String model, int year) {
		super(make, model, year);
	}
	
	public static void main(String[] args) {
		Mercedes mers = new Mercedes("Mercedes", "SLK-250", 2020);
		mers.print();
		
	}

}
