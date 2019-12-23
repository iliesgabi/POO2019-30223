package javasmmr.zoowsome.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.MainMenuController;
import javasmmr.zoowsome.views.MainMenuFrame;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);

		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cat);
		Animal a2 = speciesFactory2.getAnimal(Constants.Animals.Birds.Duck);
		Animal a3 = speciesFactory3.getAnimal(Constants.Animals.Reptiles.Turtle);

		System.out.print("We have an animal with " + a1.getNrOfLegs() + " legs!\n");
		System.out.print("We have an animal with " + a2.getNrOfLegs() + " legs!\n");
		System.out.print("We have an animal with " + a3.getNrOfLegs() + " legs!\n");

		Animal[] animale = new Animal[3];
		animale[2] = speciesFactory2.getAnimal(Constants.Animals.Birds.Duck);
		animale[1] = speciesFactory2.getAnimal(Constants.Animals.Birds.WhiteStork);
		animale[0]= speciesFactory4.getAnimal(Constants.Animals.Aquatics.Shark);
		
		BigDecimal salar1 = new BigDecimal(2500);
		BigDecimal salar2 = new BigDecimal(3000);

		Employee[] employee = new Caretaker[2];

		employee[0] = new Caretaker("Vlad", salar1, 8.0);
		employee[1] = new Caretaker("Iulia", salar2, 9.0);

		System.out.print(employee[0].getId() + " ");
		System.out.print(employee[1].getId()+ "\n");

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 3; j++) {
				if (employee[i].getIsDead() == false && animale[j].isTakenCareOf() == false) {
					String result = ((Caretaker) employee[i]).takeCareOf(animale[j]);
					if (result.equals(Constants.Employees.CaretakerStatus.TCO_KILLED)==true) {
						employee[i].setIsDead(true);
					} else if (result.equals(Constants.Employees.CaretakerStatus.TCO_NO_TIME)==true) {
						break;
					} else {
						animale[j].setTakenCareOf(true);
					}
				}
			}

		print(employee);
		print(animale);
		
		AnimalRepository animalRepository= new AnimalRepository();
		ArrayList<Animal>animals= new ArrayList<Animal>(3);
		animals.add(speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger));
		animals.add(speciesFactory1.getAnimal(Constants.Animals.Mammals.Cat));
		animals.add(speciesFactory1.getAnimal(Constants.Animals.Mammals.Dog));
		animalRepository.save(animals);
		
		try {
			animalRepository.load();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		EmployeeFactory employeeAbstractFactory= new EmployeeFactory();
		EmployeeAbstractFactory employeeFactory = employeeAbstractFactory.getEmployeeFactory(Constants.Employees.Caretaker);
		
		
		EmployeeRepository employeeRepository= new EmployeeRepository();
		ArrayList<Employee>employees= new ArrayList<Employee>(1);
		employees.add(employeeFactory.getEmployee(Constants.Employees.Caretaker));
		employeeRepository.save(employees);
		
		try {
			employeeRepository.load();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		new MainMenuController(new MainMenuFrame("Main Menu"), false);	
} 
	

	public static void print(Employee[] employee) {
		for (int i = 0; i < 2; i++) {
			System.out.print(employee[i].getName() + " are id-ul " + employee[i].getId() + " si salarul "
					+ employee[i].getSalary()+ " si a muncit "+((Caretaker)employee[i]).getWorkingHours());
			if (employee[i].getIsDead() == true) {
				System.out.print("\n" + "a avut*" + "\n");
			} else {
				System.out.print(" si e sanatos si il asteptam la munca in continuare \n");
			}
		}
	}

	public static void print(Animal[] animale) {
		for (int i = 0; i < 3; i++) {
			System.out.print(
					animale[i].getName() + " are nevoie de " + animale[i].getMaintenanceCost() + " ore de ingrijire\n");
				if (animale[i].isTakenCareOf()) {
					System.out.print("a fost ingrijit");
				} else {
						System.out.print("n-a fost ingrijit");
					}
				System.out.println();
		}
	}
}
