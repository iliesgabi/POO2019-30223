package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AddEmployeeFrame extends ZooFrame implements ActionListener{

	private String[] messageStrings = {"Caretaker"};
	private JComboBox cmbMessageList = new JComboBox(messageStrings);
	private JLabel lblName= new JLabel();
	private JLabel lblSalary= new JLabel();
	private JLabel lblWorkingHours= new JLabel();
	private JTextField name = new JTextField(10);
	private JTextField salary = new JTextField(10);
	private JTextField workingHours = new JTextField(10);
	private JButton add; 
	
	public AddEmployeeFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		slPanel.putConstraint(SpringLayout.NORTH, cmbMessageList, 25, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cmbMessageList, 70, SpringLayout.WEST, pan);
		pan.add(cmbMessageList);
		cmbMessageList.setSelectedIndex(0);
		cmbMessageList.addActionListener(this);
		
		lblName.setText("name: ");
		lblSalary.setText("salary: ");
		lblWorkingHours.setText("working hours: ");
		
		slPanel.putConstraint(SpringLayout.NORTH, lblName, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, lblName, 70, SpringLayout.WEST, pan);
		pan.add(lblName);
		
		slPanel.putConstraint(SpringLayout.NORTH, name, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,name, 120, SpringLayout.WEST, pan);
		pan.add(name);
		
		slPanel.putConstraint(SpringLayout.NORTH, lblSalary, 95, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, lblSalary, 70, SpringLayout.WEST, pan);
		pan.add(lblSalary);
		
		slPanel.putConstraint(SpringLayout.NORTH, salary, 95, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,salary, 123, SpringLayout.WEST, pan);
		pan.add(salary);
		
		slPanel.putConstraint(SpringLayout.NORTH,lblWorkingHours, 125, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, lblWorkingHours, 70, SpringLayout.WEST, pan);
		pan.add(lblWorkingHours);
		
		slPanel.putConstraint(SpringLayout.NORTH,workingHours, 125, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,workingHours, 170, SpringLayout.WEST, pan);
		pan.add(workingHours);
		
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
	
	public BigDecimal getSalary() {
		String salar=salary.getText();
		BigDecimal unu= new BigDecimal(0);
		BigDecimal p=new BigDecimal(1);
		BigDecimal zece= new BigDecimal(10);
		for(int i=0; i<salar.length(); i++)
		{
			BigDecimal cifra= new BigDecimal(salar.indexOf(i));
			unu=unu.multiply(p);
			unu=unu.add(cifra);
			p.multiply(zece);
		}
		//System.out.print(unu);
		return unu;
	}
	
	public double getWorkingHours() {
		return Double.parseDouble(workingHours.getText());
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
