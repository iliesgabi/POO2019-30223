package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.services.factories.Constants;

public class WhiteStork extends Bird {

	public WhiteStork(int nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
	}

	public WhiteStork() {
		super(2, "Ciconia", true, 4800, 2.0, 0.1);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.WhiteStork);
	}
}
