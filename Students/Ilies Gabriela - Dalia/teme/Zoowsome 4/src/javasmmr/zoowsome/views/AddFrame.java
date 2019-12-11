package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddFrame extends ZooFrame{
	private JButton btnMammal;
	private JButton btnBird;
	private JButton btnAquatic;
	private JButton btnInsect;
	private JButton btnReptile;
	
	public AddFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel(); // adding empty panel to fill grid layout contentPanel.add(panel);
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnMammal = new JButton("Mammal");
		slPanel.putConstraint(SpringLayout.NORTH, btnMammal, 10, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnMammal, 93, SpringLayout.WEST, pan);
		pan.add(btnMammal);
		
		btnBird = new JButton("Bird");
		slPanel.putConstraint(SpringLayout.NORTH, btnBird, 50, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnBird, 93, SpringLayout.WEST, pan);
		pan.add(btnBird);
		
		btnAquatic = new JButton("Aquatic");
		slPanel.putConstraint(SpringLayout.NORTH, btnAquatic, 90, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnAquatic, 93, SpringLayout.WEST, pan);
		pan.add(btnAquatic);
		
		btnInsect = new JButton("Insect");
		slPanel.putConstraint(SpringLayout.NORTH, btnInsect, 130, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,btnInsect, 93, SpringLayout.WEST, pan);
		pan.add(btnInsect);
		
		btnReptile = new JButton("Reptile");
		slPanel.putConstraint(SpringLayout.NORTH, btnReptile, 170, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnReptile, 93, SpringLayout.WEST, pan);
		pan.add(btnReptile);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

	public void setMammalButtonActionListener(ActionListener a) {
		btnMammal.addActionListener(a);
	}
	
	public void setBirdButtonActionListener(ActionListener a) {
		btnBird.addActionListener(a);
	}
	
	public void setAquaticButtonActionListener(ActionListener a) {
		btnAquatic.addActionListener(a);
	}
	
	public void setReptileButtonActionListener(ActionListener a) {
		btnReptile.addActionListener(a);
	}
	
	public void setInsectButtonActionListener(ActionListener a) {
		btnInsect.addActionListener(a);
	}
}
