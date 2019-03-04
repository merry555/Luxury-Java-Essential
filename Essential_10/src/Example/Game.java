package Example;
//again ***
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame {
	String n[] = {"+2", "-1", "%4" };
	JLabel label = new JLabel();
	JButton btn[] = new JButton[n.length];
	
	Game() {
		super("0으로 만들기");
		Container contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(new FlowLayout());
		
		int num = (int)(Math.random()*60 + 1);
		label.setText(Integer.toString(num));
		
		JPanel p = new JPanel();
		contentPane.add(p,BorderLayout.CENTER);
		p.add(label);
		
		JPanel q = new JPanel();
		contentPane.add(q, BorderLayout.SOUTH);
		
		MyActionListener listener = new MyActionListener();
		for(int i=0; i<n.length; i++) {
			btn[i] = new JButton(n[i]);
			btn[i].addActionListener(listener);
		}
		setSize(250, 150);
		setVisible(true);
	}
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int now = Integer.parseInt(label.getText());
			switch(e.getActionCommand()) {
			case "+2":
				now += 2;
				btn[0].setEnabled(false);
				break;
			case "-1":
				now -=1;
				btn[1].setEnabled(false);
				break;
			case "%4":
				now %= 4;
				btn[2].setEnabled(false);
				break;	
			}
			label.setText(Integer.toString(now));
			
			if(now == 0) {
				Game.this.setTitle("성공");
				for(int i=0; i<n.length; i++) {
					btn[i].setEnabled(true);
				}
				int num = (int)(Math.random()*60 + 1);
				label.setText(Integer.toString(num));
			}
			else {
				for(int i=0; i<n.length; i++) {
					if(btn[i].isEnabled() == false)
						Game.this.setTitle("실패");
				}
			}
		}		
	}
	public static void main(String[] args) {
		new Game();
	}
}
