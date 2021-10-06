/**
 * 
 */
package com.sample;

/**
 * @author Ramesh_Mamidala
 *
 */
public class Ladder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		args = new String[] {"x"};
		try {
			System.out.println(doStuff(args));
		}catch (Exception e) {
			System.out.println("exec");
		}
		doStuff(args);
	}
	static int doStuff(String[] args) {
		return Integer.parseInt(args[0]);
	}

}
