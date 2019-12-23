package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.AddEmployeeModel;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class AddEmployeeController extends AbstractController {
	private AddEmployeeModel model=new AddEmployeeModel();
	private AddEmployeeFrame frame;
	private String name;
	private BigDecimal salary;
	private double workingHours;
	
	public AddEmployeeController(AddEmployeeFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.addAddListener(new AddListener());
		this.frame=addFrame;
	}

	class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) 	{
			name=frame.getName();
			salary=frame.getSalary();
			workingHours=frame.getWorkingHours();
			
			Caretaker employee= new Caretaker(name, salary, workingHours);
			model.addEmpoyee(employee);	
			//AddEmployeeModel.print();
		}
	}
	
}
