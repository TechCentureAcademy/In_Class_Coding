package Encapsulation;

//import Encapsulation.Encapsulation_examples;

public class Covid20 {
	
	public static void main(String[] args) {
		Encapsulation_examples covidSickness = new Encapsulation_examples();
		covidSickness.setSickness("New stamp of covid");
		System.out.println(covidSickness.getSickness());
		
		Encapsulation_examples flu = new Encapsulation_examples();
		System.out.println(flu.getSickness());
		
		flu.setSickness("It's just a regular flu");
		System.out.println(flu.getSickness()); // --> it's just a regular flu
		System.out.println(covidSickness.getSickness()); // --> New stamp of covid
	}
	
	
	// Practice task
	// create a first class Google --> by using encapsulation create search variable.
	// create second class MyFavoriteMovie --> create an object and set search variable 
	// to any of your favorite movies and print it out.

}
