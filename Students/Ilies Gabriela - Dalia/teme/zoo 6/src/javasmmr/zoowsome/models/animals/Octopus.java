package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.services.factories.Constants;

public class Octopus extends Aquatic{

	public Octopus(int nrOfLegs, String name, Integer avgSwimDepth, String waterType, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, waterType, maintenanceCost, dangerPerc);
	}

	public Octopus() {
		super(10,"Octo",10,"salt_water", 5.0, 0.5);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Octopus);
	}
}
