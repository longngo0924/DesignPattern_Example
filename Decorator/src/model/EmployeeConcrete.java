package model;

import java.util.Date;

public class EmployeeConcrete implements Employee {

	@Override
	public void doTask() {
		System.out.println("Doing task...");
		
	}

	@Override
	public void join(Date joinDate) {
		System.out.println("Joining...");
		
	}

	@Override
	public void terminate(Date terminateDate) {
		System.out.println("Terminated");
		
	}

}
