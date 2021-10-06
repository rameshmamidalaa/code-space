/**
 * 
 */
package com.practice.examples;

/**
 * @author Ramesh_Mamidala
 *
 */
public class InstanceOfExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = new Integer(5);
		if(a instanceof java.lang.Integer)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
