package Example;

import java.awt.*;

import javax.swing.*;

public class Num2 extends JFrame{
	Num2() {
		setTitle("BorderLayout Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout();
		
		c.setLayout(new BorderLayout(7,5));
		c.add(new Button("North"), BorderLayout.NORTH);
		c.add(new Button("West"), BorderLayout.WEST);
		c.add(new Button("Center"), BorderLayout.CENTER);
		c.add(new Button("South"), BorderLayout.SOUTH);
		c.add(new Button("East"), BorderLayout.EAST);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Num2();
	}
}
