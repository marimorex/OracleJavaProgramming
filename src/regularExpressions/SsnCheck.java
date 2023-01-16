package regularExpressions;

import java.util.Scanner;

public class SsnCheck {
	/* Validation of a Social Security Number
	 * The correct Format: 
	 * - Three Numbers 
	 * - followed by a dash 
	 * - followed by two numbers 
	 * - followed by a dash
	 * - followed by four numbers 
	 * */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ssn;
		ssn= getSsn(in);
		evaluateSsn(ssn,validSsn(ssn));
		in.close();
	}
	
	public static boolean validSsn(String ssn) {
		return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
	}

	private static String getSsn(Scanner in) {
		System.out.println("Please enter your Social Security Number: ");
		return in.next();
	}
	
	public static void evaluateSsn(String ssn, boolean valid) {
		if(valid) System.out.println(ssn + " Is a Valid Social Security Number!");
		else System.out.println("Your Social Security Number is not valid! Must be in the format of (999-99-9999)");
	}
}
