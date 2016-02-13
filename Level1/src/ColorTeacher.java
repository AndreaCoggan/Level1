import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorTeacher {
		
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		label.setText("Color Teacher");
		label.add(panel);
		frame.setVisible(true);
		panel.add(frame);
		frame.pack();
		frame.setSize(100, 200);
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		button1.add(panel);
		button2.add(panel);
		button3.add(panel);
		button4.add(panel);
		button1.setBackground(Color.YELLOW);
		button1.setOpaque(true);
		button2.setBackground(Color.RED);
		button2.setOpaque(true);
		button3.setBackground(Color.BLUE);
		button3.setOpaque(true);
		button4.setBackground(Color.GREEN);
		button4.setOpaque(true);
	
	}
	void speak(String words){
		try{
			Runtime.getRuntime().exec("say " + words);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void teachColors(){
		JButton button5 = new JButton();
		button5.addActionListener((ActionListener) this);
		if(button5 == button1){
			speak("yellow");
		}
		else if(button5 == button2){
			speak("red");
		}
		else if(button5 == button3){
			speak("blue");
		}
		else if(button5 == button4)
			speak("green");
			
	}
	

}
