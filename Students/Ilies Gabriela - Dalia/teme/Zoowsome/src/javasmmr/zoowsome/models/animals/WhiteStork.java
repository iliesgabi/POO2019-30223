package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class WhiteStork extends Bird {
	public WhiteStork(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setAvgFlightAltitude(4800);
		this.setMigrates(true);
		this.setName("Ciconia");
		this.setNrOfLegs(2);
	}

	public WhiteStork() {
		super(2, 0.1);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.WhiteStork);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub

	}

}
