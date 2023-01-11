package oracle_course_test;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

	public static void main(String[] args) {
		
		ArrayList<Student2> studentNames = new ArrayList<Student2>();
		addStudents(studentNames);
		displayStudents(studentNames);
		Collections.sort(studentNames);
		displayStudents(studentNames);
	}
	
	 public static void addStudents(ArrayList<Student2> studentNames) {
		 studentNames.add(new Student2("Mark", "Mywords",95));
		 studentNames.add(new Student2("Andrew", "Apic", 45));
		 studentNames.add(new Student2("Beth","Tween",78));
	 }
	 
	 public static void displayStudents(ArrayList<Student2> studentNames) {
		 for (Student2 Student : studentNames) {
			 System.out.println("/n Student Name: " + Student);
			
		}
	 }
}
