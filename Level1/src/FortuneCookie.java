import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener{
	JButton cookie;
	JPanel panel;
	JFrame frame;
	public static void main(String[]args){
		Cookie fortune = new Cookie();
		fortune.showButton();
	}
	public void showButton(){
		frame = new JFrame();
		frame.setVisible(true);
		cookie = new JButton();
		frame.add(cookie);
		panel = new JPanel();
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(cookie == e.getSource()){
			System.out.println("woohoo");
		}
		
	}
}
