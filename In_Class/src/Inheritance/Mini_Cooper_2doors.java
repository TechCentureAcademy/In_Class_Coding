package Inheritance;

public class Mini_Cooper_2doors extends Mini {

	public Mini_Cooper_2doors(String make, String model, int year) {
		super(make, model, year);
	}
	
	public static void main(String[] args) {
		Mini_Cooper_2doors cooper = new Mini_Cooper_2doors("Mini", "Cooper 2 door S", 2021);
		cooper.print();
		System.out.println(cooper);
	}

}
