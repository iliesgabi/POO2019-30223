package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cat;
import javasmmr.zoowsome.models.animals.Dog;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.views.AddBirdController.AddListener;

public class AddAquaticController extends AbstractController {
	private String name; 
	private Integer nrOfLegs; 
	private String waterType; 
	private Integer avgSwimDepth; 
	private double dangerPerc;
	private double maintenanceCost; 
	private AddAquaticFrame frame; 
	
	public AddAquaticController(AddAquaticFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.addAddListener(new AddListener());
		this.frame=addFrame;
	}
	
	class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) 	{
			name=frame.getName();
			nrOfLegs= frame.getNrOfLegs();
			avgSwimDepth= frame.getAvgSwimDepth();
			waterType=frame.getWaterType();
			dangerPerc=frame.getDangerPerc();
			maintenanceCost= frame.getMaintenanceCost();
			String typeOfAnimal=frame.getTypeOfAnimal();
			
			
			if (typeOfAnimal.equals("Dolphin")) {
				Animal animal= new Dolphin(nrOfLegs,name,avgSwimDepth,waterType,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}
			else if (typeOfAnimal.equals("Octopus")) {
				Animal animal= new Octopus(nrOfLegs,name,avgSwimDepth,waterType,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}
			else
			{
				Animal animal= new Shark(nrOfLegs,name,avgSwimDepth,waterType,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}			
		}
	}

}
