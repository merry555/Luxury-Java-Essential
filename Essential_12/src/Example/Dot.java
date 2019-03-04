package Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class Dot extends JFrame {
	ImageIcon icon = new ImageIcon("images/a.jpg");
	Image image = icon.getImage();
	int x = 50;
	int y = 50;
	
	Dot() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(x, y, 40, 40);
		}
	}
	public static void main(String[] args) {
		new Dot();
	}
}
