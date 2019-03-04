package Example;
//???
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class Num6 extends JFrame {
	Num6() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0; i<20; i++) {
			JLabel label = new JLabel();
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			label.setLocation(x,y);
			label.setSize(10,10);
			label.setBackground(Color.BLUE);
			label.setOpaque(true);
			add(label);
		}		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Num6();
	}
}
