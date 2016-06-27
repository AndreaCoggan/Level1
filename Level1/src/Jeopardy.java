import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Jeopardy implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button2;
	JButton button3;
	JLabel label;
	public static void main(String[]args){
		Jeopardy jeopardy = new Jeopardy();
		jeopardy.createUI();
	}
	void createUI(){
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		button.setText("riddle");
		button2 = new JButton();
		button2.setText("books");
		button3 = new JButton();
		button3.setText("Question");
		label = new JLabel();
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(400,100);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button == e.getSource()) {
			String input = JOptionPane.showInputDialog("Why did the chicken cross the road?");
			if(input.equals("to get to the other side")){
				JOptionPane.showMessageDialog(null, "Youre right");
			}
			else
				JOptionPane.showMessageDialog(null,"wrong");
		}
		if(button2 == e.getSource()){
			String input2 = JOptionPane.showInputDialog("Who wrote Harry Potter?");
			if(input2.equals("J.K. Rowling")){
				JOptionPane.showMessageDialog(null, "Youre right!");
			}
			else{
				JOptionPane.showMessageDialog(null, "wrong");
			}
		}
		if(button3 == e.getSource()){
			String input3 = JOptionPane.showInputDialog("Who won the last world cup for soccer?");
			if(input3.equals("Germany")){
				JOptionPane.showMessageDialog(null, "Correct!");
			}
			else{
				JOptionPane.showMessageDialog(null, "Wrong!");
			}
		}
		}

}

