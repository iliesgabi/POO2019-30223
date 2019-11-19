package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Duck;
import javasmmr.zoowsome.models.animals.Vulture;
import javasmmr.zoowsome.models.animals.WhiteStork;

public class BirdFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Duck.equals(type)) {
			return new Duck(1,0.2);

		} else if (Constants.Animals.Birds.Vulture.equals(type)) {
			return new Vulture(4,0.5);

		} else if (Constants.Animals.Birds.WhiteStork.equals(type)) {
			return new WhiteStork(2,0.1);

		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
