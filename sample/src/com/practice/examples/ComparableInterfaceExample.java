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
 *Example: Sorting Custom object by implementing Comparable interface
 *Sorting of ArrayList<Object> with Comparable
 */
public class ComparableInterfaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<StudentComparable> studentList = new ArrayList<StudentComparable>();
		studentList.add(new StudentComparable("Chaithanya", 223, 26));
		studentList.add(new StudentComparable("Rahul", 245, 24));
		studentList.add(new StudentComparable("Ramesh", 209, 32));
		Collections.sort(studentList);
		
		System.out.println("Student list after Ascending order - age by using comparable interface:::");
		for(StudentComparable student: studentList) {
			System.out.println(student);
		}
		// Java 8 - Lambda Expression
		studentList.forEach(student -> System.out.println(student));
		// Java 8 - Method Reference
		studentList.forEach(System.out::println);
		// Java 8 Stream API
		studentList.stream()
		.forEach(student -> System.out.println(student));
	}

}
