package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;


public class AddFrame extends ZooFrame {
	private JButton addAnimal;
	private JButton addEmployee;
	
	public AddFrame(String title) {
		super(title);
		
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		JLabel text= new JLabel();
		text.setText("Choose what do you want to add: ");
		slPanel.putConstraint(SpringLayout.NORTH, text, 20, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, text, 230, SpringLayout.WEST, pan);
		pan.add(text);
		
		addAnimal= new JButton("Add Animal");
		slPanel.putConstraint(SpringLayout.NORTH, addAnimal, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, addAnimal, 270, SpringLayout.WEST, pan);
		pan.add(addAnimal);
		
		addEmployee = new JButton("Add Employee");
		slPanel.putConstraint(SpringLayout.NORTH, addEmployee, 130, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, addEmployee, 260, SpringLayout.WEST, pan);
		pan.add(addEmployee);
		
		pan.setVisible(true);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}
	
	public void setAddAnimalButtonActionListener(ActionListener a) {
		addAnimal.addActionListener(a);
	}
	
	public void setAddEmployeeButtonActionListener(ActionListener a) {
		addEmployee.addActionListener(a);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseClicked(MouseEvent e) {
		String[] gmts = { "GMT+0", "GMT+1", "GMT+2", "GMT+3", "GMT+4", "GMT+5", "GMT+6", "GMT+7" };
		String option =(String)JOptionPane.showInputDialog(frame, "Choose the new timezone","", JOptionPane.INFORMATION_MESSAGE, null,gmts, gmts[2]);
		time=option;
	}

}