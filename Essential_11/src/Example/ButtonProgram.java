package Example;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonProgram extends JFrame {
	JRadioButton red = new JRadioButton("Red",true);
	JRadioButton blue = new JRadioButton("Blue");
	
	ButtonProgram() {
		setTitle("버튼 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		
		g.add(red);
		g.add(blue);
		
		c.add(red);
		c.add(blue);
		
		MyItemListener listener = new MyItemListener();
		red.addItemListener(listener);
		blue.addItemListener(listener);
		
		setSize(250,150);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() != ItemEvent.SELECTED) {
				return;
			}
			if(e.getItem() == red) {
				getContentPane().setBackground(Color.RED);
			}
			else if (e.getItem() == blue)
				getContentPane().setBackground(Color.BLUE);
		}
	}
	public static void main(String[] args) {
		new ButtonProgram();
	}
}
