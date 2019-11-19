package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Lizzard;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Turtle;

public class ReptileFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Lizzard.equals(type)) {
			return new Lizzard(1,0.3);

		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake(2,0.8);

		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle(3,0.1);

		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
