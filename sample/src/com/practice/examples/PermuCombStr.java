/**
 * 
 */
package com.practice.examples;

/**
 * @author Ramesh_Mamidala
 *
 */
public class PermuCombStr {
	
	
	// print n! permutation of the characters of the string s (in order)
	public static void permmutations(String s) {
		permmutations("", s);		
	}
	
	private static void permmutations(String prefix, String s) {
		int n = s.length();
		if (n == 0) System.out.println(prefix); 
		else {
			for(int i = 0; i < n; i++)
				permmutations(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
		}
		
	}
	
	// print n! permutation of the elements of array a (not in order)
    public static void perm2(String s) {
        int n = s.length();
        char[] a = new char[n];
        for (int i = 0; i < n; i++)
            a[i] = s.charAt(i);
        perm2(a, n);
    }

    private static void perm2(char[] a, int n) {
        if (n == 1) {
            System.out.println(new String(a));
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            perm2(a, n-1);
            swap(a, i, n-1);
        }
    }  

    // swap the characters at indices i and j
    private static void swap(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }
	
	public static void permTwoStr(String s1, String s2) {
		char[] s1array = s1.toCharArray();
		char[] s2array = s2.toCharArray();
		for(char s1char : s1array) {
		    for(char s2char : s2array) {
		        String value = String.valueOf(s1char) + String.valueOf(s2char);
		        System.out.println("Two Strings:::::::::::::"+value);
		    }
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String alphabet = "abc";
        int n = alphabet.length();
        String elements = alphabet.substring(0, n);
        permmutations(elements);
        perm2(elements);
        permTwoStr("aaa", "ce");
        
	}
	
	

}
