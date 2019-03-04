package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HangmanGameGUI extends JFrame {
    DetailsPanel myPanel;
    Container c;
    
    public HangmanGameGUI() {
        myPanel = new DetailsPanel();
        c = getContentPane();
        
        JPanel content = new JPanel(new BorderLayout());
        content.add(new ImagePane());
        content.add(new GuessPane(), BorderLayout.SOUTH);
     
        c.add(content, BorderLayout.CENTER);
        c.add(myPanel, BorderLayout.SOUTH);
        setTitle("Hangman Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,1000);
        setVisible(true);
    }

    public class ImagePane extends JPanel {        
           ImageIcon icon = new ImageIcon("images/nature.png");
           Image img = icon.getImage();
           
           public void paintComponent(Graphics g) {
              super.paintComponent(g);
              g.drawImage(img, 0, 0, getWidth(),getHeight(),this);
           } 
    }

    class GuessPane extends JPanel {
        public GuessPane()  {
            JTextField input = null;
            JTextField clickedAlphabet = null;
            JLabel label = new JLabel("맞춰보세요~");
            input = new JTextField("________"); 
            add(label);
            add(input);
        }
    }
    
    class DetailsPanel extends JPanel {
    	public DetailsPanel() {
    		setLayout(new BorderLayout());
    		JPanel letterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,30,10));
    		
            for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            	String buttonText = String.valueOf(alphabet);
                JLabel letterLabel = new JLabel(buttonText);
                letterPanel.add(letterLabel);
                }
            add(letterPanel);
        }
    }
    
    public static void main(String[] args) {
    	new HangmanGameGUI();
    }
}