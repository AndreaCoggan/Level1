package Binary;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	//JButton onButton = new JButton();
	JButton num1 = new JButton();
	JButton num2 = new JButton();
	JButton addButton = new JButton();
	JButton subtractButton = new JButton();
	JButton multiplyButton = new JButton();
	JButton divideButton = new JButton();
	JTextField text = new JTextField(20);
	JTextField text2 = new JTextField(20);
	JLabel label = new JLabel();
	
	public static void main (String []args){
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.createUI();
	}
	void createUI(){
		//panel.add(onButton);
		panel.add(num1);
		panel.add(num2);
		panel.add(addButton);
		panel.add(subtractButton);
		panel.add(multiplyButton);
		panel.add(divideButton);
		panel.add(label);
		frame.add(panel);
		frame.pack();
		panel.add(text);
		panel.add(text2);
		frame.setVisible(true);
		frame.setSize(300, 400);
		//onButton.setText("On Button");
		num1.setText("5");
		num2.setText("4");
		addButton.setText("+");
		subtractButton.setText("-");
		multiplyButton.setText("x");
		divideButton.setText("/");
		panel.setBackground(Color.RED);
		//onButton.addActionListener(this);
		num1.addActionListener(this);
		num2.addActionListener(this);
		addButton.addActionListener(this);
		subtractButton.addActionListener(this);
		multiplyButton.addActionListener(this);
		divideButton.addActionListener(this);
		
	}
	public int addNumbers(int num1, int num2){
		return num1 + num2;
		
	}
	public int subtractNumbers(int num1, int num2){
		return num1 - num2;
	}
	public int divideNumbers(int num1, int num2){
		return num1 / num2;
	}
	public int multiplyNumbers(int num1, int num2){
		return num1 * num2;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton button4 = (JButton) e.getSource();
		int number1 = Integer.parseInt(text.getText());
		int number2 = Integer.parseInt(text2.getText());
		if(addButton == button4){
			label.setText(addNumbers(number1, number2)+ "");
		}
		if(subtractButton == button4){
			label.setText(subtractNumbers(number1, number2) + "");
		}
		if(multiplyButton == button4){
			label.setText(multiplyNumbers(number1,number2)+ "");
		}
		if(divideButton == button4){
			label.setText(divideNumbers(number1, number2) + "");
		}
		
	}
	

}
