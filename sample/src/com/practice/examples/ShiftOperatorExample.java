/**
 * 
 */
package com.practice.examples;

/**
 * @author Ramesh_Mamidala
 *
 */
public class ShiftOperatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 15;
		int b = 15;
		a = a >> 3;
		System.out.println("Right shift operator means (divide) 15/2^3::::"+a);
		
		b = b >>> 3;
		System.out.println("Unsinged shift operator::::"+b);
		int c = 8;
		c = c << 3;
		System.out.println("Left Shift Operator means (multiplication) 8 * 2^3:::::"+c);

	}

}
