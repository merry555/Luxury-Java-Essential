package Example;

import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.management.monitor.StringMonitor;
import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.*;

public class Warning extends JFrame {
	JTextField tf = new JTextField();
	JTextArea ta = new JTextArea(7,20);
	
	Warning() {
		setTitle("파일 저장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		file();
		
		setSize(300,300);
		setVisible(true);
		
	}
	void file() {
		JMenu screenMunu = new JMenu("파일");
		JMenuItem save = new JMenuItem("저장");
		screenMunu.add(save);
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ta.getText().length() == 0) {
					JOptionPane.showMessageDialog(Warning.this, "입력된 내용이 없습니다.","warning",JOptionPane.WARNING_MESSAGE);
					return;
				}
				String fileName = JOptionPane.showInputDialog(Warning.this,"저장할 파일명을 입력하세요.");
				if(fileName == null) {
					JOptionPane.showMessageDialog(Warning.this,
							"파일을 저장하지 않습니다.",
							"Warning", JOptionPane.WARNING_MESSAGE);
					return;					
				}
				try {
					FileWriter fout = new FileWriter(fileName);
					String t = ta.getText();
					StringTokenizer st = new StringTokenizer(ta.getText(),"\n");
					
					while(st.hasMoreTokens()) {
						fout.write(st.nextToken());
						fout.write("\r\n");
					}
					fout.close();
				}
				catch (IOException e1) {}
			}
		});
		JMenuBar mb = new JMenuBar();
		mb.add(screenMunu);
		setJMenuBar(mb);
	}
	public static void main(String[] args) {
		new Warning();
	}
}
