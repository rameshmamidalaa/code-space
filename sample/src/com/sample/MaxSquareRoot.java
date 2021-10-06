/**
 * 
 */
package com.sample;

/**
 * @author Ramesh_Mamidala
 *
 */
//Java program to count squares between a and b 
class CountSquares {

	static int countSquares(int a, int b) {
		int cnt = 0; // Initialize result

		// Traverse through all numbers
		for (int i = a; i <= b; i++)

			// Check if current number 'i' is perfect
			// square
			for (int j = 1; j * j <= i; j++)
				if (j * j == i)
					cnt++;
		return cnt;
	}
	static int countSquares2(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isPerfectSquare(i)) {
                cnt++;
            }
        }
		return cnt;
    }

	static int countSquaresMath(int x, int y) {
		int result = (int) (Math.floor(Math.sqrt(y)) - Math.ceil(Math.sqrt(x)) + 1);
		return result;
	}
	
	 public int solution(int A, int B) {
	        int upperLimit = (int) Math.sqrt(B);
	        int squares = 0;
	        for (int i = 1; i <= upperLimit; i++) {
	            if (i * i >= A && i * i <= B) {
	                squares++;
	            }
	        }
	        return squares;
	    }
	static boolean isPerfectSquare(int n) {
		if (n < 0)
		    return false;

		  long result = (long)(Math.sqrt(n));
		  return result*result == n;//3x3 = 9

	}
	
	static int countSquares3(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
        	long result = getSquareRoot(i);
            if (result*result == i) {
                cnt++;
                for(;;) {
                	
                }
            } 
        }
		return cnt;
    }
static long getSquareRoot(long i) {
	return  (long)(Math.sqrt(i));
}



}

//Driver Code 
public class MaxSquareRoot {
	public static void main(String[] args) {
		int a = 10, b = 20;
		CountSquares obj1 = new CountSquares();
		CountSquares obj2 = new CountSquares();
		//System.out.print("Count of squares is " + obj.countSquares(a, b));
		System.out.print("Count of squares is Math::::::::::::::" + obj1.countSquaresMath(a, b));
		System.out.print("Count of squares is " + obj2.solution(a, b));
	}
}
