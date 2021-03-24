package Inheritance;

public class SuperClass {
	
	public SuperClass() {
		System.out.println("Hi, this is SuperClass");
	}
	
	public SuperClass(String name) {
		System.out.println("Hi, this is Natella's overrided class");
	}
	int speed = 70;
	
	public void print() {
		System.out.println("We are driving with speed " + speed + " mph");
	}

}
