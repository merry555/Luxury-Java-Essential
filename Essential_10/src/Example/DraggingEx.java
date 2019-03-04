package Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DraggingEx extends JFrame {
	JPanel contentPane = new JPanel();
	
	DraggingEx() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addMouseMotionListener(new MyMotionListener());
		contentPane.addMouseListener(new MyMotionListener());
		contentPane.setOpaque(true);
		contentPane.setBackground(Color.GREEN);
		setSize(300, 200);
		setVisible(true);
		
		contentPane.requestFocus();
	}
	
	class MyMotionListener extends MouseAdapter implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			contentPane.setBackground(Color.YELLOW);
		}
		public void mouseMoved(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			contentPane.setBackground(Color.GREEN);
		}
	}
	public static void main(String[] args) {
		new DraggingEx();
	}
}
