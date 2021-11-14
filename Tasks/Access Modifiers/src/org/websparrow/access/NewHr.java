package org.websparrow.access; //Access Private Methods

import java.lang.reflect.Method;

public class NewHr {
	public static void main(String[] args) {
		try {

			Class<NewEmployee> cls = (Class<NewEmployee>) Class.forName("org.websparrow.access.NewEmployee");

			NewEmployee emp = new NewEmployee("EMP01", "M.shareef", "Google Inc.", "Software Development", "Kurnool", 180000);

			// declare the private method
			Method method = cls.getDeclaredMethod("employeeDetails");

			// set it accessible
			method.setAccessible(true);

			// invoke the method
			method.invoke(emp);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
