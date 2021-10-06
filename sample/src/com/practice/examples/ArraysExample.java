/**
 * 
 */
package com.practice.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Ramesh_Mamidala
 *
 */
public class ArraysExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 /*
	     * Integer class implements Comparable
	     * Interface so we can use the sort method
	     */
		Integer intArr[] = { 2, 1, 9, 6, 4, 5 };
		System.out.println("Before sorting:::");
		for (int unSortNumber : intArr) {
			System.out.println(unSortNumber);
		}
		/* 
		 * In Java8 Using Lambdas Feature
		 */
		List<Integer> listInt = Arrays.asList(intArr);
		listInt.forEach(unSort -> System.out.println(unSort));
		// Sort in Ascending order
		Arrays.sort(intArr);
		System.out.println("After sorting:::");
		for (int sortNumber : intArr) {
			System.out.println(sortNumber);
		}

		// BinarySearch Example after sorting the numbers
		int searchVal = 6;
		int retVal = Arrays.binarySearch(intArr, searchVal);
		System.out.println("The index of the element 6 is::" + retVal);

		// Sort in Descending order
		Arrays.sort(intArr, Collections.reverseOrder());
		System.out.println(
				"Array after the use of Collection.reverseOrder() and Arrays.sort:\n" + Arrays.toString(intArr));
		/*
	     * String class implements Comparable
	     * Interface so we can use the sort method
	     */
		System.out.println("Sorted String Array:: ");
		
		String[] namesStrArr = {"Steve", "Kyle", "Ram"};
		Arrays.sort(namesStrArr);
		System.out.println(Arrays.toString(namesStrArr));
		/*
	     * String class implements Comparable
	     * Interface so we can use the sort method
	     */
		System.out.println("Sorted List:: ");
		final List<String> fruitsList = new ArrayList<String>();
		fruitsList.add("Orange");
		fruitsList.add("Banana");
		fruitsList.add("Apple");
		fruitsList.add("Guava");
		fruitsList.add("Grapes");
		Collections.sort(fruitsList);
		for(String fruitStr: fruitsList) {
			System.out.println(fruitStr+", ");
		}
	}

}
