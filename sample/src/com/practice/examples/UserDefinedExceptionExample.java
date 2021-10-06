/**
 * 
 */
package com.practice.examples;

/**
 * @author Ramesh_Mamidala
 *
 */

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1390680802940774366L;
	String strVal;
	
	public MyException(String strValue) {
		strVal = strValue;
	}
	
	public String toString() {
		return ("My Exception Occured:::"+ strVal);
	}
	
}
public class UserDefinedExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block::");
			throw new MyException("This is my error message::");
			
		}catch(MyException exp) {
			System.out.println("Catch Block");
			System.out.println(exp);
		}

	}

}
