package Example;

import java.awt.Container;

import javax.swing.*;

public class Num1 extends JFrame {
	Num1() {
		setTitle("Let's study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Num1();
	}
}
