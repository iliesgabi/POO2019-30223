package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Employee {
	private String name;
	private Long id;
	private BigDecimal salary;
	private Boolean isDead;

	public Employee(String name, BigDecimal salary, Boolean isDead) {
		this.name = name;
		this.salary = salary;
		this.isDead = isDead;
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

	public void setId() {
		String nr=new String("");
		for (int i = 0; i < 13; i++) {
			Random random = new Random();
			Integer aux=random.nextInt(10);
			nr=nr+ aux.toString();
		}
		this.id=Long.parseLong(nr);
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

}
