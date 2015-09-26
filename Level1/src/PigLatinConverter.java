import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Binary.PigLatinTranslator;

public class PigLatinConverter implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button = new JButton();
	JTextField answer = new JTextField(20);
	JTextField answer2 = new JTextField(20);
	//PigLatinConverter translator = new PigLatinConverter();
	
	
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
		PigLatinConverter translator = new PigLatinConverter();
		translator.createUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(answer.getText());
		PigLatinTranslator translator = new PigLatinTranslator();
		String translatedText = translator.translate(answer.getText());
		answer2.setText(translatedText);
	}
	String convert(String binary) {
		int asciivalue= Integer.parseInt(binary,2);
		char theLetter = (char)asciivalue;
		return "" + theLetter;
	}


}