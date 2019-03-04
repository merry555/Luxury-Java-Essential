package Example;

//?

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDragging extends JFrame {
	Container contentPane;
	Graphics g;
	
	MouseDragging() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		contentPane = getContentPane();
		
		setSize(300, 400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("images/b.jpg");
		Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(20, 20, 70, 70);
			
		}
		
		public MyPanel() {
			MyMouseListener listener = new MyMouseListener();
	
			addMouseListener(listener);
		}
		class MyMouseListener extends MouseAdapter {
			public void mouseDragged(MouseEvent e) {
				int distanceX = e.getX();
				int distanceY = e.getY();
				g.drawOval(distanceX, distanceY, 20, 20);
				repaint();
			}
		}
	}
	public static void main(String[] args) {
		new MouseDragging();
	}
}
