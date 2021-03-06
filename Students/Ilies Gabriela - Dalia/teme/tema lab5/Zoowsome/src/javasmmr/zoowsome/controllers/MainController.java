package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Birds.Duck);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
	}
}
