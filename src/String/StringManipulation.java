package String;

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
