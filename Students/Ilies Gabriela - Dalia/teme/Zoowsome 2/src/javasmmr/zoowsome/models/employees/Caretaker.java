package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
private Double workingHours;

	public Caretaker(String name, BigDecimal salary, Boolean isDead) {
		super(name, salary, isDead);
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
			return Constants.Employee.Caretaker.TCO_KILLED;
		}
		if(this.workingHours<animal.getMaintenanceCost()) {
			return Constants.Employee.Caretaker.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		this.workingHours=this.workingHours-animal.getMaintenanceCost();
		return Constants.Employee.Caretaker.TCO_SUCCES;
	}
	
	

	
}
