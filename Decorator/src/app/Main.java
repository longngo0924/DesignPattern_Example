package app;

import model.Employee;
import model.EmployeeConcrete;
import model.TeamMember;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new EmployeeConcrete();
		TeamMember teamMember = new TeamMember(employee);
		teamMember.coordinate();
	}

}
