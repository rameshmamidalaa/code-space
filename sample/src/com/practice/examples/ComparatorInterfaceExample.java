/**
 * 
 */
package com.practice.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ramesh_Mamidala
 *
 * Example: Sorting Custom object by writing the inner class Comparator interface
 * Sorting ArrayList<Object> multiple properties with Comparator
 */
public class ComparatorInterfaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<StudentComparator> studentList = new ArrayList<StudentComparator>();
		studentList.add(new StudentComparator("Chaithanya", 223, 26));
		studentList.add(new StudentComparator("Rahul", 245, 24));
		studentList.add(new StudentComparator("Ramesh", 209, 32));
		/*Sorting based on Student Name property*/
		Collections.sort(studentList, StudentComparator.stuNameComparator);
		//Used Java8 ::: Method Reference 
		Collections.sort(studentList, StudentComparator.stuNameComparator::compare);
		System.out.println("Student list after Ascending order - student name by using stuNameComparator:::");
		/*for(StudentComparator student: studentList) {
			System.out.println(student);
		}*/
		studentList.forEach(student -> System.out.println(student)); // Used Java8 :: Lambda feature along with forEach method of List  instead of above foreach loop.
		System.out.println("-------------------------------------------------\n");
		
		/*Sorting based on Rollno property */
		Collections.sort(studentList, StudentComparator.rollNoComparator);
		System.out.println("Student list after Ascending order - age by using rollNoComparator:::");
		/*for(StudentComparator student: studentList) {
			System.out.println(student);
		}*/
		
		studentList.forEach((student) -> System.out.println(student));
		
		System.out.println("-------------------------------------------------"+System.getProperty("file.encoding"));
	}

}
