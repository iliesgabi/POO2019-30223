package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Mammal extends Animal {
	public Mammal(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	private float normalBodyTemp;
	private float percBodyHair;

	public float getNormalBodyTemp() {
		return this.normalBodyTemp;
	}

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public float getPercBodyHair() {
		return this.percBodyHair;
	}

	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(getNormalBodyTemp()));
		createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));
	}

	public void decodeFromXml(Element element) {
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}

}
