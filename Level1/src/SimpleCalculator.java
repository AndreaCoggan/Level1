import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleCalculator {
	public static void main(String[]args){
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.createUI();
	}
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.setVisible(true);
	JButton button1 = new JButton("add");
	JButton button2 = new JButton("subtract");
	JButton button3 = new JButton("multiply");
	JButton button4 = new JButton("divide");
	
	void createUI() {
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		button1.setText("ducks");
		button2.setText("frogs");
		button3.setText("unicorns");
		frame.setSize(250, 100);
		//button1.addActionListener(this);
		//button2.addActionListener(this);
		//button3.addActionListener(this);
		//button4.addActionListener(this);
	}

}
