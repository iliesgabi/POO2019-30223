package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cockroach extends Insect {

	public Cockroach(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, canFly, isDangerous, maintenanceCost, dangerPerc);
	}

	public Cockroach() {
		super(6, "Pleaca", false, true, 2.0, 0.8);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
	}
}
