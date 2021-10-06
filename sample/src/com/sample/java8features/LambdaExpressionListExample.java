/**
 * 
 */
package com.sample.java8features;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ramesh_mamidala
 *
 * Iterating collections using foreach loop
 */
public class LambdaExpressionListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> listStr = new ArrayList<>();
		listStr.add("Ramesh");
		listStr.add("Madhuri");
		listStr.add("Ishika");
		listStr.add("Mamidala");
		
		listStr.forEach(
				// lambda expression
				(names) -> System.out.println("Names available in the LIST:::: "+names)
		);

	}

}
