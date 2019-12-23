package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AddFrame;

public class AddController extends AbstractController {

	public AddController(AddFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.setAddAnimalButtonActionListener(new AddAnimalButtonActionListener());
		addFrame.setAddEmployeeButtonActionListener(new AddEmployeeButtonActionListener());
	}
	
	private class AddAnimalButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddAnimalController(new AddAnimalFrame("Add Animal"), true);
		}
	}
	
	private class AddEmployeeButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddEmployeeController(new AddEmployeeFrame("Add Employee"), true);
		}
	}
}
