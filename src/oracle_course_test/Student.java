package oracle_course_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student {

	String name;
	
	
	public static void main(String[] args) {
	
		ArrayList<String> studentNames = new ArrayList<String>();
		addStudents(studentNames);
		displayStudents(studentNames);
		Collections.sort(studentNames);
		displayStudents(studentNames);
	}
	
	
	 public Student()
	 {
		 super();
	   System.out.print("1");
	 
	   System.out.print("2");
	 }
	
	 public static void addStudents(ArrayList<String> studentNames) {
		 studentNames.add("Mark");
		 studentNames.add("Andrew");
		 studentNames.add("Beth");
	 }
	 
	 public static void displayStudents(ArrayList<String> studentNames) {
		 for (String name : studentNames) {
			 System.out.println("/n Student Name: " + name);
			
		}
	 }

}
