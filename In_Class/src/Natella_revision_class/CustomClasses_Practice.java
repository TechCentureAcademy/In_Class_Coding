package Natella_revision_class;

public class CustomClasses_Practice {
	
	// Create a custom class for Rectangle: Perimeter, Area
	
	public static void main(String[] args) {
		Rectangle myPersonalRectangle = new Rectangle();
		
		double length = 46.8;
		double width = 23.6;
		
		double perimeter = myPersonalRectangle.Perimeter(length, width);
		
		double area = myPersonalRectangle.Area(length, width);
		
		System.out.println("My rectangle perimeter is: " + perimeter + " and area is: " + area);
		
	}

}


/*
 * 
 *   Create Class student - including a variable ssn, generate getters and setters. 
 *   And for a setter before setting the ssn, make sure it's 9 digit
 * 
 * 
*/


