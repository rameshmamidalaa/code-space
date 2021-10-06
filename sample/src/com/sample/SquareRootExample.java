/**
 * 
 */
package com.sample;

/**
 * @author Ramesh_Mamidala
 *
 */


public class SquareRootExample {

    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100000000;

    public void run() {
        int cnt = 0;
        for (int i = MIN_NUM; i <= MAX_NUM; i++) {
            if (isPerfectSquare(i)) {
                cnt++;
                System.out.println(cnt + ": " + (int) Math.sqrt(i) + ": " + i);
            }
        }
    }

    private boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }
}
