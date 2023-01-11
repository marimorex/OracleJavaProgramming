package algorithms.sorting;

public class BubbleSort {

	//driver
	public static void main(String[] args) {
		int[] numbers = {40, 7, 59, 4, 1};
		Generics.displayValues(numbers);
		bubbleSort(numbers);
		Generics.displayValues(numbers);
		optimizedbubbleSort(numbers);
	}
	
	public static void bubbleSort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length-1; j++) {
				// if the numbers are not in order 
				if (numbers[j]>numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;					
				}
			}
		}
	}
	
	public static void optimizedbubbleSort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			boolean flag = false;
			for (int j = 0; j < numbers.length-1; j++) {
				// if the numbers are not in order 
				if (numbers[j]>numbers[j+1]) {
					flag = true;
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;					
				}
			}
			// no swapping happened array is sorted, Exit. 
			if(!flag) return; 
		}
	}
	

}
