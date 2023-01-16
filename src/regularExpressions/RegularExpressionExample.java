package regularExpressions;

public class RegularExpressionExample {

	public static void main(String[] args) {
		if(getAnimal("CAt")) System.out.println("This is a valid Aniaml");
		else System.out.println("This is not a valid Animal");
	}
	public static boolean getAnimal(String animal) {
		//if the animal is cat or dog, returns a true, else false, 
		// only validates the exact words, "Dog" wont work
		//return animal.matches("cat|dog");
		
		// square brackets allow character variability 
		return animal.matches("[Cc]at|[Dd]og");
	}

}
