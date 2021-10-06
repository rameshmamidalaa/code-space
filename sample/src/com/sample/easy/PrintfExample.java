/**
 * 
 */
package com.sample.easy;

import java.util.Scanner;

/**
 * @author Ramesh_Mamidala
 *
 *Java's "System.out.printf" (it is similar to printf function in C language) function can be used to print formatted output. 
 *The purpose of this exercise is to test your understanding of formatting output using printf.
 *
 */
public class PrintfExample {
	
	private static final Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
        
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
            
        }
        sc.close();
        System.out.println("================================");

}

}
