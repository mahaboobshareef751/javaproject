package strings;

public class StringComapre {
	public static void main(String[] args) {
	    String str = "Compare this String";

	    // returns true
	    System.out.println("str.startsWith(\"Compare\"): " + str.startsWith("Compare"));
	    // returns false
	    System.out.println("str.startsWith(\"Comparison\"): " + str.startsWith("Comparison"));
	    // returns true- Comparison starts from index 8
	    System.out.println("str.startsWith(\"this\"): " + str.startsWith("this", 8));
	    
	    // returns true
	    System.out.println("str.endsWith(\"String\"): " + str.endsWith("String"));
	    // returns false
	    System.out.println("str.endsWith(\"Sting\"): " + str.endsWith("Sting"));
	  }
}
