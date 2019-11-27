package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Reptile extends Animal {
	public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	private boolean laysEggs;

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

	public boolean getLaysEggs() {
		return this.laysEggs;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "layEggs", String.valueOf(getLaysEggs()));
	}

	public void decodeFromXml(Element element) {
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("layEggs").item(0).getTextContent()));
	}

}
