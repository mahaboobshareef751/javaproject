package org.websparrow.access;//Access Private Fields

import java.lang.reflect.Field;
public class Hr {
	public static void main(String[] args) {
		try {

			Class<Employee> cls = (Class<Employee>) Class.forName("org.websparrow.access.Employee");

			Employee emp = new Employee();
			
			// declare the name of private field of Employee class
			Field field = cls.getDeclaredField("empSalary");
			
			// make it accessible 
			field.setAccessible(true);

			int salary = (int) field.get(emp);

			System.out.println("Employee name is " + emp.empName + " and his salary is " + salary + " rupees per month.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
