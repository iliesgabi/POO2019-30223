package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddReptileFrame extends AddFrame{
	private JButton btnTurtle;
	private JButton btnLizzard;
	private JButton btnSnake;
	
	public AddReptileFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel(); // adding empty panel to fill grid layout contentPanel.add(panel);
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnTurtle = new JButton("Turtle");
		slPanel.putConstraint(SpringLayout.NORTH, btnTurtle, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnTurtle, 93, SpringLayout.WEST, pan);
		pan.add(btnTurtle);
		
		btnLizzard = new JButton("Lizzard");
		slPanel.putConstraint(SpringLayout.NORTH,  btnLizzard, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,  btnLizzard, 93, SpringLayout.WEST, pan);
		pan.add( btnLizzard);
		
		btnSnake = new JButton("Snake");
		slPanel.putConstraint(SpringLayout.NORTH, btnSnake, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnSnake, 93, SpringLayout.WEST, pan);
		pan.add(btnSnake);
		
	}
	
	public void setTurtleButtonActionListener(ActionListener a) {
		btnTurtle.addActionListener(a);
	}
	
	public void setLizzardButtonActionListener(ActionListener a) {
		btnLizzard.addActionListener(a);
	}
	
	public void setSnakeButtonActionListener(ActionListener a) {
		btnSnake.addActionListener(a);
	}
	
	
}
