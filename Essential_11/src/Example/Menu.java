package Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {
	Menu() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		creatMenu();
		setSize(250, 200);
		setVisible(true);
	}
	
	void creatMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("보기");
		
		screenMenu.add(new JMenuItem("화면확대"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("쪽윤곽"));
		
		mb.add(new JMenu("파일"));
		mb.add(new JMenu("편집"));
		mb.add(screenMenu);
		mb.add(new JMenu("입력"));
		
		setJMenuBar(mb);
	}
	public static void main(String[] args) {
		new Menu();
	}
}
