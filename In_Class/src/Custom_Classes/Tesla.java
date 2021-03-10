package Custom_Classes;

public class Tesla {

	public static void main(String[] args) {
		
		Car tesla = new Car(2021, "Tesla Roadster");
		
		System.out.println("Car model: " + tesla.getModelName());
		System.out.println("Car year: " + tesla.getModelYear());

	}

}
