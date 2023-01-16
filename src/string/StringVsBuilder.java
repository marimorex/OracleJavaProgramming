package string;

public class StringVsBuilder {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Learning Java with Oracle");
		
		/*String str2 ="Test immutability";
		
		// diplay the identifying hashCodes for each object 
		System.out.println("StringBuilder: " + str.hashCode());
		System.out.println("StringBuilder: " + str2.hashCode());
		
		str.replace(0,str.length(),"HelloWorld");
		str2 = "HelloWorld";
		
		// diplay the identifying hashCodes for each object 
		System.out.println("StringBuilder: " + str.hashCode());
		System.out.println("StringBuilder: " + str2.hashCode());
		*/
		// display string 
		System.out.println("String = " + str);
		
		//shared StringBuilder and String methods 
		System.out.println("The length of the text is: " + str.length());
		System.out.println("The character at the begining is: "+ str.charAt(0));
		System.out.println("The second character is: " + str.charAt(1));
		System.out.println("The position of the start of the text /acl/ is: " + str.indexOf("acl"));
		System.out.println("The fllowing text is included within the String: " + str.substring(1,4));
	
		// reverse characters if the StringBuilder 
		System.out.println("reverse = "+ str.reverse());
		
		// reverse again 
		System.out.println("reverse = "+ str.reverse());
		
		// add characters to the end of the existing string 
		str.append(" is fun");
		System.out.println("Appended string = " + str );
	
		// delete characters by specifying the start and end position 
		str.delete(8, 13);
		System.out.println("Deleted String = " + str);
		
		//insert a new string into an existing string 
		str.insert(8, " Java Programming");
		System.out.println("Inserterd String = "+str);
	
		//replace an existing section of a string with another string 
		str.replace(13, 25, " String Processing");
		System.out.println("Replaced String = "+ str);
		
		// display the position of a given String value 
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("Q"));
		
		//display the position of a given String value 
		//after a specified location 
		System.out.println(str.indexOf("a",7));
	}

}
