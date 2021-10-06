/**
 * 
 */
package com.sample;

/**
 * @author Ramesh_Mamidala
 *
 */
public class JacobJaydenProblemFix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = {2,3,4,5};
		solutionOne(2,3,A );

	}

	private static int solutionOne(int X, int Y, int[] A) {
		int N = A.length;
		int result = -1;
		int nX = 0;
		int nY = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] == X)
				nX += 1;
			else if (A[i] == Y)
				nY += 1;
			 if (nX == nY && (nX != 0 && nY != 0))
				result = i;
		}
		System.out.println("result:::::::"+result);
		return result;
	}
// Rankers & soldiers problem.
	public int solutionTwo(int[] ranks) {
		int[] arr = new int[100000];
		int result = 0;
		for (int x : ranks) {
			int num = arr[x];
			if (num > 0) {
				arr[x] = num + 1;
			} else {
				arr[x] = 1;
			}
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > 0 && arr[i + 1] > 0) {
				result = result + arr[i];
			}
		}

		return result;
	}

}
