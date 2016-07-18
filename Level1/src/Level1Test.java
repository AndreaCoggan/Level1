import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Test implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;

	public static void main(String[] args) {
		Level1Test test = new Level1Test();
		test.createUI();
	}

	void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		frame.pack();
		frame.setSize(400, 70);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.setBackground(Color.YELLOW);
		button1.setOpaque(true);
		button2.setBackground(Color.RED);
		button2.setOpaque(true);
		button3.setBackground(Color.BLUE);
		button3.setOpaque(true);
		button4.setBackground(Color.GREEN);
		button4.setOpaque(true);
		frame.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(button1)){
			speak("yellow");
		}
		else if(e.getSource().equals(button2)){
			speak("red");
		}
		else if(e.getSource().equals(button3)){
			speak("blue");
		}
		else if(e.getSource().equals(button4)){
			speak("green");
		}
	}
	void speak(String words){
		try{
			Runtime.getRuntime().exec("say " + words);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
