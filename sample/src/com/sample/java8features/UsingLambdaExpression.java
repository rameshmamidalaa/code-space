/**
 * 
 */
package com.sample.java8features;

import java.awt.Button;
import java.awt.Frame;

/**
 * @author ramesh_mamidala
 * 
 * By using Lambda expression: Instead of creating anonymous inner class, we can create a lambda expression like this:
 * 1. As you can see that we used less code with lambda expression.
 * 2. Backward compatibility: You can use the lambda expression with your old code.
 *    Lambdas are backward compatible so you can use them in existing API when you migrate your project to java 8.
 *
 */
public class UsingLambdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Frame frame = new Frame("ActionListener in Java8");
		Button b = new Button("Click here..");
		//Used lambda expression in the following
		b.addActionListener(e -> System.out.println("Hello ActionEvent:::"));
		b.setBounds(50,100,80,50);
		frame.add(b);
		
		frame.setSize(200, 200);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
