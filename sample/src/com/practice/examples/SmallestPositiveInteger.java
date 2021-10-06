/**
 * 
 */
package com.practice.examples;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ramesh_Mamidala
 *
 */
public class SmallestPositiveInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 //int[] A = { 1, 3, 6, 4, 1, 2 };
		// int[] A = { 1, 2, 3 };
		int[] A = { -1, -3 };
		System.out.println(solution(A));

	}

	/*
	 * public static int solution(int[] A) { Map<Integer, Integer> map = new
	 * HashMap<Integer, Integer>(A.length); // O(n) space for (int i : A) // O(N) {
	 * if (!map.containsKey(i)) { map.put(i, i); } } int smallestPositive = 1; for
	 * (int i = 1; i < 1000001; i++) // ~O(N) { if (map.containsKey(i) && map.get(i)
	 * <= smallestPositive) { smallestPositive = map.get(i) + 1; } } return
	 * smallestPositive; }
	 */

	public static int solution(int[] A) {
		int N = A.length;
		Set<Integer> set = new HashSet<>();
		for (int a : A) {
			if (a > 0) {
				set.add(a);
			}
		}
		for (int i = 1; i <= N + 1; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return N;
	}
}
