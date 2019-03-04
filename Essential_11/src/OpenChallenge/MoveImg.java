package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveImg extends JFrame {
	Container contentPane;
	JLabel imgLabel;
	ImageIcon [] images = new ImageIcon[4];
	int currentId;
	
	MoveImg() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		for(int i=0; i<images.length; i++) {
			images[i] = new ImageIcon("images/image" + i + ".jpg");
		}
		currentId = 0;
		imgLabel = new JLabel(images[currentId]);
		contentPane.add(imgLabel, BorderLayout.CENTER);
		contentPane.add(new MenuPanel(), BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MenuPanel extends JPanel {
		public MenuPanel() {
			setBackground(Color.GRAY);
			ImageIcon lefticon = new ImageIcon("images/left.jpg");
			ImageIcon rightIcon = new ImageIcon("images/right.jpg");
			JButton btn1 = new JButton(lefticon);
			JButton btn2 = new JButton(rightIcon);
			
			add(btn1);
			add(btn2);
			
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					currentId--;
					currentId += images.length;
					currentId %= images.length;
					imgLabel.setIcon(images[currentId]);
				}
			});
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					currentId ++; // 이미지 번호 증가. 다음 이미지
					currentId %= images.length; // 4 가 넘는 것을 막기 위해 이미지 개수로 나머지 구함 
					imgLabel.setIcon(images[currentId]); // 이미지 레이블에 이미지 변경
				}
			});
		}
	}
	public static void main(String[] args) {
		new MoveImg();
	}
}
