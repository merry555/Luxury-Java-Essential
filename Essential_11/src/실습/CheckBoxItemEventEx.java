package 실습;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxItemEventEx extends JFrame {
	Container contentPane;
	JCheckBox[] fruit = new JCheckBox[3];
	String names[] = {"사과", "배", "체리" };
	JLabel sumLabel;
	int sum = 0;
	
	CheckBoxItemEventEx() {
		setTitle("체크박스와 ItemEvent예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		for(int i=0; i<fruit.length; i++) {
			fruit[i] = new JCheckBox(names[i]);
			fruit[i].setBorderPainted(true);
			contentPane.add(fruit[i]);
			fruit[i].addItemListener(new MyItemListener());
		}
		
		sumLabel = new JLabel("현재 0원 입니다.");
		contentPane.add(sumLabel);
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int selected=1;
			
			if(e.getStateChange() == ItemEvent.SELECTED)
				selected = 1;
			else
				selected = -1;
			
			if(e.getItem() == fruit[0])
				sum += selected*100;
			else if(e.getItem() == fruit[1])
				sum += selected*500;
			else
				sum += selected*20000;
			
			sumLabel.setText("현재 " + sum + "원 입니다.");
		}
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
