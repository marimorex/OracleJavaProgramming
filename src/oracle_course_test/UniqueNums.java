package oracle_course_test;
import java.util.Scanner;

public class UniqueNums {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] numbers =  new int[5];
		
		int num=0, numValues = 0; 
		boolean valid = true;
		
		while (numValues < numbers.length) {
			do {
				valid = true;
				System.out.println("Please enter an unique number");
				num = in.nextInt();
				for (int num_i : numbers) {
					if(num == num_i) {
						valid = false;
						System.out.println("You entered " + num + " That number alredy exists");	
					}
				}					
			} while (!valid);
			numbers[numValues] = num;
			numValues ++;
			System.out.println("You entered " + num + " and is valid");
		}
		in.close();
		
		for(int numV: numbers) {
			System.out.println("Number Value: " + numV);
			
		}
	}
}
