package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MainMenuFrame extends ZooFrame {

	private JButton btnAdd;
	private JButton btnList;
	private JButton btnSaveAndExit;

	public MainMenuFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel(); // adding empty panel to fill grid layout 
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		btnAdd = new JButton("Add");
		slPanel.putConstraint(SpringLayout.NORTH, btnAdd, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnAdd, 93, SpringLayout.WEST, pan);
		pan.add(btnAdd);

		btnList = new JButton("List");
		slPanel.putConstraint(SpringLayout.NORTH, btnList, 150, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnList, 94, SpringLayout.WEST, pan);
		pan.add(btnList);

		btnSaveAndExit = new JButton("Save and Exit");
		slPanel.putConstraint(SpringLayout.NORTH, btnSaveAndExit, 264, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnSaveAndExit, 69, SpringLayout.WEST, pan);
		pan.add(btnSaveAndExit);

		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
		
		
	}

	public void setAddButtonActionListener(ActionListener a) {
		btnAdd.addActionListener(a);
	}

	public void setListButtonActionListener(ActionListener a) {
		btnList.addActionListener(a);
	}

	public void setSaveAndExitButtonActionListener(ActionListener a) {
		btnSaveAndExit.addActionListener(a);
	}

	@Override
	public void goBack() {		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}