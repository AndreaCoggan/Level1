import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		 new ChuckleClicker().makeButtons();
	}
	JButton button1 = new JButton("Joke");
	JButton button2 = new JButton("math");
	public void makeButtons() {
		JFrame frame = new JFrame();
		frame.setSize(200, 60);
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1){
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
		}
		if(e.getSource() == button2){
			JOptionPane.showMessageDialog(null, "What's 1 + 1 ?");
		}
		
	}

}
