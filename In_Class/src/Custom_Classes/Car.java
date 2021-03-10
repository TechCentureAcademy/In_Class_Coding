package Custom_Classes;

public class Car {

	/*
	 * Create a class Car with two variables:
	 * 
	 * int modelYear; String modelName; - done
	 * 
	 * Create a custom constructor that accepts two parameters int and String. - done
	 * 
	 * Create another class called (any car model you like) Inside the main method
	 * instantiate an object of a Car.java and print out car model and a year. - done
	 */
	
	public Car(int year, String model) {
		setModelYear(year);
		setModelName(model);
	}
	
	private int modelYear;
	private String modelName;
	
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	

}
