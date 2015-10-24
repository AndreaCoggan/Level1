import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button = new JButton();
	JTextField answer = new JTextField(20);
	JTextField answer2 = new JTextField(20);

	void createUI() {
		frame.add(panel);
		panel.add(answer);
		panel.add(button);
		frame.setVisible(true);
		frame.setSize(700, 80);
		panel.add(answer2);
		button.setText("convert");
		button.addActionListener(this);

	}

	public static void main(String[] args) {
		BinaryConverter convert = new BinaryConverter();
		convert.createUI();

	}
	public void actionPerformed(ActionEvent e) {
		System.out.println(convert(answer.getText()));
		
		
	}
	String convert(String binary) {
		int asciivalue= Integer.parseInt(binary,2);
		char theLetter = (char)asciivalue;
		return "" + theLetter;
	}


}
