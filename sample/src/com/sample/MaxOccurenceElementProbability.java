/**
 * 
 */
package com.sample;

/**
 * Here done the bug fixing.
 * @author Ramesh_Mamidala
 *
 */
public class MaxOccurenceElementProbability {
	
	static int solution(int M, int[] A) {
        int N = A.length;
        int[] count = new int[M + 1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;
        //int maxOccurence = 1; Commented as part of bug fixing
        int maxOccurence = 0;
        //int index = -1; Commented as part of bug fixing
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (count[A[i]] > 0) {
                int tmp = count[A[i]];
                if (tmp > maxOccurence) {
                    maxOccurence = tmp;
                    index = i;
                }
                count[A[i]] = tmp + 1;
            } else {
                count[A[i]] = 1;
            }
        }
        //return A[index]; Commented as part of bug fixing
        return N>0?A[index]:index;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {2,2,3,3,3,1,1,1};
        /*int[] a = {1,2,3,3,1,3,1,3,3,1,2,2,2,2,1};*/
        //(3, [1,2,3,3,1,3,1])
        System.out.println(solution(3, a));
        int[] b = {1,2,2};
        System.out.println(solution(3, b));
        int[] c = {};
        System.out.println(solution(3, c));

	}

}
