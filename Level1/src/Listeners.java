
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Listeners implements MouseListener, MouseMotionListener {
	JFrame frame;

	public static void main(String[] args) {
		Listeners listener = new Listeners();

	}

	public Listeners() {
		frame = new JFrame();
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.addMouseListener(this);
		frame.addMouseMotionListener(this);
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("a");
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("b");
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("c");
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("d");
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("e");
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("f");
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("g");
	}

}
