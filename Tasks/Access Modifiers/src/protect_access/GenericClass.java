package protect_access;

public class GenericClass {
	 public static void main(String[] args) {
	        FirstClass first = new FirstClass("random name");
	        System.out.println("FirstClass name is " + first.getName());
	        first.name = "new name";
	    }

}
