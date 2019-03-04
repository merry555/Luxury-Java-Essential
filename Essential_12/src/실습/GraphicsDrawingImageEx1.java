package 실습;

import java.awt.*;
import javax.swing.*;

public class GraphicsDrawingImageEx1 extends JFrame {
	GraphicsDrawingImageEx1() {
		setTitle("Image Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("images/image0.jpg");
		Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 20, 20, this);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawingImageEx1();
	}
}
