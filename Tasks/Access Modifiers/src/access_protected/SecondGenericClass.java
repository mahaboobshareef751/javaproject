package access_protected;

import protect_access.FirstClass;

public class SecondGenericClass {
	 public static void main(String[] args) {
	        FirstClass first = new FirstClass("random name");
	        System.out.println("FirstClass name is "+ first.getName());
	        first.name = "new name";
	    }

}
