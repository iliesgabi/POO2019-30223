import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class DragBallPanel extends JPanel implements MouseListener, MouseMotionListener, ActionListener {

	private static final int BALL_DIAMETER = 40;

	private int _ballX = 50;
	private int _ballY = 50;

	private int _dragFromX = 0;
	private int _dragFromY = 0;

	private Timer t;

	private boolean _canDrag = false;

	public DragBallPanel() {
		setPreferredSize(new Dimension(300, 300));
		setBackground(Color.blue);
		setForeground(Color.yellow);

		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Required for background.
		g.fillOval(_ballX, _ballY, BALL_DIAMETER, BALL_DIAMETER);

		String x = String.valueOf(_ballX);
		String y = String.valueOf(_ballY);

		g.drawString(x + " " + y, 10, 20);

	}

	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		if (x >= _ballX && x <= (_ballX + BALL_DIAMETER) && y >= _ballY && y <= (_ballY + BALL_DIAMETER)) {
			_canDrag = true;

			_dragFromX = x - _ballX;
			_dragFromY = y - _ballY;
		} else {
			_canDrag = false;
		}

	}

	public void mouseDragged(MouseEvent e) {
		if (_canDrag) {
			_ballX = e.getX() - _dragFromX;
			_ballY = e.getY() - _dragFromY;

			_ballX = Math.max(_ballX, 0);
			_ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);

			_ballY = Math.max(_ballY, 0);
			_ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);

			this.repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		_canDrag = false;
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (x >= _ballX && x <= (_ballX + BALL_DIAMETER) && y >= _ballY && y <= (_ballY + BALL_DIAMETER)) {
			{
				Random rand = new Random();

				t = new Timer(100, this);
				t.start();
				try {
					Thread.sleep(1 * 1000);
				} catch (InterruptedException ie) {
					Thread.currentThread().interrupt();
				}
				
				_ballX = rand.nextInt(260);
				_ballY = rand.nextInt(260);
				this.repaint();
			}
		}
	}

	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}