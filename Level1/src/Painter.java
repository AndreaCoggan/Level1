import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Painter extends JPanel implements MouseListener, MouseMotionListener, KeyListener {

	Color c = new Color(0, 0, 0);
	Random r = new Random();

	JFrame window;

	ArrayList<Dot> dots = new ArrayList<Dot>();

	public static void main(String[] args) {
		new Painter();
	}

	public Painter() {
		window = new JFrame();
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();
		window.addMouseListener(this);
		window.addMouseMotionListener(this);
		window.addKeyListener(this);

		// 1. Make the window respond to mouse clicks
		// 2. Use the addDot() method to create a new dot at the mouse's x and y position when the mouse is clicked.

	}

	public void paintComponent(Graphics g) {
		for (Dot d : dots) {
			d.draw(g);
		}
	}

	private void addDot(int x, int y) {
		dots.add(new Dot(x, y, 50, 50));

	}

	private class Dot {
		int x;
		int y;
		int width;
		int height;

		public Dot(int x, int y, int width, int height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}

		public void draw(Graphics g) {
			g.setColor(c);
			g.fillRect(x, y, width, height);
		}
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		addDot(e.getX(), e.getY());
		repaint();
		c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		addDot(e.getX(), e.getY());
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_0) {
			c = new Color(45, 0, 0);
		}
		if (e.getKeyCode() == KeyEvent.VK_1) {
			c = new Color(150, 90, 0);
		}
		if (e.getKeyCode() == KeyEvent.VK_2) {
			c = new Color(0, 210, 50);
		}
		if (e.getKeyCode() == KeyEvent.VK_3) {
			c = new Color(45, 0, 200);
		}
		if (e.getKeyCode() == KeyEvent.VK_4) {
			c = new Color(100, 100, 0);
		}
		if (e.getKeyCode() == KeyEvent.VK_5) {
			c = new Color(0, 0, 150);
		}
		if (e.getKeyCode() == KeyEvent.VK_6) {
			c = new Color(45, 45, 45);
		}
		if (e.getKeyCode() == KeyEvent.VK_7) {
			c = new Color(0, 0, 0);
		}
		if (e.getKeyCode() == KeyEvent.VK_8) {
			c = new Color(63, 100, 50);
		}
		if (e.getKeyCode() == KeyEvent.VK_9) {
			c = new Color(200, 90, 10);
		}

	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}