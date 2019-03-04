package 실습;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboActionEx extends JFrame {
	Container contentPane;
	String [] fruits = {"apple", "banana", "kiwi", "mango"};
	ImageIcon[] images = { new ImageIcon("images/apple.jpg"),
						new ImageIcon("images/pear.jpg"),
						new ImageIcon("images/banana.jpg"),
						new ImageIcon("images/kiwi.jpg")};
	JLabel imgLabel = new JLabel(images[0]);
	
	ComboActionEx() {
		super("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(fruits);
		
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				
				int index = cb.getSelectedIndex();
				
				imgLabel.setIcon(images[index]);
			}
		});
		
		contentPane.add(strCombo);
		contentPane.add(imgLabel);
		
		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboActionEx();
	}
}
