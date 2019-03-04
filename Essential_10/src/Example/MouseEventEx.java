package Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventEx extends JFrame {
	public MouseEventEx() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		Label la = new Label("Daring");

		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyMouseListener listener = new MyMouseListener();
		la.addMouseListener(listener);
		la.addMouseListener(new MyMouseListener());
		la.setLocation(50,50);
		la.setSize(100, 20);		
		setSize(100, 100);
		setVisible(true);
		
		c.add(la);
		
	}
	
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Label la = (Label)e.getSource();
			la.setText("Love");
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			Label la = (Label)e.getSource();
			la.setText("Daring");
		}
	}
	public static void main(String[] args) {
		new MouseEventEx();
	}
}
