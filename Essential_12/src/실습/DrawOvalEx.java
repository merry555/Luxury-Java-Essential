package 실습;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class DrawOvalEx extends JFrame {
	DrawOvalEx() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		Point start = null, end=null;
		public MyPanel() {
			MyMouseListener listener = new MyMouseListener();
			
			addMouseListener(listener);
			addMouseMotionListener(listener);
		}
		class MyMouseListener extends MouseAdapter {
			public void mousePressed(MouseEvent e) {
				start = e.getPoint();
			}
			public void mouseDragged(MouseEvent e) {
				end = e.getPoint();
				repaint();
			}
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(start == null)
				return;
			
			g.setColor(Color.BLUE);
			int x = Math.min(start.x, end.x);
			int y = Math.min(start.y, end.x);
			int width = Math.abs(start.x - end.x);
			int height = Math.abs(start.y - end.x);
			g.drawOval(x, y, width, height);
		}
	}
	public static void main(String[] args) {
		new DrawOvalEx();
	}
}
