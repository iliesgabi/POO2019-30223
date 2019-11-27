package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Duck extends Bird {
	public Duck(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setAvgFlightAltitude(5);
		this.setMigrates(true);
		this.setName("Gratiela");
		this.setNrOfLegs(2);
	}

	public Duck() {
		super(1, 0.2);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Duck);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub

	}

}
