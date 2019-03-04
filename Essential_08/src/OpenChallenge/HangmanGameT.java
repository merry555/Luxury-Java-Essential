package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class HangmanGameT extends JFrame {
   Container c;
    StringBuffer hiddenWord; // 숨긴 글자를 가진 단어
   String newWord; // 게임을 위해 선정된 단어
   int failCount; // 틀린 횟수
    
    public HangmanGameT() {
       setTitle("Hangman Game");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       c = getContentPane();
       
       JPanel content = new JPanel();
       content.add(new StartingButton()); // 툴바
       content.setLocation(0, 0);
       content.setSize(700, 50);
       c.add(content);
       
       JPanel content2 = new JPanel();
       content2.add(new TimerPanel()); // 타이머
       content2.setLocation(40, 60);
       content2.setSize(200, 65);
       content2.setBackground(Color.ORANGE);
       c.add(content2);

       JPanel content3 = new JPanel();
       content3.add(new ListPanel()); // 이미
       content3.setSize(310, 300);
       content3.setLocation(10, 127);
       c.add(content3);
       
       JPanel content4 = new JPanel();
       content4.add(new WrongWord()); // 알파벳
       content4.setSize(300, 160);
       content4.setLocation(350, 250);
       content4.setBackground(Color.BLUE);
       c.add(content4);
      
       JPanel content5 = new JPanel();
       content5.add(new CountPanel()); // 남은 목숨
       content5.setSize(200, 50);
       content5.setLocation(330, 80);
       content5.setBackground(Color.RED);
       c.add(content5);
       
       JPanel content6 = new JPanel(); // 게임 시작, 종료
       content6.add(new createMenu());
       content6.setSize(250, 50);
       content6.setLocation(230, 430);
       c.add(content6);

       JPanel content7 = new JPanel(); //  맞출 글자
       content7.add(new Text());
       content7.setSize(250,50);
       content7.setLocation(401, 131);
       content7.setBackground(Color.MAGENTA);
       c.add(content7);
       
       setSize(700, 500);
       setResizable(false);
       setVisible(true);
    }
       
    class StartingButton extends JPanel {
        public StartingButton() {
           JButton startButton = new JButton("Game Start");
           startButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            
         }
      });
           add(startButton);
        }
     }
    
    class createMenu extends JPanel {
       public createMenu() {
         JButton newGameb = new JButton("new Game");
         newGameb.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            //game start
         }
      });
         JButton endGameb = new JButton("End Game");
         endGameb.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      }); 
          add(newGameb);
          add(endGameb);
       }
    }
    class ListPanel extends JPanel {
        ImageIcon icon = new ImageIcon("images/Hangman1.jpg");
        Image img = icon.getImage();
        
        public void paintComponent(Graphics g) {
           super.paintComponent(g);
           g.drawImage(img, 10, 60, 230, 370, this);
        }
        
     }
       
    class TimerThread extends Thread {
       JLabel timerThread;
       
       public TimerThread(JLabel timerLabel) {
          this.timerThread=timerLabel;
       }
       
       public void run() {
          int n=0;
          while(true) {
             timerThread.setText(Integer.toString(n));
             n++;
             try {
                Thread.sleep(1000);
                if(n==60) {
                   JOptionPane.showMessageDialog(null,"시간초과, 다시 시작하려면 new Game을 누르시오.");
                   return;
                }
             }
             catch(InterruptedException e){
                return;
             }
          }
       }
    }
    
    public class TimerPanel extends JPanel {
       TimerThread th;
        public TimerPanel() {
           setLayout(new GridLayout(2, 1));
           JLabel timerThread = new JLabel();
           JLabel timer = new JLabel("제한시간 60초");
           timer.setLocation(60, 100);
           timerThread.setFont(new Font("Gothic",Font.ITALIC,20));
           timerThread.setSize(50, 50);
           
           th = new TimerThread(timerThread);
           
           add(timer);
           add(timerThread);
           th.start();
        }
     }
    
    class CountPanel extends JPanel {
       JLabel die;
       int count = 6;
       CountPanel() {
         die = new JLabel(String.valueOf(count));
          add(new JLabel("남은 목숨의 개수"));
          add(die);
       }
       void setCount(int count) {
          this.count = count;
          die.setText(String.valueOf(count));
       }
       int decrease() {
          count--;
          die.setText(String.valueOf(--count));
          return count;
       }
    }
    
    class Text extends JPanel {
      // HangmanGame randomWord;
       public Text() {
          setLayout(new GridLayout(1, 1));
          JLabel correct = new JLabel("맞출 글자");
//          randomWord = new MHangmanGame();
//          randomWord.makeHiddenWord();
          add(correct);
       }
    }
    
    class WrongWord extends JPanel {
         public WrongWord() {
            setLayout(new GridLayout(5,5));
            String buttonText[]={"a","b","c","d","e","f","g","h","i","j","k","l","m",
                            "n","o","p","q","r","s","t","u","v","w","x","y","z"};
            JButton []btn = new JButton[buttonText.length];
            for (int i=0; i<buttonText.length; i++) {
               btn[i] = new JButton(buttonText[i]);
                btn[i].addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  JButton btn = (JButton)e.getSource();
                  btn.setEnabled(false);
               }
            });
                add(btn[i]);
            }
         }
      }
    
    
    public static void main(String[] args) {
       new HangmanGameT();
    }
}