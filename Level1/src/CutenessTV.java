import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public static void main(String[] args) {
		CutenessTV ducks = new CutenessTV();
		ducks.createUI();
	}

	void createUI() {
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		button1.setText("ducks");
		button2.setText("frogs");
		button3.setText("unicorns");
		frame.setSize(250, 100);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	void showDucks() {
		playVideo("6TU_zr2y4CQ");
	}

	void showFrog() {
		playVideo("cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("PUCgC_TukKg");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID
					+ "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button4 = (JButton) e.getSource();
		if (button1 == button4) {
			showDucks();
		}
		if (button2 == button4) {
			showFrog();
		}
		if (button3 == button4) {
			showFluffyUnicorns();
		}
		System.out.println("button clicked");

	}
}
