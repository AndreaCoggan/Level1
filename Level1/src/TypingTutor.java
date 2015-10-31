import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	char currentLetter = generateRandomLetter();
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	public static void main(String[] args) {
		TypingTutor typingTutor = new TypingTutor();
		typingTutor.createUI();
	}

	void createUI() {
		frame.setTitle("Typing Tutor");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);	
		frame.pack();
		frame.setSize(800, 800);
		frame.setVisible(true);
		frame.add(label);
		label.setText(currentLetter + "");
		frame.addKeyListener(this);
		
	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		if(e.getKeyChar() == currentLetter){
			System.out.println("correct");
			frame.getContentPane().setBackground(Color.GREEN);
		}
		else{
			System.out.println("incorrect");
			frame.getContentPane().setBackground(Color.RED);
		}
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		
	}

}
