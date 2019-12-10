package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddMammalFrame extends AddFrame{
	private JButton btnDog;
	private JButton btnCat;
	private JButton btnTiger;
	
	public AddMammalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel(); // adding empty panel to fill grid layout contentPanel.add(panel);
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnDog = new JButton("Dog");
		slPanel.putConstraint(SpringLayout.NORTH, btnDog, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnDog, 93, SpringLayout.WEST, pan);
		pan.add(btnDog);
		
		btnCat = new JButton("Cat");
		slPanel.putConstraint(SpringLayout.NORTH, btnCat, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnCat, 93, SpringLayout.WEST, pan);
		pan.add(btnCat);
		
		btnTiger = new JButton("Tiger");
		slPanel.putConstraint(SpringLayout.NORTH, btnTiger, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnTiger, 93, SpringLayout.WEST, pan);
		pan.add(btnTiger);
		
	}
	
	public void setDogButtonActionListener(ActionListener a) {
		btnDog.addActionListener(a);
	}
	
	public void setCatButtonActionListener(ActionListener a) {
		btnCat.addActionListener(a);
	}
	
	public void setTigerButtonActionListener(ActionListener a) {
		btnTiger.addActionListener(a);
	}
	
	
}
