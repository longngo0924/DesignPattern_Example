package model;

import java.util.Date;

public class TeamMember extends EmployeeDecorator {

	public TeamMember(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doTask() {
		employee.doTask();
	}

	@Override
	public void join(Date joinDate) {
		employee.join(joinDate);

	}

	@Override
	public void terminate(Date terminateDate) {
		employee.terminate(terminateDate);

	}

	public void performTask() {
		System.out.println(", perform task");
	}

	public void coordinate() {
		System.out.println(", coordinate");
	}

}
