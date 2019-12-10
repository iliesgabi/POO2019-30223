package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddBirdFrame extends AddFrame{
	private JButton btnDuck;
	private JButton btnVulture;
	private JButton btnWhiteStork;
	
	public AddBirdFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel(); // adding empty panel to fill grid layout contentPanel.add(panel);
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnDuck= new JButton("Duck");
		slPanel.putConstraint(SpringLayout.NORTH, btnDuck, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnDuck, 93, SpringLayout.WEST, pan);
		pan.add(btnDuck);
		
		btnVulture = new JButton("Vulture");
		slPanel.putConstraint(SpringLayout.NORTH, btnVulture, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnVulture, 93, SpringLayout.WEST, pan);
		pan.add(btnVulture);
		
		btnWhiteStork = new JButton("WhiteStork");
		slPanel.putConstraint(SpringLayout.NORTH, btnWhiteStork, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnWhiteStork, 93, SpringLayout.WEST, pan);
		pan.add(btnWhiteStork);
		
	}
	
	public void setDuckButtonActionListener(ActionListener a) {
		btnDuck.addActionListener(a);
	}
	
	public void setVultureButtonActionListener(ActionListener a) {
		btnVulture.addActionListener(a);
	}
	
	public void setWhiteStorkButtonActionListener(ActionListener a) {
		btnWhiteStork.addActionListener(a);
	}
	
	
}
