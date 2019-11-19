package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;

public class InsectFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach(2,0.8);

		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(2,0.7);

		} else if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(3,0.1);

		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
