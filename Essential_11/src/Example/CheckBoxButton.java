package Example;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxButton extends JFrame {
	JCheckBox a = new JCheckBox("버튼 감추기");
	JCheckBox b = new JCheckBox("버튼 비활성화");
	JButton btn = new JButton("test Button");
	
	CheckBoxButton() {
		setTitle("버튼 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
				
		MyItemListener listener = new MyItemListener();
		a.addItemListener(listener);
		b.addItemListener(listener);
		c.add(a);
		c.add(b);
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == b)
					btn.setEnabled(false);
				else if(e.getItem() == a)
					btn.setVisible(false);
			}
		}
	}
	public static void main(String[] args) {
		new CheckBoxButton();
	}
}
