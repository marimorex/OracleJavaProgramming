package oracle_course_test;

import java.util.LinkedList;

public class LinkedListStackExample {

	public static void main(String[] args) {
		LinkedList<String> letterStack = new LinkedList<String>();
		
		addElements(letterStack);
		displayElements(letterStack);
		removeEmelements(letterStack);
	}
	
	static void addElements(LinkedList<String> letterS) {
		letterS.push("A");
		letterS.push("B");
		letterS.push("C");
		letterS.push("D");
	}
	
	static void displayElements(LinkedList<String> letterS) {
		System.out.println("Linked List Stack: " + letterS);
		System.out.println("Stack Size: " + letterS.size());
	}

	static void removeEmelements(LinkedList<String> letterS) {
		while (!letterS.isEmpty()) {
			System.out.println(letterS.pop());		
		}
		System.out.println("Linked List Stack: " + letterS);
	}
}
