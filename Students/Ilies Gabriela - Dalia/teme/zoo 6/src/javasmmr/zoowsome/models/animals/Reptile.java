package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

public abstract class Reptile extends Animal{
	private Boolean laysEggs;

	public Reptile(int nrOfLegs, String name, Boolean laysEggs, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.laysEggs=laysEggs;
	}
	
	public Boolean getLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(Boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "layEggs", String.valueOf(getLaysEggs()));
	}

	public void decodeFromXml(Element element) {
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("layEggs").item(0).getTextContent()));
	}
}
