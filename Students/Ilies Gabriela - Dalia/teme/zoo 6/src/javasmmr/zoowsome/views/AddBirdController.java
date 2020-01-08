package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Duck;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Vulture;
import javasmmr.zoowsome.models.animals.WhiteStork;
import javasmmr.zoowsome.views.AddInsectController.AddListener;

public class AddBirdController extends AbstractController {
	private String name;
	private int nrOfLegs; 
	private Boolean migrates; 
	private Integer avgFlightAltitude; 
	private double dangerPerc;
	private double maintenanceCost;
	private AddBirdFrame frame;
	
	public AddBirdController(AddBirdFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.addAddListener(new AddListener());
		this.frame=addFrame;
	}
	
	class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) 	{
			name=frame.getName();
			nrOfLegs=frame.getNrOfLegs();
			if (frame.getMigrates().equals("true"))
				migrates=true;
			else
				migrates=false;
			avgFlightAltitude=frame.getAvgFlightAltitude();
			dangerPerc=frame.getDangerPerc();
			maintenanceCost=frame.getMaintenanceCost();
			String typeOfAnimal=frame.getTypeOfAnimal();
			
			
			if (typeOfAnimal.equals("Vulture")) {
				Animal animal= new Vulture(nrOfLegs,name,migrates,avgFlightAltitude,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}
			else if (typeOfAnimal.equals("Duck")) {
				Animal animal= new Duck(nrOfLegs,name,migrates,avgFlightAltitude,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}
			else
			{
				Animal animal= new WhiteStork(nrOfLegs,name,migrates,avgFlightAltitude,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}			
		}
	}

}
