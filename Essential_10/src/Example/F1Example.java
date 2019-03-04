package Example;
//???
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class F1Example extends JFrame {
	F1Example() {
		super("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		JButton button = new JButton("A");
		button.setLocation(50,50);
		button.setSize(70,100);
		
		
		contentPane.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				Container c = (Container)e.getSource();
				int keyCode = e.getKeyCode();
				
				int width = getWidth();
				int height = getHeight();
				
				if(keyCode == KeyEvent.VK_A) {
					setSize(width+10, height+10);
				}
				else if(keyCode == KeyEvent.VK_S) {
					setSize(width-10, height-10);
				}
				else if(keyCode == KeyEvent.VK_Q) {
					System.exit(0);
				}
				
			}
		});
		setSize(200,200);
		setVisible(true);
		contentPane.requestFocus();
	}
	public static void main(String[] args) {
		new F1Example();
	}
}
