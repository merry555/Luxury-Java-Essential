package Example;

import java.awt.*;
import javax.swing.*;

public class Five extends JFrame {
	Five() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawOval(20, 20, 80, 80);
			g.setColor(Color.BLACK);
			g.drawOval(60, 60, 80, 80);
			g.setColor(Color.RED);
			g.drawOval(100, 100, 80, 80);
			g.setColor(Color.YELLOW);
		}
	}
	public static void main(String[] args) {
		new Five();
	}
}
