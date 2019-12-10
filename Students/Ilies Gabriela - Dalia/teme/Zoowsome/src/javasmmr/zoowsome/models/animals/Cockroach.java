package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Cockroach extends Insect {
	public Cockroach(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setCanFly(false);
		this.setIsDangerous(true);
		this.setNrOfLegs(6);
		this.setName("Pleaca");
	}

	public Cockroach() {
		super(2, 0.8);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub

	}
}
