package Example;

//X

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveC extends JFrame {
	public MoveC() {
		setTitle("MoveC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("C");
		la.setLocation(50, 50);
		la.setSize(20, 20);
		la.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JLabel l = (JLabel)e.getSource();
				Container c = la.getParent();
				int xBound = c.getWidth() - l.getWidth();
				int yBound = c.getHeight() - l.getHeight();
				
				int x = (int)(Math.random()*xBound);
				int y = (int)(Math.random()*yBound);
				
				l.setLocation(x, y);
			}
		});
		c.add(la);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MoveC();
	}
}
