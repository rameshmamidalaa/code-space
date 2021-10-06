/**
 * 
 */
package com.sample.java8features;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ramesh_mamidala
 *
 * Without using Lambda expression: Prior to java 8 we used the anonymous inner classes to implement the only abstract method of functional interface
 */
public class WithoutLambdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Frame frame = new Frame("ActionListener Before Java8");
		Button b = new Button("Click here..");
		b.setBounds(50,100,80,50);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello ActionEvent::::");
			}
		});
		frame.add(b);
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
