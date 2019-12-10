package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Dolphin extends Aquatic {
	public Dolphin(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setAvgSwimDepth(40);
		this.setName("Florin");
		this.setNrOfLegs(0);
		this.setWaterType(Enum.salt_water);
	}

	public Dolphin() {
		super(4, 0.1);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Dolphin);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub

	}

}
