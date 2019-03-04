package Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayout extends JFrame {
	ImageIcon [] images = { new ImageIcon("images/img1.jpg"), new ImageIcon("images/img2.jpg"),
							new ImageIcon("images/img3.jpg"), new ImageIcon("images/img4.jpg")};
	GridLayout() {
		super("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		for(int i=0; i<images.length; i++) {
			c.add(new JLabel(images[i]));
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayout();
	}
}
