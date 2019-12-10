package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Shark extends Aquatic {
	public Shark(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setAvgSwimDepth(100);
		this.setName("Fugi");
		this.setNrOfLegs(0);
		this.setWaterType(Enum.salt_water);
	}

	public Shark() {
		super(2, 1);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub

	}
}
