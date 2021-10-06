/**
 * 
 */
package com.practice.examples;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author Ramesh_Mamidala
 *
 */
public class PriorityQueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		pQueue.add("C");
		pQueue.add("C++");
		pQueue.offer("Java");
		pQueue.add("Python");
		
		try {
			if(!pQueue.isEmpty()) {
				System.out.println("Head value using peek method:" +pQueue.peek());
				System.out.println("The elements of the pQueue:");
				Iterator<String> itrAllElements = pQueue.iterator();
				while(itrAllElements.hasNext()) {
					System.out.println(itrAllElements.next());
				}
				// Removing the top priority element (or head) and
		        // printing the modified pQueue
				pQueue.poll();
				System.out.println("After removing an element with poll method:");
				for(String strQueue: pQueue) {
					System.out.println(strQueue);
				}
				//Remove Java element 
				pQueue.remove("Java");
				System.out.println("After removing Java with remove method: ");
				for(String strRemoveEleQueue: pQueue) {
					System.out.println(strRemoveEleQueue);
				}
				//Check if an element is present
				boolean b = pQueue.contains("C");
				System.out.println("PriorityQueue contains C or not" +b);
				//Get objects from the pQueue in an array and print the array.
				Object[] objArr = pQueue.toArray();
				System.out.println("Value in array: ");
				for(Object objValue: objArr) {
					System.out.println(objValue.toString());
				}
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
