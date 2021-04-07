package Abstraction_practice;

public abstract class Animal {
	
	public int animalAge;
	
	public Animal(int age) {
		this.animalAge = age;
	}
	
	public abstract void sound();
	
	public void sleep() {
		System.out.println("Zzzzzz");
	}   
	
	//  abstract class can be nested? 

}

  abstract class Birds extends Animal {

	public Birds(int age) {
		super(age);
	}
	  
  }

  class Pig extends Animal {

	public Pig(int age) {
		super(age);
	}

	@Override
	public void sound() {
		System.out.println("We we");
	}
	
}

class Main {
	
	public static void main(String[] args) {
		Animal animal = new Pig(5);
		animal.sound(); // We we
		animal.sleep(); // Zzzzzz
		
		Pig pig = new Pig(1);
		pig.sound();
		pig.sleep();
	}
}
