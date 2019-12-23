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
import javax.swing.SpringLayout;

public class ListFrame extends ZooFrame implements ActionListener{
	private String[] messageStrings = {"Animals","Employees"};
	private JComboBox cmbMessageList = new JComboBox(messageStrings);
	private JLabel lblText = new JLabel();
	private JButton list;
	
	public ListFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		lblText.setText("what do you want to list?");
		slPanel.putConstraint(SpringLayout.NORTH, lblText, 25, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, lblText, 250, SpringLayout.WEST, pan);
		pan.add(lblText);
		
		slPanel.putConstraint(SpringLayout.NORTH, cmbMessageList, 55, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cmbMessageList, 270, SpringLayout.WEST, pan);
		pan.add(cmbMessageList);
		
		list= new JButton("List");
		slPanel.putConstraint(SpringLayout.NORTH,list, 95, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,list, 290, SpringLayout.WEST, pan);
		pan.add(list);
	}

	@Override
	public void goBack() {	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	public void addListListener(ActionListener e) {
		list.addActionListener(e);
	}
	
	public String getMessageString() {
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
