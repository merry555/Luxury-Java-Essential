package 실습;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
	Container contentPane;
	SliderEx() {
		super("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMinorTickSpacing(20);
		
		contentPane.add(slider);
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SliderEx();
	}
}
