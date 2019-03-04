package 실습;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class borderLayoutEx extends JFrame{
	public borderLayoutEx() {
		setTitle("borderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
	}
}
