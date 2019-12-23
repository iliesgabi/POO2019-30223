package javasmmr.zoowsome.views;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;

public class AddAnimalModel {
	private static Animal[] animals = new Animal[100];
	private static int nrAnimals = 0;

	public AddAnimalModel() {
		nrAnimals = 0;
	}

	public static Animal[] getAnimals() {
		return animals;
	}

	public static void addAnimal(Animal animal) {
		animals[nrAnimals] = animal;
		nrAnimals++;
	}

	public static void print() {
		for (int i = 0; i < nrAnimals; i++)
			if (animals[i] instanceof Mammal) {
				System.out.println(animals[i].getName() + " are " + animals[i].getNrOfLegs()
						+ " picioare si temperatura normala a corpului este "
						+ ((Mammal) animals[i]).getNormalBodyTemp() + " si " + ((Mammal) animals[i]).getPercBodyHair()
						+ "% din corp este acoperit cu par si pentru a-l ingriji" + " este nevoie de "
						+ animals[i].getMaintenanceCost()
						+ " ore de ingrijire, iar probabilitatea ca animalul sa raneasca ingrijitorul este de "
						+ animals[i].getDangerPerc());
			} else if (animals[i] instanceof Reptile) {
				if (((Reptile) animals[i]).getLaysEggs() == true) {
					System.out.println(animals[i].getName() + " depune oua si are " + animals[i].getNrOfLegs()
							+ " picioare si pentru a-l ingriji este nevoie de " + +animals[i].getMaintenanceCost()
							+ " ore de ingrijire, iar probabilitatea ca animalul sa raneasca ingrijitorul este de "
							+ animals[i].getDangerPerc());
				} else {
					System.out.println(animals[i].getName() + " nu depune oua si are " + animals[i].getNrOfLegs()
							+ " picioare si pentru a-l ingriji este nevoie de " + +animals[i].getMaintenanceCost()
							+ " ore de ingrijire, iar probabilitatea ca animalul sa raneasca ingrijitorul este de "
							+ animals[i].getDangerPerc());
				}
			} else if (animals[i] instanceof Insect) {
				if (((Insect) animals[i]).getIsDangerous() == true) {
					if (((Insect) animals[i]).getCanFly() == true)
						System.out.println(animals[i].getName() + " este periculos si poate zbura si are "
								+ animals[i].getNrOfLegs() + " picioare si pentru a-l ingriji este nevoie de "
								+ +animals[i].getMaintenanceCost()
								+ " ore de ingrijire, iar probabilitatea ca animalul sa raneasca ingrijitorul este de "
								+ animals[i].getDangerPerc());
					else
						System.out.println(animals[i].getName() + " este periculos si nu poate zbura si are "
								+ animals[i].getNrOfLegs() + " picioare si pentru a-l ingriji este nevoie de "
								+ +animals[i].getMaintenanceCost()
								+ " ore de ingrijire, iar probabilitatea ca animalul sa raneasca ingrijitorul este de "
								+ animals[i].getDangerPerc());
				} else {
					if (((Insect) animals[i]).getCanFly() == true)
						System.out.println(animals[i].getName() + " nu este periculos si poate zbura si are "
								+ animals[i].getNrOfLegs() + " picioare si pentru a-l ingriji este nevoie de "
								+ +animals[i].getMaintenanceCost()
								+ " ore de ingrijire, iar probabilitatea ca animalul sa raneasca ingrijitorul este de "
								+ animals[i].getDangerPerc());
					else
						System.out.println(animals[i].getName() + " nu este periculos si nu poate zbura si are "
								+ animals[i].getNrOfLegs() + " picioare si pentru a-l ingriji este nevoie de "
								+ +animals[i].getMaintenanceCost()
								+ " ore de ingrijire, iar probabilitatea ca animalul sa raneasca ingrijitorul este de "
								+ animals[i].getDangerPerc());
				}
			} else if (animals[i] instanceof Aquatic) {
				System.out.println(animals[i].getName() + " are " + animals[i].getNrOfLegs() + " picioare si traieste in "
						+ ((Aquatic) animals[i]).getWaterType() + "si poate inota pana la adancimea de "
						+ ((Aquatic) animals[i]).getAvgSwimDepth() + " metri si pentru a-l ingriji este nevoie de "
						+ +animals[i].getMaintenanceCost()
						+ " ore de ingrijire, iar probabilitatea ca animalul sa raneasca ingrijitorul este de "
						+ animals[i].getDangerPerc());
			} else if (animals[i] instanceof Bird) {
				if (((Bird) animals[i]).getMigrates() == true)
					System.out.println(animals[i].getName() + " migreaza si are " + animals[i].getNrOfLegs()
							+ " picioare si poate zbura pana la inaltimea de "
							+ ((Bird) animals[i]).getAvgFlightAltitude()
							+ " metri si pentru a-l ingriji este nevoie de " + +animals[i].getMaintenanceCost()
							+ " ore de ingrijire, iar probabilitatea ca animalul sa raneasca ingrijitorul este de "
							+ animals[i].getDangerPerc());
				else
					System.out.println(animals[i].getName() + " nu migreaza si are " + animals[i].getNrOfLegs()
							+ " picioare si poate zbura pana la inaltimea de "
							+ ((Bird) animals[i]).getAvgFlightAltitude()
							+ " metri si pentru a-l ingriji este nevoie de " + +animals[i].getMaintenanceCost()
							+ " ore de ingrijire, iar probabilitatea ca animalul sa raneasca ingrijitorul este de "
							+ animals[i].getDangerPerc());
			}
	}
}
