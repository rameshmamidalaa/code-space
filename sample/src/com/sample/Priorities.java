/**
 * 
 */
package com.sample;

import java.util.PriorityQueue;

/**
 * @author Ramesh_Mamidala
 *
 */
public class Priorities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue<String> x = new PriorityQueue<String>();
		x.add("d");
		x.add("l");
		x.add("b");
		x.offer("b");
		System.out.print(x.size() + " " + x.poll());
		System.out.print(" " + x.peek() + " " + x.poll());
		System.out.println(" " + x.poll() + " " + x.poll());
		
		

	}

}
