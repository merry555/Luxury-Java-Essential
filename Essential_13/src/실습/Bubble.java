package 실습;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.*;

public class Bubble extends JFrame{
   JPanel panel;
   ImageIcon image = new ImageIcon("images/dean.png");
   Vector<Thread> v = new Vector<Thread>();
   
   Bubble() {
      setTitle("버블이 둥둥");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      panel = new JPanel();
      panel.addMouseListener(new MyMouseListener());
      this.add(panel);
      JButton b = new JButton("thread");
      b.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            for(int i=0; i<v.size(); i++) {
               Thread th = v.get(i);
               System.out.println(th.getId() + ": " + th.getState());
            }
         }
         
      });
      
      panel.add(b);
      this.setSize(500,500);
      this.setVisible(true);
   } 
    
   class MyMouseListener implements MouseListener {
      @Override
      public void mouseClicked(MouseEvent e) {
         int x = e.getX();
         int y = e.getY();
         BubbleMaker th = new BubbleMaker(x,y);
         v.add(th);
         th.start();
         // TODO Auto-generated method stub
         
      }@Override
      public void mouseEntered(MouseEvent e) {
         // TODO Auto-generated method stub
         
      }@Override
      public void mouseExited(MouseEvent e) {
         // TODO Auto-generated method stub
         
      }@Override
      public void mousePressed(MouseEvent e) {
         // TODO Auto-generated method stub
         
      }@Override
      public void mouseReleased(MouseEvent e) {
         // TODO Auto-generated method stub
         
      }
      class BubbleMaker extends Thread {
         int x,y;
         BubbleMaker(int x, int y) {
            this.x = x;
            this.y = y;
         }
         public void run() {
            JLabel label = new JLabel(image);
            label.setSize(30,30);
                label.setLocation(x, y);
                label.setOpaque(true);
                panel.add(label);
                
                while(true) {  //왜 스레드가 아이디가 18일까???/
                 try {
                    label.setLocation(label.getX(), label.getY()-5);
                        Thread.sleep(200);
                        if(label.getY() <=30) {
                           Container c = label.getParent();
                           c.remove(label);
                           c.revalidate();
                           c.repaint();
                           return;
                           }
                    }catch(InterruptedException e){return;}
              }
         }
      }
   }
   public static void main(String[] args) {
      new Bubble();
   }
}