/**
 * 
 */
package com.sample.java8features;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ramesh_Mamidala
 *
 */
public class LambdaExpressionMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a",10 );
		map.put("b", 20);
		map.put("c", 30);
		map.put("d", 40);
		
//		map.forEach((k,v) -> {
//			if(k == "c")
//			System.out.println("Value:::::"+v);
//		});
		map.forEach((k,v) -> System.out.println("Key::"+k+ "Value::"+v));
	}

}
