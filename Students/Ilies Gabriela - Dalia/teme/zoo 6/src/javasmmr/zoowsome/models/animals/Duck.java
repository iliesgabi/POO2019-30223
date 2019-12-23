package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.services.factories.Constants;

public class Duck extends Bird {

	public Duck(int nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
	}

	public Duck() {
		super(2, "Gratiela", true, 5, 1.0, 0.2);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Duck);
	}
}
