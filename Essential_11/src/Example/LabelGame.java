package Example;

//8번

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelGame extends JFrame {
	Container contentPane;
	JLabel label [] = new JLabel[3];
	
	LabelGame() {
		setTitle("Label Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(null);
		MyMouseListener my = new MyMouseListener();
		for(int i=0; i<label.length; i++) {
			int x = (int)(Math.random()*200);
			int y = (int)(Math.random()*200);
			label[i] = new JLabel(Integer.toString(i));
			label[i].addMouseListener(my);
			label[i].setLocation(x, y);
			label[i].setSize(20, 20);
			contentPane.add(label[i]);
		}
		setSize(150,150);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter {
		int num = 0;
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			JLabel la = (JLabel)e.getSource();
			if(num == Integer.parseInt(la.getText())) {
				la.setVisible(false);
				num++;
				if(num == 3) {
					for(int i=0; i<label.length; i++) {
						int x = (int)(Math.random()*200);
						int y = (int)(Math.random()*200);
						label[i].setVisible(true);
						label[i].setLocation(x, y);
					}
					num = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		new LabelGame();
	}
}