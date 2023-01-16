package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsMatcher {
	public static void main(String[] args) {
		//create the patter 
		Pattern p = Pattern.compile("(J|j)ava");
		//create the initial string 
		String str= "Java courses are the best! You have got to love java.";
		//print the contents of the string to screen 
		System.out.println(str);
		//Initialize the matcher 
		Matcher m = p.matcher(str);
		//replace all pattern occurrences with the new substring 
		str = m.replaceAll("Oracle");
		//print the contest of the new string to the screen 
		System.out.println(str);
	}
}
