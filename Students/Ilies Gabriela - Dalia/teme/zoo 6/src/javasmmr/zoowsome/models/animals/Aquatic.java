package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

enum Enum {
	fresh_water, salt_water
}

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	private String waterType;

	public Aquatic(int nrOfLegs, String name, Integer avgSwimDepth, String waterType, Double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}

	public String getWaterType() {
		return waterType;
	}

	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}

	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
	}

	public void decodeFromXml(Element element) {
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(element.getElementsByTagName("isDangerous").item(0).getTextContent());
	}
}
