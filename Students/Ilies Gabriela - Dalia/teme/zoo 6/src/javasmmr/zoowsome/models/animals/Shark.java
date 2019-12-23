package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.services.factories.Constants;

public class Shark extends Aquatic{

	public Shark(int nrOfLegs, String name, Integer avgSwimDepth, String waterType, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, waterType, maintenanceCost, dangerPerc);
	}

	public Shark() {
		super(0,"Fugi",100,"salt_water", 2.0, 1.0);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}
}
