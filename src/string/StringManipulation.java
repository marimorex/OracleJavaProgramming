package string;

import java.util.ArrayList;
import java.util.Collections;

public class StringManipulation {

	public static void main(String[] args) {
		String sentence = "Split this String";
		ArrayList<String> words = new ArrayList<String>();
		stringSentenceSplit(sentence, words);
		printArray(words);
		
		System.out.println("The array has " + words.size() + " words");
		Collections.sort(words);
		System.out.println(words);
		
		String sentence2 = "This is my sentence";
		
		String[] words2 = sentence2.split(" ");
		for (String wordd : words2) System.out.print(wordd + ", ");
		String[] tokens = sentence2.split("i");
		for (String token : tokens) System.out.print(token + ", ");
	}

	public static void stringSentenceSplit(String sentence, ArrayList<String> words ) {
		while (!sentence.isEmpty()){
			for (int i = 0; i < sentence.length(); i++) {
				if(i == sentence.length()-1) { // end of the sentence 
					words.add(sentence.substring(0)); // add what is left of the sentence. 
					sentence ="";
					break;
				}
				else if(sentence.charAt(i)==' ') { // we find a white space
					words.add(sentence.substring(0, i)); // copy the word into the arrayList 
					sentence = sentence.substring(i+1);	 // redefine the sentence without the previous word. 
					break;
				}
			}
		}
	}
	
	public static void printArray(ArrayList<String> array) {
		for (String a : array) {
			System.out.println(a);
			
		}
	}
}
