package Custom_methods;

import java.util.Scanner;

public class toUpperCase_CustomMethod {

	public static void main(String[] args) {

		/*
		 * Task 2: First letter - Capital
		 * 
		 * Create three custom methods, together they should be able to change the first
		 * letter of each word to Upper Case.
		 * 
		 * For example: first method is accepting an input (Scanner), second is dividing
		 * the sentance into words and third one is changing the first letter of each
		 * work to Upper Case
		 * 
		 * 1. get the input 2. divide the sentance into words string[] =
		 * string.split(" ") 3. replace first letter to UpperCase for each word and
		 * print it together.
		 * 
		 * Example output:
		 * 
		 * java revision classes are the best --> input
		 * 
		 * Java Revision Classes Are The Best
		 * 
		 * 
		 * You can get a break any time from 8:45 until 9:25.
		 * 
		 */

		// I think java is complicated - example
		
		// calling first method to get the input (our sentance)
		String sentance = getTheSentance();
		
		// calling the second method to split the string into array
		String[] wordsSplit = splitIntoWords(sentance);
		
		// calling the third method to print the output
		printTheWordsToUpperCase(wordsSplit);

		

		

	}

	public static String getTheSentance() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the sentance");
		String sentance = scanner.nextLine();
		return sentance;
	}

	public static String[] splitIntoWords(String words) {
		// dividing string into array of words
		return words.split(" ");
	}

	public static void printTheWordsToUpperCase(String[] wordsAfterSplit) {
		// creating empty array to save my edited words to
		String[] newArray = new String[wordsAfterSplit.length];

		for (int index = 0; index < wordsAfterSplit.length; index++) {
			// if word has more then 1 letter I will substring and will do to UpperCase
			if (wordsAfterSplit[index].length() > 1) {
				newArray[index] = wordsAfterSplit[index].substring(0, 1).toUpperCase()
						+ wordsAfterSplit[index].substring(1);
				// else there is only 1 letter and we do it to UpperCase
			} else {
				newArray[index] = wordsAfterSplit[index].toUpperCase();
			}
			System.out.print(newArray[index] + " ");
		}
	}

}
