/**
 * 
 */
package com.practice.examples;

/**
 * @author Ramesh_Mamidala
 *
 */

class InvalidProductException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4275943921884308200L;
	
	public InvalidProductException(String str) {
		super(str);
	}
	
}
public class UserDefinedExceptionExampleTwo {
	
	void productCheck(int weight) throws InvalidProductException {
		if(weight < 100) {
			throw new InvalidProductException("Invalid Product");
		} else {
			System.out.println("Valid Product");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserDefinedExceptionExampleTwo ude = new UserDefinedExceptionExampleTwo();
		try {
			ude.productCheck(10);
			
		}catch(InvalidProductException ie ) {
			System.out.println("Caught the exception::");
			System.out.println(ie.getMessage());
		}
	}
}
