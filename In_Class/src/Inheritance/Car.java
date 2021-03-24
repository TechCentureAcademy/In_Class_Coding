package Inheritance;

public class Car {
	
	/*
	 * Create Car class with below parameters: make, model, year. Create a method to print those parameters
	 * Create couple classes with a different Car Makers. Inherit from the Car class
	 * Create models classes for each make.
	 */
	
	String make, model;
	int year;
	
	public void print() {
		System.out.println(make + " " + model + " " + year);
	}
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Car(String make, int year) {
		this.make = make;
		this.year = year;
	}
	
	public Car(String model) {
		this.model = model;
	}

}
