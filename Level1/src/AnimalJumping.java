import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnimalJumping {
	 public static void main(String[] args) throws MalformedURLException {

	        /* We want to show an animation of an animal sucking at jumping inside a JFrame.
	         * Once you have chosen from http://animalssuckingatjumping.tumblr.com/, right click and "Copy Image URL" or “Copy Image Address”
	         * Your program must:
	         * 		- show the animation in full without any user interaction. You don’t need a JPanel since it’s only one JComponent.
	         * 		- show the animation in the center of the screen. Clue: frame.setLocationRelativeTo(null)
	         * 		- have a title such as "Gerbil Fail"
	         */

		 	String urlOfAnimalSuckingAtJumping = "http://i.imgur.com/Jdt1rRf.gif";
		 	JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			JLabel label = createImage(urlOfAnimalSuckingAtJumping);
			frame.setTitle("Falling dog");
			frame.add(panel);
			frame.add(label);
			frame.pack();
			frame.setVisible(true);
			frame.setSize(400, 400);
			
	    }
	 
	 static JLabel createImage(String imageURL) throws MalformedURLException {
		 	
		 	URL url = new URL(imageURL);
	        Icon icon = new ImageIcon(url);
	        return new JLabel(icon);
	 }
}
