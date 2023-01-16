package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		/*
		 * Pattern 
		 * - 5 o more characters, from A to F 
		 * - 0 or more of any characters
		 * */
		Pattern p = Pattern.compile("[A-F]{5,}.*");
		String str = "AAAAFhhh";
		
		System.out.println(isMatch(str, p));
	}
	private static boolean isMatch(String str, Pattern p) {
		Matcher match = p.matcher(str);
		return match.matches();
	}
	

}
