/**
 * 
 */
package com.practice.examples;

/**
 * @author Ramesh_Mamidala
 *
 */
public class Superclass {
	int result;

	public Superclass() {

	}

	public Superclass(int x, int y) {
		result = x + y;
		System.out.println("In two parameter Constructor of Super Class::" + result);
	}

	public void display(String str) throws NullPointerException {
		System.out.println("I am in Super Class:::::::" + str);
	}

}
