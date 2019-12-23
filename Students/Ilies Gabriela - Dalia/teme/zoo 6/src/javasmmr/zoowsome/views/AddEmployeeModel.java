package javasmmr.zoowsome.views;

import javasmmr.zoowsome.models.employees.Employee;

public class AddEmployeeModel {
	private static Employee[] employees= new Employee[100];
	private static int nrEmployees=0;
	
	public AddEmployeeModel()
	{
		nrEmployees=0;
	}
	public void addEmpoyee(Employee employee)
	{
		employees[nrEmployees]=employee;
		nrEmployees++;
	}
	
	public static void print() {
		for(int i=0; i<nrEmployees; i++)
			System.out.print(employees[i].getName()+" ");
	}
	
	public static Employee[] getEmployee() {
		return employees;
	}
}
