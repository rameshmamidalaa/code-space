/**
 * 
 */
package com.practice.examples;

/**
 * @author Ramesh_Mamidala
 *
 */
public class InheritanceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Superclass superC = new Subclass();
		superC.display("Hello");
		Subclass subC = new Subclass();
		subC.display("Hey");
		Superclass superCl = new Superclass(6,7);
		superCl.display("Hello");
	}

}
