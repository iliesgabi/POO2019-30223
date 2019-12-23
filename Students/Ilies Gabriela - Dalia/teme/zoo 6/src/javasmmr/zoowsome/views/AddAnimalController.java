package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddAnimalController extends AbstractController {
	
	public AddAnimalController(AddAnimalFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.setAddMammalButtonActionListener(new AddMammalButtonActionListener());
		addFrame.setAddReptileButtonActionListener(new AddReptileButtonActionListener());
		addFrame.setAddInsectButtonActionListener(new AddInsectButtonActionListener());
		addFrame.setAddBirdButtonActionListener(new AddBirdButtonActionListener());
		addFrame.setAddAquaticButtonActionListener(new AddAquaticButtonActionListener());
		
	}
	
	private class AddMammalButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddMammalController(new AddMammalFrame("Add Mammal"), true);
		}
	}

	private class AddBirdButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddBirdController(new AddBirdFrame("Add Bird"), true);
		}
	}
	
	private class AddInsectButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddInsectController(new AddInsectFrame("Add Insect"), true);
		}
	}
	
	private class AddReptileButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddReptileController(new AddReptileFrame("Add Reptile"), true);
		}
	}
	
	private class AddAquaticButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddAquaticController(new AddAquaticFrame("Add Aquatic"), true);
		}
	}
	
}
