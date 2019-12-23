package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Employee implements XML_Parsable{
	private String name;
	private Long id;
	private BigDecimal salary;
	private Boolean isDead;
	private Long[] tineId = new Long[10];
	private int nrId = 0;

	public Employee(String name, BigDecimal salary) {
		this.name = name;
		this.id = generateId();
		this.salary = salary;
		this.isDead = false;
	}

	private Long generateId() {

		Long idGenerat = new Long(0);
		Random random = new Random();
		do {
			idGenerat=(long) 0;
			Long p = new Long(1);
			for (int i = 0; i < 13; i++) {
				int number = random.nextInt(10);
				idGenerat = idGenerat + p * number;
				p = p * 10;
			}
		} while (search(idGenerat) == true);

		tineId[this.nrId] = idGenerat;
		this.nrId++;

		return idGenerat;
	}

	private boolean search(Long id) {
		for (int i = 0; i < nrId; i++)
			if (id == tineId[i])
				return true;
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Boolean getIsDead() {
		return isDead;
	}

	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}

	public void decodeFromXml(Element element) {
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setSalary(BigDecimal.valueOf(Long.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
}
