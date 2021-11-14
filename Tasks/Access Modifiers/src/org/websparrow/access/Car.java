package org.websparrow.access;

import java.lang.reflect.Constructor;

public class Car {
	public static void main(String[] args) {
		try {

			Class<?> cls = Class.forName("org.websparrow.access.Honda");

			Constructor<?>[] cons = cls.getDeclaredConstructors();
			cons[0].setAccessible(true);
			cons[0].newInstance();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
