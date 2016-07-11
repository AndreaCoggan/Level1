import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ButtonGame implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	/**JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	**/JButton specialButton = new JButton();
	public static void main(String[]args){
		ButtonGame game = new ButtonGame();
		game.createUI();
	}
	void createUI(){
		frame.add(panel);
		/**panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		**/panel.add(specialButton);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.pack();
		/**button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		**/specialButton.addActionListener(this);
		Random r = new Random();
		int rand = r.nextInt(7);
		for(int i = 0; i < 7; i++){
			if (i==rand){
				panel.add(specialButton);
			}else{
				JButton loseButton = new JButton();
				loseButton.addActionListener(this);
				panel.add(loseButton);
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(specialButton)){
			JOptionPane.showMessageDialog(null,"you win!");
		}
		else
			JOptionPane.showMessageDialog(null, "you lost :( ");
	}
}