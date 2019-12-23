package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

public class Butterfly extends Insect {
	public Butterfly(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, canFly, isDangerous, maintenanceCost, dangerPerc);
	}

	public Butterfly() {
		super(6, "Griffin", true, false, 3.0, 0.1);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Butterfly);
	}
}
