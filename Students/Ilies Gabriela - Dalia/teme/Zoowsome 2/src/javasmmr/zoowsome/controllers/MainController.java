package javasmmr.zoowsome.controllers;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cat;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.services.factories.Constants;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Birds.Duck);

		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());

		Animal[] animale = new Animal[2];
		animale[0] = speciesFactory1.getAnimal(Constants.Animals.Birds.Duck);
		animale[1] = speciesFactory1.getAnimal(Constants.Animals.Birds.WhiteStork);

		BigDecimal salar1 = new BigDecimal(2500);
		BigDecimal salar2 = new BigDecimal(3000);

		Employee[] employee = new Caretaker[2];

		employee[0] = new Caretaker("Vlad", salar1, false);
		employee[0].setId();
		((Caretaker) employee[0]).setWorkingHours(8.0);

		employee[1] = new Caretaker("Iulia", salar2, false);
		employee[1].setId();
		while (employee[1].getId() == employee[0].getId()) {
			employee[1].setId();
		}
		((Caretaker) employee[1]).setWorkingHours(9.0);

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++) {
				if (employee[i].getIsDead() == false && animale[j].isTakenCareOf() == false) {
					String result = ((Caretaker) employee[i]).takeCareOf(animale[j]);
					if (result.equals(Constants.Employee.Caretaker.TCO_KILLED)) {
						employee[i].setIsDead(true);
					} else if (result.equals(Constants.Employee.Caretaker.TCO_NO_TIME)) {
						break;
					} else {
						animale[j].setTakenCareOf(true);
					}
				}
			}

		print(employee);
		print(animale, employee);
	}

	public static void print(Employee[] employee) {
		for (int i = 0; i < 2; i++) {
			System.out.print(employee[i].getName() + " are id-ul " + employee[i].getId() + " si salarul "
					+ employee[i].getSalary());
			if (employee[i].getIsDead() == true) {
				System.out.print("\n" + "a avut*" + "\n");
			} else {
				System.out.print(" si e sanatos si il asteptam la munca in continuare \n");
			}
		}
	}

	public static void print(Animal[] animale, Employee[] employee) {
		for (int i = 0; i < 2; i++) {
			System.out.print(animale[i].getName() + " are nevoie de " + animale[i].getMaintenanceCost()
					+ " ore de ingrijire\n");
			for (int j = 0; j < 2; j++) {
				if (((Caretaker) employee[j]).takeCareOf(animale[i]).equals("SUCCES")) {
					System.out.print(employee[j].getName() + " a avut grija de el");
				} else {
					if (((Caretaker) employee[j]).takeCareOf(animale[i]).equals("KILLED")) {
						System.out.print("a omorat mana ce il ingrijeste " + employee[j].getName());
					}

					else {
						System.out.print("n-a fost ingrijit de " + employee[j].getName());
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
