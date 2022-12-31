package oracle_course_test;

import java.util.LinkedList;

public class LinkedListQueueExample {

	public static void main(String[] args) {
		LinkedList<String> lettersQueue = new LinkedList<String>();

		addElements(lettersQueue);
		displayElements(lettersQueue);
		removeEmelements(lettersQueue);
	}
	
	static void addElements(LinkedList<String> lettersQ) {
		lettersQ.add("A");
		lettersQ.add("B");
		lettersQ.add("C");
		lettersQ.add("D");
	}
	
	static void displayElements(LinkedList<String> lettersQ) {
		System.out.println("Linked List : " + lettersQ);
		System.out.println("Queue size : " + lettersQ.size());
	}
	
	static void removeEmelements(LinkedList<String> lettersQ) {
		while (!lettersQ.isEmpty()) {
			System.out.println(lettersQ.removeFirst());
			
		}
		System.out.println("Linked List Queue: " + lettersQ);
	}
		

}
