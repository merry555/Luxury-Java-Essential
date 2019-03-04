package 실습;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
