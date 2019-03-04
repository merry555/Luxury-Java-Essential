package 실습;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	Container contentPane;
	String[] fruits = {"apple", "banana", "kiwi", "mango", "pear",
						"peach", "berry", "strawberry", "blackberry"};
	ImageIcon [] images = { new ImageIcon("images/icon1.png"),
							new ImageIcon("images/icon2.png"),
							new ImageIcon("images/icon3.png"),
							new ImageIcon("images/icon4.png")
	};
	ListEx() {
		super("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JList strList = new JList(fruits);
		contentPane.add(strList);
		
		JList imagesList = new JList(images);
		contentPane.add(imagesList);
		
		JList scrollList = new JList(fruits);
		contentPane.add(new JScrollPane(scrollList));
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();
	}
}
