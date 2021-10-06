/**
 * 
 */
package com.sample.java8features;

/**
 * @author ramesh_mamidala
 * 
 * Java Lambda Expression with Multiple Parameters
 *
 */
public class LambdaExpressionMultipleParam {
	
	public String display(String s1, String s2) {
		return s1+s2;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LambdaExpressionMultipleParam lp = new LambdaExpressionMultipleParam();
		StringConcat strConcat = lp::display;
		System.out.println("Result::: "+strConcat.sConcat("Hello ", "LambdaFeature"));
		// lambda expression with multiple arguments
		//StringConcat strConcat = (firstStr, secondStr) -> firstStr + secondStr;
		//System.out.println("Result::: "+strConcat.sConcat("Hello ", "LambdaFeature"));

	}

}
