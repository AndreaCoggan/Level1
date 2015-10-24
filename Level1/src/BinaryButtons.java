import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class BinaryButtons implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton clearButton = new JButton();
	JLabel score = new JLabel();
	int sum = 0;

	public static void main(String[] args) {
		BinaryButtons button = new BinaryButtons();
		button.createUI();

	}

	void createUI() {
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(clearButton);
		panel.add(score);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		button1.setText("");
		button2.setText("");
		button3.setText("");
		button4.setText("");
		button5.setText("");
		clearButton.setText("clear");
		button1.setIcon(createImage("blank_card.png"));
		button2.setIcon(createImage("blank_card.png"));
		button3.setIcon(createImage("blank_card.png"));
		button4.setIcon(createImage("blank_card.png"));
		button5.setIcon(createImage("blank_card.png"));

		frame.setSize(1500, 400);
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		clearButton.addActionListener((ActionListener) this);
	}

	private Icon createImage(String filename) {
		java.net.URL imageURL = getClass().getResource(filename);
		Icon icon = new ImageIcon(imageURL);
		return icon;

	}

	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();

		if (clickedButton.equals(button1)) {
			if (button1.getText().equals("")) {
				button1.setIcon(createImage("16_card.png"));
				button1.setText(" ");
				sum = sum + 16;
			} else {
				button1.setIcon(createImage("blank_card.png"));
				button1.setText("");
				sum = sum - 16;
			}
		}
		if (clickedButton.equals(button2)) {
			if (button2.getText().equals("")) {
				button2.setIcon(createImage("8_card.png"));
				button2.setText(" ");
				sum = sum + 8;
			} else {
				button2.setIcon(createImage("blank_card.png"));
				button2.setText("");
				sum = sum - 8;
			}
		}
		if (clickedButton.equals(button3)) {
			if (button3.getText().equals("")) {
				button3.setIcon(createImage("4_card.png"));
				button3.setText(" ");
				sum = sum + 4;
			} else {
				button3.setIcon(createImage("blank_card.png"));
				button3.setText("");
				sum = sum - 4;
			}
		}
		if (clickedButton.equals(button4)) {
			if (button4.getText().equals("")) {
				button4.setIcon(createImage("2_card.png"));
				button4.setText(" ");
				sum = sum + 2;
			} else {
				button4.setIcon(createImage("blank_card.png"));
				button4.setText("");
				sum = sum - 2;
			}
		}
		if (clickedButton.equals(button5)) {
			if (button5.getText().equals("")) {
				button5.setIcon(createImage("one_card.png"));
				button5.setText(" ");
				sum = sum + 1;
			} else {
				button5.setIcon(createImage("blank_card.png"));
				button5.setText("");
				sum = sum - 1;
			}
		}
		if (clickedButton.equals(clearButton)) {
			sum = 0;
		}
		score.setText("your sum is " + sum);
	}

}
