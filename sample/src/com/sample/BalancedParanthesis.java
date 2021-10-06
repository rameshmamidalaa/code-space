/**
 * 
 */
package com.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Ramesh_Mamidala
 *
 */
public class BalancedParanthesis {

	private static final Map<Character, Character> paranthesisMap = new HashMap<Character, Character>();
	static {

		paranthesisMap.put('[', ']');
		paranthesisMap.put('(', ')');
		paranthesisMap.put('[', ']');
		paranthesisMap.put('{', '}');

	}

	public static boolean isValid(String input) {

		if (input.length() == 0) {
			throw new IllegalArgumentException("String should be greaterthan zero");
		}

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			Character currChar = input.charAt(i);

			if (paranthesisMap.keySet().contains(currChar)) {
				stack.push(currChar);
			} else if (paranthesisMap.values().contains(currChar)) {
				if (!stack.empty() && paranthesisMap.get(stack.peek()) == currChar) {
					stack.pop();
				} else {
					return false;
				}

			}
		}
		return stack.empty();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// [a+2]+{d}-(abc) : TRUE
		// [a+2+{d}]-(abc) : TRUE
		// [a+2+{d]+a}-(abc) - interleaving : FALSE
		// [a+2+{d}-(abc)] : TRUE
		System.out.println(isValid("[a+2+{d]+a}-(abc)"));
	}

}
