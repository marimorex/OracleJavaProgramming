package algorithms.sorting;

public class SelectionSort {
	//driver
	public static void main(String[] args) {
		int[] numbers = {40, 7, 59, 4, 1};
		Generics.displayValues(numbers);
		selectionSort(numbers);
		Generics.displayValues(numbers);
	}

	public static void selectionSort(int[] numbers) {
		int indexMin =0; // the index of the smallest number
		for (int i = 0; i < numbers.length; i++) {
			indexMin = i;
			
			for (int j = i+1; j < numbers.length; j++) {
				
				if(numbers[j]<numbers[indexMin]) { // if we d=find a smaller int
					indexMin = j;				   // set it as the min
				}				
			}
			// we have the index of the smallest int and can swap the values
			int temp = numbers[i]; // use temp to store the value
			numbers[i] = numbers[indexMin]; // swap the min value found to the current position 
			numbers[indexMin] = temp; // swap the current value to the possition of the minValue found
		}
	}
	
}
