package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Lizzard;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Turtle;

public class ReptileFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Lizzard.equals(type)) {
			return new Lizzard();

		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();

		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle();

		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
