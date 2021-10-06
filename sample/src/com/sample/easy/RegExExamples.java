/**
 * 
 */
package com.sample.easy;

/**
 * @author Ramesh_Mamidala
 *
 */
public class RegExExamples {
	
	public static final String EXAMPLE_TEST = "Ramesh  ,Ishika  ,Madhuri  .";
	public static final String EXAMPLE_TAG = "<title>Regular Expressions</title>";
	public static final String EXAMPLE_INPUT = "java 100";
	
	public static void main(String[] args) {
		// Removes whitespace between a word character and . or ,
		String patternTest = "(\\w)(\\s+)([\\.,])";
		String resultTest= EXAMPLE_TEST.replaceAll(patternTest, "$1$3");
		System.out.println("EXAMPLE TEST::"+resultTest);
		
		// Extract the text between the two title elements
		String patternTag = "(?i)(<title.*?>)(.+?)(</title>)";
		String resultTag = EXAMPLE_TAG.replaceAll(patternTag, "$2");
		System.out.println("EXAMPLE_TAG::"+resultTag);
		
		String patternInput = "(\\w+)\\s+(\\d{3})$";
		String resultInput = EXAMPLE_INPUT.replaceAll(patternInput, "$1$2");
		System.out.println("EXAMPLE_INPUT::"+resultInput);
	}

}
