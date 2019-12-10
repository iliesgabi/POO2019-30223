package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddController extends AbstractController{

	public AddController(AddFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setMammalButtonActionListener(new MammalButtonActionListener());	
		frame.setBirdButtonActionListener(new BirdButtonActionListener());	
		frame.setInsectButtonActionListener(new InsectButtonActionListener());	
		frame.setReptileButtonActionListener(new ReptileButtonActionListener());	
		frame.setAquaticButtonActionListener(new AquaticButtonActionListener());	
	}

	private class MammalButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController(new AddMammalFrame("Mammal"), true);
		}

	}
	
	private class BirdButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController((new AddBirdFrame("Bird")), true);
		}

	}
	private class ReptileButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController((new AddReptileFrame("Reptile")), true);
		}

	}
	private class AquaticButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController((new AddAquaticFrame("Aquatic")), true);
		}

	}
	private class InsectButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController((new AddInsectFrame("Insect")), true);
		}

	}

}
