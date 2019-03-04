package Example;

//check

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FontEx extends JFrame {
	
	JPanel conP = new JPanel();
	JLabel la = new JLabel("Love Java");
	 
	FontEx() {
		setTitle("+,-로 폰트 크기조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
		setContentPane(conP);
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		conP.addKeyListener(new KeyAdapter(){	
			public void keyPressed(KeyEvent e) {
				Font f = la.getFont();
				final int S = f.getSize();
	    
				int key = e.getKeyChar();
	    
				switch(key){
				case '+':
					la.setFont(new Font("Arial", Font.PLAIN, S+5));
					break;
				case '-':
					if(S==5){
						break;
					}
	     
					else{
						la.setFont(new Font("Arial", Font.PLAIN, S-5));
						break;
					}
				}
			}
		}
	  );
	  
	  la.setLocation(50, 50);
	  la.setSize(100, 20);
	  conP.add(la);
	  setSize(400,400);
	  setVisible(true);
	  
	  conP.requestFocus();
	  conP.setFocusable(true);
	 }
	 
	 
	 
	 public static void main(String[] args) {
	  new FontEx();
	 }
	}