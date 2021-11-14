package org.websparrow.access;  
public class NewEmployee {
	public String id;
	public String name;
	public String organization;
	public String department;
	public String location;
	public int salary;

	public NewEmployee(String id, String name, String organization, String department, String location, int salary) {
		this.id = id;
		this.name = name;
		this.organization = organization;
		this.department = department;
		this.location = location;
		this.salary = salary;
	}

	// method declared as private
	private void employeeDetails() {
		System.out.println("Employee id is " + this.id + " and  name of employee is " + this.name
				+ ". He is working with " + this.organization + " under department " + this.department + " and earning "
				+ this.salary + " rupees per month.");
	}
}
