package regularExpressions;

import java.util.Scanner;

public class RhymeGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String animal;
		animal = getAnimal(in);
		evaluateRhyme(rhyminAnimal(animal));
		in.close();
	}
	
	private static boolean rhyminAnimal(String animal) {
		//return animal.matches("[a-zA-Z](at|AT)");
		
		// allow either 1 or 2 characters to come before the at|AT
		return animal.matches("[a-zA-Z]{1,2}(at|AT)");
	}
	private static String getAnimal(Scanner in) {
		System.out.println("Please enter the name of the animal: ");
		return in.next();
	}
	private static void evaluateRhyme(boolean value) {
		if(value) System.out.println("This animal rhymes with cat!");
		else System.out.println("This animal doesn't rhyme!");
	}

}
