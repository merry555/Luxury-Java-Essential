package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class newHangmanGame extends JFrame {
	   Container c;
	   
	   public newHangmanGame() {
	      setTitle("HangMan Game");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      c = getContentPane();
	      
	      JPanel content = new JPanel();
	      content.add(new ToolBar()); // 툴
	      content.add(new createMenu()); //게임 시작, 종
	      content.add(new CountPanel()); // 남은 목숨
	      
	      JPanel content2 = new JPanel();
	      content2.add(new TimerPanel()); // 타이머
	      content2.add(new ListPanel()); // 이미
	      
	      JPanel content3 = new JPanel();
	      content3.add(new WrongWord()); // 틀린 단어

	      c.add(content,BorderLayout.NORTH);
	      c.add(content2,BorderLayout.CENTER);

	      setSize(500, 500);
	      setVisible(true);
	   }
	      
	   class ToolBar extends JPanel {
	      public ToolBar() {
	         JToolBar toolBar = new JToolBar("Game menu");
	         toolBar.setBackground(Color.cyan);
	         
	         toolBar.add(new JButton("Game Start"));
	         toolBar.addSeparator();
	         toolBar.add(new JTextField("알아맞춰 보세요~~~~~~~~"));
	         toolBar.add(new JButton("입력"));
	         
	         JComboBox combo = new JComboBox();
	         combo.addItem("상");
	         combo.addItem("중");
	         combo.addItem("하");
	         toolBar.add(combo);
	         toolBar.setFloatable(false);
	         
	         add(toolBar);
	      }
	   }
	   class createMenu extends JPanel implements ActionListener {
	      public createMenu() {
	         JMenuBar filemenu = new JMenuBar();
	         String start = "new Game";
	         String close = "close Game";
	         
	         filemenu.add(new JMenuItem(start));
	         filemenu.add(new JMenuItem(close));
	         setJMenuBar(filemenu);
	         
	         add(filemenu);
	      }

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	   }
	   class ListPanel extends JPanel {
	      JLabel imglabel;
	      JSplitPane splitPane;
	      
	      public ListPanel() {
	         splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	         imglabel = new JLabel(new ImageIcon("images/eeeee.gif"));
	         
	         add(imglabel);
	      }
	   }
	      
	   class TimerThread extends Thread {
	      JLabel timerThread;
	      
	      public TimerThread(JLabel timerLabel) {
	         this.timerThread = timerLabel;
	      }
	      
	      public void run() {
	         int n=0;
	         while(true) {
	            timerThread.setText(Integer.toString(n));
	            n++;
	            try {
	               Thread.sleep(1000);
	            }
	            catch(InterruptedException e){
	               return;
	            }
	         }
	      }
	   }
	   
	   public class TimerPanel extends JPanel {
	      public TimerPanel() {
	         JLabel timerThread = new JLabel();
	         timerThread.setFont(new Font("Gothic",Font.ITALIC,40));
	         timerThread.setBackground(Color.ORANGE);
	         timerThread.setSize(50, 50);
	         
	         TimerThread th = new TimerThread(timerThread);
	         add(timerThread);
	         th.start();
	      }
	   }
	   
	   class CountPanel extends JPanel {
			JLabel die;
			int count;
			CountPanel() {
				die = new JLabel();
				add(new JLabel("남은 목숨의 개수 : "));
				add(die);
			}
			void setCount(int count) {
				this.count = count;
				die.setText(String.valueOf(count));
			}
			int decrease() {
				count--;
				die.setText(String.valueOf(count));
				return count;
			}
		}
	   
	   class WrongWord extends JPanel {
		   public WrongWord() {
			   setLayout(new GridLayout(5,5));
			   JButton btn = new JButton();
			   
	            for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
	            	String buttonText = String.valueOf(alphabet);
	                JLabel letterLabel = new JLabel(buttonText);
	                btn.add(letterLabel);
	                }
	            add(btn);
		   }
	   }
	   

	   public static void main(String[] args) {
	      new newHangmanGame();
	   }
	}
