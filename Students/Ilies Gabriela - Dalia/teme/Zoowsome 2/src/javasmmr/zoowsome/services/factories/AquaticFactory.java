package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Shark;

public class AquaticFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(2,1);

		} else if (Constants.Animals.Aquatics.Octopus.equals(type)) {
			return new Octopus(5,0.5);

		} else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin(4,0.1);

		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
