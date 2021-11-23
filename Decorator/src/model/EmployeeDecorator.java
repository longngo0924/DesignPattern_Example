package model;

public abstract class EmployeeDecorator implements Employee {
	protected Employee employee;

	public EmployeeDecorator(Employee employee) {
		super();
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
