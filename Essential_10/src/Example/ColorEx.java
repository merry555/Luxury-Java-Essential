package Example;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorEx extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel();
	
	ColorEx() {
		setTitle("Key");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		setSize(100, 100);
		setVisible(true);
		la.setOpaque(true);
		la.setBackground(Color.CYAN);
		
		contentPane.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_R)
				contentPane.setBackground(Color.RED);
		}
		public void keyReleased(KeyEvent e) {
			contentPane.setBackground(Color.CYAN);
		}
	}
	public static void main(String[] args) {
		new ColorEx();
	}
}
