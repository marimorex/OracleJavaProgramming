package regularExpressions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsGroups {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String date;

		// Every () defines a group. 
		// Each group must be separated with a slash.
		// Group 1 and Group 2 are defined to consist of 2 digits each. 
		// Group 3 (the year) is defined to consist of 4 digits. 
		Pattern dateP= Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");

		date = getDate(in, dateP);
		if(validateDate(date)) System.out.println("US style date - " + date);
		in.close();
	}
	static String getDate(Scanner in, Pattern dateP) {
		String date;
		Matcher dateM;
		do {
			System.out.println("Enter a Date (dd/mm/yyyy): ");
			date = in.nextLine();
			dateM = dateP.matcher(date);
			if(dateM.matches() && validateDate(date)) {
				String day = dateM.group(1); // group 1 
				String month = dateM.group(2); // group 2
				String year = dateM.group(3); // group 3
				date = month + "/"+day +"/"+year;
				// it is still possible to get the whole matcher by calling .group(0)
			}else System.out.println("Incorrect date entered");

		}while(!dateM.matches());
		return date;
	}

	static boolean validateDate(String newDate) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		// Date must match the simpleDate pattern exactly 
		format.setLenient(false);
		//String date = newDate;
		try {
			format.parse(newDate);
			return true;
		}catch (ParseException e) {
			System.out.println(newDate + " is not valid according to "
					+ ((SimpleDateFormat) format).toPattern() + " pattern.");
			return false;
		}

	}
}
