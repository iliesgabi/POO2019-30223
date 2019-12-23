package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import javasmmr.zoowsome.models.animals.AddAnimalModel;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cat;
import javasmmr.zoowsome.models.animals.Dog;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.views.AddEmployeeController.AddListener;

public class AddMammalController extends AbstractController {
	//private AddAnimalModel model=new AddAnimalModel();
	private AddMammalFrame frame;
	private String name; 
	private int nrOfLegs;
	private double bodyTemp; 
	private double bodyHair; 
	private double dangerPerc; 
	private double maintenanceCost; 
	
	public AddMammalController(AddMammalFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.addAddListener(new AddListener());
		this.frame=addFrame;
	}

	class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) 	{
			name=frame.getName();
			nrOfLegs= frame.getNrOfLegs();
			bodyTemp= frame.getBodyTemp();
			bodyHair= frame.getBodyHair();
			dangerPerc=frame.getDangerPerc();
			maintenanceCost= frame.getMaintenanceCost();
			String typeOfAnimal=frame.getTypeOfAnimal();
			
			
			if (typeOfAnimal.equals("Dog")) {
				Animal animal= new Dog(nrOfLegs,name,bodyTemp,bodyHair,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}
			else if (typeOfAnimal.equals("Cat")) {
				Animal animal= new Cat(nrOfLegs,name,bodyTemp,bodyHair,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}
			else
			{
				Animal animal= new Tiger(nrOfLegs,name,bodyTemp,bodyHair,maintenanceCost, dangerPerc);
				AddAnimalModel.addAnimal(animal);	
			}			
		}
	}
}
