package Inheritance;

public class TeslaRoadster extends Tesla {
	

	public TeslaRoadster(String model) {
		super(model);
	}
	
	public static void main(String[] args) {
		/*
		 *  What is going to happen on line 17?
		 *  1. It is going to execute parent Constructor Tesla with one parameter --> line 8 Class Tesla
		 *  2. It going to execute Tesla parent Constructor --> Car with 3 parameters --> line 18 Class Car
		 *  3. Inside Car constructor it is saving our provided parameters into variables
		 */
		TeslaRoadster newRoadster = new TeslaRoadster("Roadster 1st edition");
		newRoadster.print();
	}

}
