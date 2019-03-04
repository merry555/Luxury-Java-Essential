package Example;

import javax.swing.*;

import Example.CheckBoxButton.MyItemListener;

import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class DigitExample extends JFrame {
	JTextField scr = new JTextField(8);
	JTextField dest = new JTextField(8);
	JRadioButton decimal = new JRadioButton("decimal");
	JRadioButton binary = new JRadioButton("binary");
	JRadioButton octal = new JRadioButton("octal");
	JRadioButton hex = new JRadioButton("hex");
	
	DigitExample() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		g.add(decimal);
		g.add(binary);
		g.add(octal);
		g.add(hex);
		
		c.add(decimal);
		c.add(binary);
		c.add(octal);
		c.add(hex);
		
		c.add(scr);
		c.add(new JLabel("->"));
		c.add(dest);
		
		MyItemListener listener = new MyItemListener();
		decimal.addItemListener(listener);
		binary.addItemListener(listener);
		octal.addItemListener(listener);
		hex.addItemListener(listener);
		
		setSize(300,300);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int n = Integer.parseInt(scr.getText());
			if(e.getItem() == decimal) {
				dest.setText(Integer.toString(n));
			}
			else if(e.getItem() == binary) {
				dest.setText(Integer.toBinaryString(n));
			}
			else if(e.getItem() == octal) {
				dest.setText(Integer.toOctalString(n));
			}
			else if(e.getItem() == hex) {
				dest.setText(Integer.toHexString(n));
			}
		}
	}
	public static void main(String[] args) {
		new DigitExample();
	}
}
