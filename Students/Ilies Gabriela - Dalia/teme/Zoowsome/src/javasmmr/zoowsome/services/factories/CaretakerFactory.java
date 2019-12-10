package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.Caretaker;

public class CaretakerFactory extends EmployeeFactory {
	public Caretaker getEmployee(String type) {
		if (Constants.TypesOfEmployee.Caretaker.equals(type)) {
			BigDecimal zero = new BigDecimal(0);
			return new Caretaker("unknown", zero, false);
		} else {
			return null;
		}
	}
}
