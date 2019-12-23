package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.services.factories.Constants;

public class Lizzard extends Reptile {

	public Lizzard(int nrOfLegs, String name, Boolean laysEggs, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, laysEggs, maintenanceCost, dangerPerc);
	}

	public Lizzard() {
		super(4, "Lizi", true, 1.0, 0.3);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Lizzard);
	}
}
