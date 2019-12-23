package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;

public abstract class Bird extends Animal {
	private Boolean migrates;
	private Integer avgFlightAltitude;

	public Bird(int nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public Boolean getMigrates() {
		return migrates;
	}

	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}

	public Integer getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
	}

	public void decodeFromXml(Element element) {
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(
				Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}
