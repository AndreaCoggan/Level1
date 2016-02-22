import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ReservationWindow implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField field;
	JTextField field2;
	JTextField field3;
	JTextField field4;
	String variables = "";
	JLabel label;

	public static void main(String[] args) {
		ReservationWindow reservation = new ReservationWindow();
		reservation.createUI();
	}

	void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		button = new JButton();
		label = new JLabel();
		frame.add(panel);
		panel.add(button);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		button.setText("Submit");
		field = new JTextField(20);
		field2 = new JTextField(20);
		field3 = new JTextField(20);
		field4 = new JTextField(40);
		field.setText("name");
		field2.setText("total people");
		field3.setText("time");
		panel.add(field);
		panel.add(field2);
		panel.add(field3);
		panel.add(field4);
		frame.setSize(400, 400);
		button.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button == e.getSource()) {
			String s = field.getText();
			int x = Integer.parseInt(field2.getText());
			Float y = Float.parseFloat(field3.getText());
			Reservation res1 = new Reservation(s, x, y);
			variables += res1.getName();
			variables += res1.getTotalPeople();
			variables += res1.getTime();
			label.setText(variables);
		}
	}
}
