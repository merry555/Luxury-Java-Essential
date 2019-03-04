package OpenChallenge;

import java.awt.*;

import javax.swing.*;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.GRAY);
		setLayout(new FlowLayout());
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel label = new JLabel("java");
		label.setLocation(120,50);
		label.setSize(100, 20);
		add(label);
	}
}

public class Example extends JFrame {
	public Example() {
		super("Open Challenge 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new NorthPanel(),BorderLayout.NORTH);
		add(new CenterPanel(), BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Example();
	}
}
