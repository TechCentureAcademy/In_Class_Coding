package Custom_Classes;

public class IceCreamMachine {

	public static void main(String[] args) {
		
		IceCream starbucks = new IceCream(3, "Dulce de leche"); // here we are calling out custom constructor
		
		starbucks.printFlavor(); // accessing a method from blue-print class IceCream
		
		IceCream dunkinDonuts = new IceCream(); // here we are calling our default constructor
		
		System.out.println(dunkinDonuts.flavor);
		System.out.println(starbucks.flavor);
		
		
		
		

	}

}
