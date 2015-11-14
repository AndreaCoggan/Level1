import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whackamole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int numofButtons = 24;

	public static void main(String[] args) {
		new Whackamole().createUI();

	}

	void createUI() {

		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.add(panel);
		drawButtons(new Random().nextInt(numofButtons - 1));

	}

	public void drawButtons(int moleLocation) {
		for (int i = 0; i < numofButtons; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (i == moleLocation) {
				button.setText("mole");
			}

		}

	}

	public void actionPerformed(ActionEvent e) {
		String chosenText = ((JButton) e.getSource()).getText();
		if (chosenText == "mole") {
			speak("mole");
			frame.dispose();
			
		}
		else
			speak("miss");
	
	}
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
}
