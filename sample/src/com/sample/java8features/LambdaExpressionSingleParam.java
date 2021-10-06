/**
 * 
 */
package com.sample.java8features;

/**
 * @author ramesh_mamidala
 *
 * Java Lambda Expression with single parameter
 */
public class LambdaExpressionSingleParam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// lambda expression with single parameter num
		FunctionalInterfaceNum fNum = (num) -> num + 5;
		System.out.println("Total Sum::::"+fNum.incrementByFive(22));
	}

}
