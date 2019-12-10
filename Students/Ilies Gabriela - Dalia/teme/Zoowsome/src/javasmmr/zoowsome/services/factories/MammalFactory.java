package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cat;
import javasmmr.zoowsome.models.animals.Dog;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Dog.equals(type)) {
			return new Dog();

		} else if (Constants.Animals.Mammals.Cat.equals(type)) {
			return new Cat();

		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger();

		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
