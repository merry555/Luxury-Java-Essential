package 실습;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyMouseAdapter extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la;
	
	MyMouseAdapter() {
		setTitle("Mouse Event Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addMouseListener(new MyMouseAdapterEx());
		
		la = new JLabel("hello");
		la.setSize(50,20);
		la.setLocation(30, 30);
		contentPane.add(la);
		setSize(200, 200);
		setVisible(true);
	}
	
	class MyMouseAdapterEx extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
	
	public static void main(String[] args) {
		new MyMouseAdapter();
	}
}
