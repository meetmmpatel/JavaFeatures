package com.javafeature.lambda;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Baselambda {

	// Name
	// Paramenter list
	// body
	// return type

	/**
	 * no name , no return type only body and parameter list
	 *
	 */

	public static void main(String[] args) {

		Frame frame = new Frame("Java 8 Feature");

		Button b = new Button("click here");
		b.setBounds(50, 100, 80, 50);
		// b.addActionListener(new ActionListener() {
		//
		// public void actionPerformed(ActionEvent e) {
		//
		// System.out.println("Hello world");
		// }
		// });

		b.addActionListener(e -> System.out.println("hello World"));

		frame.add(b);
		frame.setSize(200, 200);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
