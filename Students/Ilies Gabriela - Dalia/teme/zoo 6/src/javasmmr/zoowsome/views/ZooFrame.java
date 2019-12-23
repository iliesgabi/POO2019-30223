package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Calendar;
import java.util.TimeZone;

import javasmmr.zoowsome.services.factories.Constants.FRAMES;
import javasmmr.zoowsome.views.utilities.FrameStack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

public abstract class ZooFrame extends JFrame
		implements ZooFrame_I, MouseListener, MouseMotionListener, ActionListener {
	protected JFrame frame;
	protected String time;
	private JLabel clk;
	protected JPanel contentPanel;

	public ZooFrame(String title) {
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize(FRAMES.WIDTH, FRAMES.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(Color.red);
		add(contentPanel, BorderLayout.CENTER);
	}

	public void setBackButtonActionListener(ActionListener a) {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton backButton = new JButton("Back");
		buttonPanel.add(backButton);
		this.add(buttonPanel, BorderLayout.NORTH);
		backButton.addActionListener(a);

		clk = new JLabel("00:00:00");

		JPanel clkPanel = new JPanel();
		clkPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		clkPanel.add(clk);

		buttonPanel.add(clkPanel);

		clk.addMouseListener(this);

		Clock thread = new Clock();
		thread.start();
	}

	public class Clock extends Thread {
		public void run() {

			while (true) {
				Calendar calendar;
				if (time != null) {
					TimeZone zone = TimeZone.getTimeZone(time);
					calendar = Calendar.getInstance(zone);
				} else
					calendar = Calendar.getInstance();
				String hour = new String();
				String minute = new String();
				String second = new String();

				if (calendar.get(Calendar.HOUR_OF_DAY) < 10)
					hour = "0" + calendar.get(Calendar.HOUR_OF_DAY);
				else
					hour = "" + calendar.get(Calendar.HOUR_OF_DAY);
				if (calendar.get(Calendar.MINUTE) < 10)
					minute = "0" + calendar.get(Calendar.MINUTE);
				else
					minute = "" + calendar.get(Calendar.MINUTE);
				if (calendar.get(Calendar.SECOND) < 10)
					second = "0" + calendar.get(Calendar.SECOND);
				else
					second = "" + calendar.get(Calendar.SECOND);
				clk.setText(hour + ":" + minute + ":" + second);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
