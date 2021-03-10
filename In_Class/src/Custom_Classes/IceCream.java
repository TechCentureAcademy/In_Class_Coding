package Custom_Classes;

public class IceCream {

	int numberOfScoops;
	String flavor;
	
	private int SSN; // example

	public IceCream() {   // default constructor - is created by default 
		                  // if no other constructors were created
		                  // if you have any constructor (non-default) you need to create one manually
        numberOfScoops = 1;
        flavor = "Vanilla";
	}

	public IceCream(int scoops, String taste) { // custom constructor
		numberOfScoops = scoops;
		flavor = taste;
	}
	
	public IceCream(String otherFlavor, int otherScoops) {
		
	}
	
	public void printFlavor() {
		System.out.println(flavor);
	}
	
	public int verfication(int age, String homeAddress, String LastName) { // example
		// if all info is verified then we can access our private method
		return printSSN();
	}
	
	private int printSSN() { // example
		return SSN;
	}
	

}
