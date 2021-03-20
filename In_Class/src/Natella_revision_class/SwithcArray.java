package Natella_revision_class;

import java.util.Scanner;

public class SwithcArray {

	private String[] TopCompanies = { "Amazon", "Google", "Microsoft", "Apple", "Facebook" };
	private String myCompany;

	public void isMyCompany(String myCompany) {

		for (int index = 0; index < TopCompanies.length; index++) {
			if (myCompany.equals(TopCompanies[index])) {
				System.out.println("Yey!!! I work for one of a top companies");
			} else {
				System.out.println("I like my work anyway!");
			}
		}
	}
    
	// COME BACK AT 9:15
	
	public void isMyCompany2(String myCompany) {

		switch (myCompany) {
		case "Amazon":
			System.out.println("Yey!!! I work for one of a top companies");
			break;
		case "Google":
			System.out.println("Yey!!! I work for one of a top companies");
			break;
		default:
			System.out.println("I like my work anyway!");
			break;
		}
	}

	public String gettingMyComany() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your company name: ");
		String companyName = scan.nextLine();
		return companyName;
	}

}
