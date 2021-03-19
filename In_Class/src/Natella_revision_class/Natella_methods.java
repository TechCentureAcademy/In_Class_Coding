package Natella_revision_class;

import java.util.Scanner;

public class Natella_methods {
	
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Natella_methods gettingTemp = new Natella_methods();
		
		double F = gettingTemp.GettingTemperature();
		System.out.println("You enter temperature in Fahrenheit: " + F);
		
        System.out.println("Is that right?");
        String output = scan.nextLine();
        
        if(output.equalsIgnoreCase("yes")) {
        double C = ConvertingFtoC(F);
        System.out.println(F + " in celcius will be " + C);
        } else {
        	System.out.println("Please try again later");
        }
		
	}
	
	public static double ConvertingFtoC(double Fahrenheit) {
		return (Fahrenheit-32)*5/9.0;
	}
	
	public double GettingTemperature() {
		//Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the temperature in F: ");
		double Fahrenheit = scan.nextDouble();
		return Fahrenheit;
	}

}
