package algorithms.searching;

import algorithms.sorting.BubbleSort;
import algorithms.sorting.Generics;

public class SequentialSeach extends BubbleSort {

	public static void main(String[] args) {
		int[] numbers = {40, 7, 59, 4, 1};
		Generics.displayValues(numbers);
		sequentialSearchAlg(numbers, 13);
		sequentialSearchAlg(numbers, 7);
		
		BubbleSort.optimizedbubbleSort(numbers);
		Generics.displayValues(numbers);

	}

	static void sequentialSearchAlg(int[] numbers, int value) {
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == value) {
				System.out.println("The number " + value + " is at position " + i + " in the list");
				return;
			}
		}
		System.out.println(" The number " + value + " is not in the list");
	}

}
