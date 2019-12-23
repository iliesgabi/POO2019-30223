package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cat;
import javasmmr.zoowsome.models.animals.Dog;
import javasmmr.zoowsome.models.animals.Lizzard;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.views.AddMammalController.AddListener;

public class AddReptileController extends AbstractController {
	private AddReptileFrame frame;
	private String name;
	private int nrOfLegs;
	private Boolean laysEggs;
	private double dangerPerc;
	private double maintenanceCost;
	
	public AddReptileController(AddReptileFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.addAddListener(new AddListener());
		this.frame=addFrame;
	}

	class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) 	{
			name=frame.getName();
			nrOfLegs=frame.getNrOfLegs();
			if (frame.getLaysEggs().equals("true"))
				laysEggs=true;
			else
				laysEggs=false;
			dangerPerc=frame.getDangerPerc();
			maintenanceCost=frame.getMaintenanceCost();
			String typeOfAnimal=frame.getTypeOfAnimal();
			
			
			if (typeOfAnimal.equals("Lizzard")) {
				Animal animal= new Lizzard(nrOfLegs,name,laysEggs,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}
			else if (typeOfAnimal.equals("Turtle")) {
				Animal animal= new Turtle(nrOfLegs,name,laysEggs,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}
			else
			{
				Animal animal= new Snake(nrOfLegs,name,laysEggs,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}			
		}
	}
}
