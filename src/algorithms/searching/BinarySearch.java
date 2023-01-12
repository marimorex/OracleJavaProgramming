package algorithms.searching;

import algorithms.sorting.Generics;
import algorithms.sorting.SelectionSort;
public class BinarySearch {

	public static void main(String[] args) {
		int[] numbers = {40, 7, 59, 4, 1};
		Generics.displayValues(numbers);
		//binarySearchAlg(numbers,7);
		// in order to apply binary search, the data must be already sorted
		SelectionSort.selectionSort(numbers);
		Generics.displayValues(numbers);
		int found = binarySearchAlg(numbers,7);
		if(found !=-1) System.out.println("The number " + 7 + " is at position " + found + " in the list");
		else System.out.println("The number " + 7 + " is not in the list");

	}
	
	public static int binarySearchAlg(int[] numbers, int value) {
		int low=0;
		int high = numbers.length-1;
		while(high >= low) {
			int middle = (low+high)/2; // middle index 
			if(numbers[middle]== value) {
				return middle; // target value was found
			}
			if (numbers[middle] < value) low = middle +1;
			if (numbers[middle] > value) high = middle -1;
		}		
		return -1;
	}
}
