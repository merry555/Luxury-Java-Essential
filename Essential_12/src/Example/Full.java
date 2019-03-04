package Example;

import java.awt.*;
import javax.swing.*;

public class Full extends JFrame {
	Full() {
		Container c = getContentPane();
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		int x[] = new int[4];
		int y[] = new int[4];
		public void paintComponent(Graphics g) {
			
		}
	}
}
