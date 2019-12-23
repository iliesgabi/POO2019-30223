package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
private Double workingHours;
private static BigDecimal zero = new BigDecimal(0);

	public Caretaker(String name, BigDecimal salary, Double workingHours) {
		super(name, salary);
		this.workingHours= workingHours;
	}

	public Caretaker() {
		super("", zero);
		this.workingHours = 0.0;
	}
	
	public Double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String takeCareOf(Animal animal) {
		if (animal.kill()) {
			return Constants.Employees.CaretakerStatus.TCO_KILLED;
		}
		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.CaretakerStatus.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		this.workingHours = this.workingHours - animal.getMaintenanceCost();
		return Constants.Employees.CaretakerStatus.TCO_SUCCES;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(getWorkingHours()));
	}

	public void decodeFromXml(Element element) {
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}

}
