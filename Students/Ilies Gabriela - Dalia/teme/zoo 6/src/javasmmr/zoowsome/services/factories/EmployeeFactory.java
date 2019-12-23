package javasmmr.zoowsome.services.factories;

public class EmployeeFactory {
	public EmployeeAbstractFactory getEmployeeFactory(String type) throws Exception {
		if (Constants.Employees.Caretaker.equals(type)) {
			return new CaretakerFactory();
		} else {
			throw new Exception("False");
		}
	}
}
