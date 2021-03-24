package Inheritance;

public class Earth extends SolarSystem {
	
	// if you have extends keyword --> super(); is going to be the 
	//                                 first line in your constructor
	public Earth() {
		System.out.println("Constructor 2");
	}
	
	public static void main(String[] args) {
		Earth ourPlanet = new Earth();
	}

}
