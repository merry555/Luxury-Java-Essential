package Example;

import java.awt.*;

import javax.swing.*;

public class Num3 extends JFrame {
	Num3() {
		setTitle("FlowLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.CENTER,30,40));
		c.add(new JLabel("100"));
		c.add(new JLabel(" + "));
		c.add(new JLabel("200"));
		c.add(new JButton(" = "));
		c.add(new JLabel("300"));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Num3();
	}
}
