package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insect{

	public Spider(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, canFly, isDangerous, maintenanceCost, dangerPerc);
	}
	
	public Spider() {
		super(8,"Vasile",false,true, 2.0, 0.7);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Spider);
	}
}
