import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculation implements ActionListener {
	public static void main(String[] args) {
		SimpleCalculation calc = new SimpleCalculation();
		calc.createUI();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField field = new JTextField(20);
	JButton button = new JButton();

	void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(field);
		frame.pack();
		panel.add(button);
		button.setText("square it");
		frame.setSize(400, 200);
		int x = field.getText();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
		}

	}

}
