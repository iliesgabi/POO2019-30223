package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeAbstractFactory{
	public Employee getEmployee(String type) {
		if (Constants.Employees.Caretaker.equals(type)) {
			BigDecimal salar= new BigDecimal(2500);
			return new Caretaker("Maria",salar,7.0);
		} else {
			return null;
		}
	}
}
