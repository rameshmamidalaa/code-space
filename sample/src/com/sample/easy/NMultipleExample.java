/**
 * 
 */
package com.sample.easy;

import java.util.Scanner;

/**
 * @author Ramesh_Mamidala
 *
 */
public class NMultipleExample {
	private static final Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int N = sc.nextInt();
		if (N == 2 || N <= 20) {
			for (int i = 1; i <= 10; i++) {
				int result = N * i;
				System.out.println(N +" " + "x"+" " + i +" "+ "="+" " + result + "\n");
			}
		} else {
			System.out.println("Contraints for the input is 2 <= N <= 20");
		}
		sc.close();

	}

}
