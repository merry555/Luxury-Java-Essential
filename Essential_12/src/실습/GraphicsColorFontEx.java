package 실습;

import javax.swing.*;
import java.awt.*;

public class GraphicsColorFontEx extends JFrame {
	GraphicsColorFontEx() {
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
			g.drawString("자바가 정말 재밌다.~", 30, 30);
			g.setColor(new Color(255,0,0));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How much?", 30, 70);
			g.setColor(new Color(0x00ff00ff));
			
			for(int i=0; i<=4; i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("This much!!", 30, 30+i*40);
			}
		}
	}
	public static void main(String[] args) {
		new GraphicsColorFontEx();
	}
}
