/**
 * 
 */
package com.sample.easy;

import java.util.Scanner;

/**
 * @author Ramesh_Mamidala
 *
 */
public class NMultipleExampleUsingPrintf {
	private static final Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int N = sc.nextInt();
		if (N == 2 || N <= 20) {
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d x %d = %d%n", N, i, N*i);
			}
		} else {
			System.out.println("Here contraints for the input is 2 <= N <= 20");
		}
		sc.close();

	}

}
