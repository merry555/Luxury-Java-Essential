package 실습;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) { return; }
		}
	}
}

public class Example extends JFrame {
	public Example() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		
		Thread th = new Thread(runnable);
		
		timerLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(th.isAlive()) {
					th.interrupt();
					Thread th = new Thread(runnable);
				}
				else
					th.start();
			}
		});
		
		c.add(timerLabel);
		setSize(300, 150);
		setVisible(true);
		th.start();
	}
	public static void main(String[] args) {
		new Example();
	}
}
