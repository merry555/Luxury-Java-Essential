package 실습;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//왜 교수님은 JComponent로 받으셨나요?

public class Chicken extends JFrame{
	Chicken() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane();
		MyPanel panel = new MyPanel();
		
		add(panel);
		panel.StartGame();
		
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		JLabel chicken;
		JLabel bullet;
		JLabel body;

		MyPanel() {
			setLayout(null);

			bullet = new JLabel();
			bullet.setBackground(Color.BLACK);
			bullet.setLocation(245, 400);
			bullet.setSize(10, 10);
			bullet.setOpaque(true);
			add(bullet);
			
			body = new JLabel();
			body.setBackground(Color.GRAY);
			body.setLocation(225, 410);
			body.setSize(50, 50);
			body.setOpaque(true);
			add(body);
			
			ImageIcon icon = new ImageIcon("images/chicken.jpg");
			chicken = new JLabel(icon);
			chicken.setSize(icon.getIconWidth(), icon.getIconHeight());
			chicken.setLocation(0, 0);
			add(chicken);
		}
		
		public void StartGame() {
			ChickenThread chickenThread = new ChickenThread(chicken);
			chickenThread.start();
			
			body.requestFocus();
			body.addKeyListener(new KeyAdapter() {
				BulletThread bulletthread = null; //왜 먼저 null을 쓰는지?
				public void keyPressed (KeyEvent e) {
					if(e.getKeyChar() == '\n') {
						if(bulletthread==null || !bulletthread.isAlive()) {
							BulletThread bulletthread = new BulletThread(bullet, body, chickenThread);
							bulletthread.start();
						}
					}
				}
			});
		}
		
		class ChickenThread extends Thread {
			JLabel chicken;
			ChickenThread(JLabel chicken) {
				this.chicken = chicken;
			}
			public void run() {
				while(true) {
					int x = chicken.getX()+5;
					int y = chicken.getY();
					if(x>MyPanel.this.getWidth()) {
						chicken.setLocation(0, 0);
					}// 왜 this?
					else {
						chicken.setLocation(x, y);
					}
					try {
						sleep(20);
					}
					catch(InterruptedException e) {
						chicken.setLocation(0, 0);
						try {
							sleep(500);
						} catch(InterruptedException e1) {}
					}
				}
			}
		}
		
		class BulletThread extends Thread {
			Thread chickenThread;
			JLabel bullet;
			JLabel body;
			
			BulletThread(JLabel bullet, JLabel body, Thread chickenThread) {
				this.bullet = bullet;
				this.body = body;
				this.chickenThread = chickenThread;
			}
			
			public void run() {
				while(true) {
					if(hit()) {
						chickenThread.interrupt();
						bullet.setLocation(245, 400);
						return;
					}
					else {
						int x = bullet.getX();
						int y = bullet.getY() - 5;
						if(y<0) { //왜 또 위치지정??
							bullet.setLocation(245,400);
							return;
						}
						bullet.setLocation(x,y);
					}
					try {
						sleep(20);
					}
					catch(InterruptedException e) {}
					}
				}
			}
			
			private boolean hit(){
	            int x=bullet.getX();
	            int y=bullet.getY();
	            int w=bullet.getWidth();
	            int h=bullet.getHeight();
	            
	            if(targetContains(x,y)
	                    ||targetContains(x+w-1,y)
	                    ||targetContains(x+w-1,y+h-1)
	                    ||targetContains(x,y+h-1))
	                return true;
	            else
	                return false;
	        }
	        private boolean targetContains(int x, int y){
	            if(((chicken.getX()<=x)&&(x<chicken.getX()+chicken.getWidth()))   
	                    &&((chicken.getY()<=y)&&(y<chicken.getY()+chicken.getHeight())))
	                return true;
	            
	            else
	                return false;
	        }
	    }
	
	public static void main(String[] args) {
		new Chicken();
	}
}
