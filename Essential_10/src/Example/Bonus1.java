package Example;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Bonus1 extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("Love Java");
	
	Bonus1() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		la.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				Font f = la.getFont();
				final int S = f.getSize();
				int size = 5;
				
				if(n<0) {
					la.setFont(new Font("Arial", Font.PLAIN,S-size));
				}
				else if(n>0) {
					la.setFont(new Font("Arial", Font.PLAIN, S+size));
				}
				if(f.getSize()<5)
					la.setFont(new Font("Arial", Font.PLAIN, S));
			}
		});
		la.setLocation(50,50);
		la.setSize(100, 150);
		contentPane.add(la);
		contentPane.requestFocus();
		contentPane.setFocusable(true);
		setSize(150, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Bonus1();
	}
}
