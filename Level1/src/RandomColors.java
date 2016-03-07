import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.teachingextensions.logo.Colors;

public class RandomColors implements KeyListener {
	JFrame frame;
	JPanel panel;
	

	public static void main(String[] args) {
		RandomColors colors = new RandomColors();
		colors.createUI();
	}

	void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.addKeyListener(this);

	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		panel.setBackground(Colors.getRandomColor());
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	void playSound(String bark){
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(bark));
		sound.play();
	}
}
