package javasmmr.zoowsome.repositories;

import org.w3c.dom.Element;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cat;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Dog;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Duck;
import javasmmr.zoowsome.models.animals.Lizzard;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.models.animals.Vulture;
import javasmmr.zoowsome.models.animals.WhiteStork;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal>{
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}
	protected Animal getEntityFromXmlElement(Element element) {
		
		String discriminant= element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;
		case Constants.Animals.Insects.Cockroach:
			Animal bee = new Cockroach();
			bee.decodeFromXml(element);
			return bee;
		case Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animals.Aquatics.Dolphin:
			Animal dolphin = new Dolphin();
			dolphin.decodeFromXml(element);
			return dolphin;
		case Constants.Animals.Aquatics.Octopus:
			Animal octopus = new Octopus();
			octopus.decodeFromXml(element);
			return octopus;
		case Constants.Animals.Aquatics.Shark:
			Animal shark = new Shark();
			shark.decodeFromXml(element);
			return shark;
		case Constants.Animals.Birds.Duck:
			Animal duck = new Duck();
			duck.decodeFromXml(element);
			return duck;
		case Constants.Animals.Birds.Vulture:
			Animal vulture = new Vulture();
			vulture.decodeFromXml(element);
			return vulture;
		case Constants.Animals.Birds.WhiteStork:
			Animal whiteStork = new WhiteStork();
			whiteStork.decodeFromXml(element);
			return whiteStork;
		case Constants.Animals.Reptiles.Lizzard:
			Animal lizzard = new Lizzard();
			lizzard.decodeFromXml(element);
			return lizzard;
		case Constants.Animals.Reptiles.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
		case Constants.Animals.Reptiles.Turtle:
			Animal turtle = new Turtle();
			turtle.decodeFromXml(element);
			return turtle;
		case Constants.Animals.Mammals.Cat:
			Animal cat = new Cat();
			cat.decodeFromXml(element);
			return cat;
		case Constants.Animals.Mammals.Dog:
			Animal dog = new Dog();
			dog.decodeFromXml(element);
			return dog;
		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;
		default:
			break;
		}
		return null;
	}

}