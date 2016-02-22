import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cookie {
	public static void main(String[] args) {
		Cookie fortune = new Cookie();
		fortune.showButton();

	}

	private void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton cookie = new JButton();
		frame.add(cookie);
		JPanel panel = new JPanel();

	}
}
