package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import javasmmr.zoowsome.models.animals.AddAnimalModel;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Lizzard;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.views.AddMammalController.AddListener;

public class AddInsectController extends AbstractController {
	private String name;
	private int nrOfLegs; 
	private Boolean canFly; 
	private Boolean isDangerous; 
	private double dangerPerc;
	private double maintenanceCost;
	private AddInsectFrame frame;
	
	public AddInsectController(AddInsectFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.addAddListener(new AddListener());
		this.frame=addFrame;
	}
	
	class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) 	{
			name=frame.getName();
			nrOfLegs=frame.getNrOfLegs();
			if (frame.getCanFly().equals("true"))
				canFly=true;
			else
				canFly=false;
			if (frame.getIsDangerous().equals("true"))
				isDangerous=true;
			else
				isDangerous=false;
			dangerPerc=frame.getDangerPerc();
			maintenanceCost=frame.getMaintenanceCost();
			String typeOfAnimal=frame.getTypeOfAnimal();
			
			
			if (typeOfAnimal.equals("Butterfly")) {
				Animal animal= new Butterfly(nrOfLegs,name,canFly,isDangerous,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}
			else if (typeOfAnimal.equals("Spider")) {
				Animal animal= new Spider(nrOfLegs,name,canFly,isDangerous,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}
			else
			{
				Animal animal= new Cockroach(nrOfLegs,name,canFly,isDangerous,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}				
		}
	}

}
