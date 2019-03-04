package Example;

import javax.swing.*;
import java.awt.*;

public class Graphic1 extends JFrame {
	Container contentPane;
	Graphic1() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setContentPane(new MyPanel());
		
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon1 = new ImageIcon("images/a.jpg");
		Image img1 = icon1.getImage();
		
		ImageIcon icon2 = new ImageIcon("images/b.jpg");
		Image img2 = icon2.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img1, 0, 0, getWidth()/2, getHeight(), this);
			g.drawImage(img2, getWidth()/2, 0, getWidth()/2, getHeight(), this);	
		}
	}
	public static void main(String[] args) {
		new Graphic1();
	}
}
