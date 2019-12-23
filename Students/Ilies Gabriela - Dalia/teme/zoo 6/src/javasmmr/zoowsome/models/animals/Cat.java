package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Cat extends Mammal {

	public Cat(int nrOfLegs, String name, double normalBodyTemp, double percBodyHair, Double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
	}

	public Cat() {
		super(4, "Garfield", 35, 90, 1.0, 0.1);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Cat);
	}
}
