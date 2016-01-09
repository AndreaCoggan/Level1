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

public class TrickOrTreat implements ActionListener {
	JButton trickButton= new JButton("Trick");
	JButton treatButton = new JButton("Treat");
	public static void main(String[] args) {
		TrickOrTreat trickortreat = new TrickOrTreat();
		trickortreat.createUI();
	}
	void createUI(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.setSize(400, 100);
		frame.add(panel);
		trickButton.addActionListener(this);
		treatButton.addActionListener(this);
		panel.add(trickButton);
		panel.add(treatButton);
		System.out.println("hi");
	}
	public void actionPerformed(ActionEvent e) {
		JButton button3 = (JButton) e.getSource();
		if(trickButton == button3){
			showPictureFromTheInternet("https://i.ytimg.com/vi/hHjGtBnSv50/maxresdefault.jpg");
		}
		else if (treatButton == button3){
			showPictureFromTheInternet("https://c1.staticflickr.com/9/8010/7302668928_49be120251_z.jpg");
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
