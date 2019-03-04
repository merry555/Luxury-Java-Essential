package 실습;

import java.awt.*;
import javax.swing.*;

public class paintJPanelEx extends JFrame {
	paintJPanelEx() {
		setTitle("JPanel의 paintComponent()예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(200, 250);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			
			g.setColor(Color.MAGENTA);
			g.drawRect(90, 90, 50, 50);
		}
	}
	public static void main(String[] args) {
		new paintJPanelEx();
	}
}
