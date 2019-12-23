package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import javasmmr.zoowsome.models.animals.AddAnimalModel;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.AddEmployeeModel;
import javasmmr.zoowsome.models.employees.Employee;

public class ListController extends AbstractController {
	private ListFrame frame;

	public ListController(ListFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.addListListener(new AddListButtonActionListener());
		this.frame=frame;
	}

	private class AddListButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (frame.getMessageString().equals("Employees")) {
				AddEmployeeModel.print();
			}
			else {
				AddAnimalModel.print();
			}
			
		}
	}
}
