package Example;

import java.awt.*;

import javax.swing.*;

public class Num4 extends JFrame {
	public Num4() {
		setTitle("Num4 Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(1, 10,2,2);
		c.setLayout(grid);
		
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
					Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
					Color.PINK, Color.LIGHT_GRAY};
		
		for(int i=0; i<10; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setOpaque(true);
			button.setBackground(color[i]);
			button.setLocation(i*50, 100);
			button.setSize(50, 100);
			button.setLayout(grid);
			c.add(button);
		}
		
		setSize(100,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Num4();
	}
}
