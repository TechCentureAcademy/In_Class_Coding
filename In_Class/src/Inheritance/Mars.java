package Inheritance;

public class Mars extends SolarSystem {
	
	public Mars() {
		System.out.println("Constructor 4");
	}
	
	public static void main(String[] args) {
		Moon moon = new Moon();
		Mars marsRover = new Mars();
	}

}
