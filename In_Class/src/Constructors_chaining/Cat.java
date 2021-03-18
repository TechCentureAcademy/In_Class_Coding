package Constructors_chaining;

public class Cat {

	// breed, gender, size, age, eye color, name. - all parameters

	// to fix the position press Ctrl + Shift + F
	
	
	// breed, gender, name. - main parameters
	private static String breed;
	private static String name;
	private char gender;

	public String size, eyeColor;
	public int age;

	public Cat() {
		this('F');
		System.out.println("Giving you a female cat, good luck!");
	}

	// COME BACK AT 9:10

	public Cat(String breed, String name, char gender) { // the last one that is going to identify the most important
															// parameters
		this("midium fat", "Blue", 2);
		this.breed = breed;
		this.gender = gender;
		this.name = name;
		System.out.println(
				"Your cat's breed is: " + breed + " and your cats name is: " + name + " and the gender is: " + gender);
	}

	public Cat(char gender) { // this constructor only when we care about the gender
		this("Persian", "Elvis", gender);
		if (gender == 'M') {
			System.out.println("The cat is male");
		} else {
			System.out.println("The cat is female");
		}
	}

	public Cat(String breed, String name) { // this constructor only when we care about the name and a breed
		this(breed, name, 'F');
		if (breed.equals("sphynx")) {
			System.out.println("The cat is hearless");
		} else {
			System.out.println("Your house will be a mess");
		}
		if (name.equals("Vasya")) {
			System.out.println("Cat is russian and drinks Vodka");
		} else if (name.equals("Rodger")) {
			System.out.println("The cat is British");
		} else if (name.equals("Pedro")) {
			System.out.println("The cat is Brazilian");
		} else {
			System.out.println("The cat is traveler");
		}
	}

	public Cat(String size, String eyeColor, int age) { // this constructor will provide optional parameters only
		this.size = size;
		this.eyeColor = eyeColor;
		this.age = age;
	}

	public static void main(String[] args) {

		// Cat catRodger = new Cat("British shorthair", "Rodger"); // here we only want
		// to specify the breed and a name
		Cat femaleCat = new Cat('F'); // here we only want to specify the gender

	}

}
