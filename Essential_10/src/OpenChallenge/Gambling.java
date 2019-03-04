package OpenChallenge;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

//?

public class Gambling extends JFrame {
	JLabel [] la;
	JPanel contentPane = new JPanel();
	
	Gambling() {
		setTitle("Gambling");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.setBackground(Color.GRAY);
		
		la = new JLabel[3];
		for(int i=0; i<la.length; i++) {
			contentPane.add(la[i]);
			contentPane.setOpaque(true);
			contentPane.setBackground(Color.CYAN);
		}
		setSize(300, 150);
		setVisible(true);
		
		contentPane.requestFocus();
		contentPane.setFocusable(true);
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int a = (int)(Math.random()*4);
			int b = (int)(Math.random()*4);
			int c = (int)(Math.random()*4);
			
			if(e.getKeyChar() == '\n') {
				la[0].setText(Integer.toString(a));
				la[1].setText(Integer.toString(b));
				la[2].setText(Integer.toString(c));
			}
			if((la[0].getText() == la[1].getText()) && (la[2].getText() == la[1].getText()) 
					&& (la[2].getText() == la[0].getText()))
				contentPane.add(new JLabel("축하합니다."));
			else
				contentPane.add(new JLabel("아쉽군요."));
		}
	}
	public static void main(String[] args) {
		new Gambling();
	}
}
