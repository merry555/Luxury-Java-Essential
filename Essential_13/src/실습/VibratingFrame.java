package 실습;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VibratingFrame extends JFrame {
	Thread th;
	VibratingFrame() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		th = new Thread(new runnable());
		setLocation(100, 100);
		setSize(300, 400);
		setVisible(true);
		th.start();
		
	}
	class runnable implements Runnable {
		public void run() {
			while(true) {
				int x = ((int)(Math.random()*10));
				int y = ((int)(Math.random()*10));
				
				try {
					Thread.sleep(1);
					setLocation(x, y);
				}
				catch(InterruptedException e) { return; }
			}
		}
	}
	public static void main(String[] args) {
		new VibratingFrame();
	}
}
