/**
 * 
 */
package com.practice.examples;

/**
 * @author Ramesh_Mamidala
 *
 */
public class Subclass extends Superclass {
	
	public Subclass() {
		super(2,4);
	}
	
	public void display(String str) throws RuntimeException {
		super.display("I came from Subclass");
		System.out.println("I am in Sub class:::"+str);
			
	}

}
