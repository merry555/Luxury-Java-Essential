package 실습;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new Button("OK"));
		contentPane.add(new Button("Cancle"));
		contentPane.add(new Button("Ignore"));
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
