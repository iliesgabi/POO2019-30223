package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddAnimalFrame extends ZooFrame{
	private JButton addMammal;
	private JButton addBird;
	private JButton addInsect;
	private JButton addReptile;
	private JButton addAquatic;
	
	public AddAnimalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		addMammal= new JButton("Mammal");
		slPanel.putConstraint(SpringLayout.NORTH, addMammal, 35, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, addMammal, 270, SpringLayout.WEST, pan);
		pan.add(addMammal);
		
		addBird= new JButton("Bird");
		slPanel.putConstraint(SpringLayout.NORTH, addBird, 95, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, addBird, 280, SpringLayout.WEST, pan);
		pan.add(addBird);
		
		addInsect= new JButton("Insect");
		slPanel.putConstraint(SpringLayout.NORTH, addInsect, 155, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, addInsect, 275, SpringLayout.WEST, pan);
		pan.add(addInsect);
		
		addReptile= new JButton("Reptile");
		slPanel.putConstraint(SpringLayout.NORTH, addReptile, 215, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, addReptile, 273, SpringLayout.WEST, pan);
		pan.add(addReptile);
		
		addAquatic= new JButton("Aquatic");
		slPanel.putConstraint(SpringLayout.NORTH, addAquatic, 275, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, addAquatic, 271, SpringLayout.WEST, pan);
		pan.add(addAquatic);

	}

	@Override
	public void goBack() {	
	}
	
	public void setAddMammalButtonActionListener(ActionListener a) {
		addMammal.addActionListener(a);
	}
	
	public void setAddBirdButtonActionListener(ActionListener a) {
		addBird.addActionListener(a);
	}
	
	public void setAddInsectButtonActionListener(ActionListener a) {
		addInsect.addActionListener(a);
	}
	
	public void setAddReptileButtonActionListener(ActionListener a) {
		addReptile.addActionListener(a);
	}
	
	public void setAddAquaticButtonActionListener(ActionListener a) {
		addAquatic.addActionListener(a);
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
