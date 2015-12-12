import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrickOrTreat {
	public static void main(String[] args) {
		TrickOrTreat trickortreat = new TrickOrTreat();
		trickortreat.createUI();
	}
	void createUI(){
		JFrame frame = new JFrame();
		JButton button1 = new JButton("Trick");
		JButton button2 = new JButton("Treat");
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.setSize(400, 100);
		frame.add(panel);
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		panel.add(button1);
		panel.add(button2);
	}
	public void actionPerformed(ActionEvent e) {
		JButton button3 = (JButton) e.getSource();
		if(button1 == button3){
			
		}
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
