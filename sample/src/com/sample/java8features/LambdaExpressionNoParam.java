/**
 * 
 */
package com.sample.java8features;

/**
 * @author ramesh_mamidala
 * 
 * Java Lambda Expression with no parameter
 *
 */
public class LambdaExpressionNoParam {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// lambda expression with no parameter
		FunctionalInterfaceHello msg = () -> {
			return "Hello";
		};
		System.out.println(msg.sayHello());
	}

}
