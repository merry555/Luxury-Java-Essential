package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HangmanGame1 extends JFrame {
	Container c;
	
	public HangmanGame1() {
		setTitle("Start HangmanGame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c = getContentPane();
        
        JPanel radioPanel = new JPanel();
        radioPanel.add(new Choose());
        c.add(radioPanel);
        
        setSize(500, 400);
        setResizable(false);
        setVisible(true);
	}
	
	class Choose extends JPanel {		
		public Choose() {
			JButton startbtn = new JButton("Start");
			JButton closebtn = new JButton("Exit");
			startbtn.addActionListener(new MyActionListener());
			closebtn.addActionListener(new MyActionListener());
			add(startbtn);
			add(closebtn);
		}
		class MyActionListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				
			}
		}
	}
	public static void main(String[] args) {
		new HangmanGame1();
	}
}
