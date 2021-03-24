package Inheritance;

public class Mini_Cooper_4doors extends Mini {

	public Mini_Cooper_4doors(String make, String model, int year) {
		super(make, model, year);
	}
	
	public static void main(String[] args) {
		Mini_Cooper_4doors cooper = new Mini_Cooper_4doors("Mini", "Cooper 4 door S", 2021);
		cooper.print();
	}

}
