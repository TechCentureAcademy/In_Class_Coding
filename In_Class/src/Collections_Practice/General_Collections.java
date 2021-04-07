package Collections_Practice;

import java.util.ArrayList;

public class General_Collections {
	
	
	// A Collection is a group of individual objects represented as a single unit
	
	// Arraylist is a part of Collection framework and it provides us with dynamic arrays in Java.
	
	ArrayList<String> planets = new ArrayList<String>();
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Object> cars = new ArrayList<Object>();
		cars.add("Tesla");
		
		ArrayList<String> VolkswagenCars = new ArrayList<String>();
		VolkswagenCars.add("Laborghini");
		VolkswagenCars.add("Audi");
		cars.add(VolkswagenCars);
		cars.add("12345");
		
		System.out.println(cars);
		
		// int someNumber = (int) cars.get(2); --> going to fail
		
		int someNumber = Integer.parseInt(cars.get(2).toString());
		System.out.println(someNumber);
		
		
		ArrayList<String> newList = (ArrayList<String>) cars.get(1);
		
		System.out.println(newList);
		
		
		ArrayList<Integer> animalsAge = new ArrayList<Integer>();
		animalsAge.add(123123);
		
		int firstItem = animalsAge.get(0); // you can use also manual unboxing .intValue()
		
		
		
		// COME BACK AT 9:15
		
		
		
		
		
		
		
	}
	

}
