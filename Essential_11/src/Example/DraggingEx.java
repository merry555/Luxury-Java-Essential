package Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DraggingEx extends JFrame {
	JLabel label = new JLabel();
	
	DraggingEx() {
		setTitle("Image Dragging");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		ImageIcon icon = new ImageIcon("images/img1.jpg");
		label = new JLabel(icon);
		MyMouseListener listener = new MyMouseListener();
		label.addMouseListener(listener);
		label.addMouseMotionListener(listener);
		label.setSize(icon.getIconWidth(), icon.getIconWidth());
		label.setLocation(100,100);
		c.add(label);
		
		setSize(300, 300);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter {
		int x, y;
		public void mousePressed(MouseEvent e) {
			x = e.getX(); 
			y = e.getY();
		}
		public void mouseDragged(MouseEvent e) {
			int distanceX = e.getX() - x;
			int distanceY = e.getY() - y;
			label.setLocation(label.getX()+ distanceX, label.getY() + distanceY);
		}
	}
	public static void main(String[] args) {
		new DraggingEx();
	}
}
