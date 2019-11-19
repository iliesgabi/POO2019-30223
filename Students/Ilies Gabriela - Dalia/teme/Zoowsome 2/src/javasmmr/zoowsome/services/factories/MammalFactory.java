package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cat;
import javasmmr.zoowsome.models.animals.Dog;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Dog.equals(type)) {
			return new Dog(8,0.1);

		} else if (Constants.Animals.Mammals.Cat.equals(type)) {
			return new Cat(1,0.1);

		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(3,0.8);

		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
