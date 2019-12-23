package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AddMammalFrame extends ZooFrame implements ActionListener{
	private String[] messageStrings = {"Dog","Cat","Tiger"};
	private JComboBox cmbMessageList = new JComboBox(messageStrings);
	private JLabel lblName = new JLabel();
	private JLabel lblNrOfLegs = new JLabel();
	private JLabel lblBodyTemp = new JLabel();
	private JLabel lblMaintenanceCost = new JLabel();
	private JLabel lblDangerPerc = new JLabel();
	private JLabel lblBodyHair = new JLabel();
	private JTextField name = new JTextField(10);
	private JTextField nrOfLegs = new JTextField(10);
	private JTextField bodyTemp = new JTextField(10);
	private JTextField bodyHair = new JTextField(10);
	private JTextField dangerPerc = new JTextField(10);
	private JTextField maintenanceCost = new JTextField(10);
	private JButton add; 
	
	public AddMammalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		slPanel.putConstraint(SpringLayout.NORTH, cmbMessageList, 25, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cmbMessageList, 70, SpringLayout.WEST, pan);
		pan.add(cmbMessageList);
		cmbMessageList.setSelectedIndex(1);
		cmbMessageList.addActionListener(this);
		
		lblNrOfLegs.setText("number of legs: ");
		lblName.setText("name: ");
		lblBodyTemp.setText("normal body temperature: ");
		lblBodyHair.setText("percent of body hair: ");
		lblMaintenanceCost.setText("maintenance cost (in hours): ");
		lblDangerPerc.setText("danger percent: ");
		
		slPanel.putConstraint(SpringLayout.NORTH, lblName, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, lblName, 70, SpringLayout.WEST, pan);
		pan.add(lblName);
		
		slPanel.putConstraint(SpringLayout.NORTH, name, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,name, 120, SpringLayout.WEST, pan);
		pan.add(name);
		
		slPanel.putConstraint(SpringLayout.NORTH, lblNrOfLegs, 95, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,lblNrOfLegs, 70, SpringLayout.WEST, pan);
		pan.add(lblNrOfLegs);
		
		slPanel.putConstraint(SpringLayout.NORTH, nrOfLegs, 95, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,nrOfLegs, 170, SpringLayout.WEST, pan);
		pan.add(nrOfLegs);
		
		slPanel.putConstraint(SpringLayout.NORTH, lblBodyTemp, 125, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, lblBodyTemp, 70, SpringLayout.WEST, pan);
		pan.add(lblBodyTemp);
		
		slPanel.putConstraint(SpringLayout.NORTH, bodyTemp, 125, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,bodyTemp, 230, SpringLayout.WEST, pan);
		pan.add(bodyTemp);
		
		slPanel.putConstraint(SpringLayout.NORTH, lblBodyHair, 155, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, lblBodyHair, 70, SpringLayout.WEST, pan);
		pan.add(lblBodyHair);
		
		slPanel.putConstraint(SpringLayout.NORTH,bodyHair, 155, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,bodyHair, 200, SpringLayout.WEST, pan);
		pan.add(bodyHair);
		
		slPanel.putConstraint(SpringLayout.NORTH, lblMaintenanceCost, 185, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,lblMaintenanceCost, 70, SpringLayout.WEST, pan);
		pan.add(lblMaintenanceCost);
		
		slPanel.putConstraint(SpringLayout.NORTH,maintenanceCost, 185, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,maintenanceCost, 250, SpringLayout.WEST, pan);
		pan.add(maintenanceCost);
		
		slPanel.putConstraint(SpringLayout.NORTH,lblDangerPerc, 215, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,lblDangerPerc, 70, SpringLayout.WEST, pan);
		pan.add(lblDangerPerc);
		
		slPanel.putConstraint(SpringLayout.NORTH,dangerPerc, 215, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,dangerPerc, 170, SpringLayout.WEST, pan);
		pan.add(dangerPerc);
		
		add= new JButton("Add");
		slPanel.putConstraint(SpringLayout.NORTH,add, 285, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,add, 270, SpringLayout.WEST, pan);
		pan.add(add);
	}

	@Override
	public void goBack() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	public void addAddListener(ActionListener e) {
		add.addActionListener(e);
	}
	
	public String getName() {
		return name.getText();
	}
	
	public int getNrOfLegs() {
		return Integer.parseInt(nrOfLegs.getText());
	}	
	
	public Double getBodyTemp() {
		return Double.parseDouble(bodyTemp.getText());
	}
	
	public Double getBodyHair() {
		return Double.parseDouble(bodyHair.getText());
	}
	
	public Double getMaintenanceCost() {
		return Double.parseDouble(maintenanceCost.getText());
	}
	
	public Double getDangerPerc() {
		return Double.parseDouble(dangerPerc.getText());
	}
	
	public String getTypeOfAnimal() {
		return (String) this.cmbMessageList.getSelectedItem();
	}
	
	public void mouseClicked(MouseEvent e) {
		String[] gmts = { "GMT+0", "GMT+1", "GMT+2", "GMT+3", "GMT+4", "GMT+5", "GMT+6", "GMT+7" };
		String option =(String)JOptionPane.showInputDialog(frame, "Choose the new timezone","", JOptionPane.INFORMATION_MESSAGE, null,gmts, gmts[2]);
		time=option;
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
}
