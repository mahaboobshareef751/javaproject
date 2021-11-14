package kh1;
//Write a program to generate StringIndexOutOfBoundsException

public class StringIndexOutOfBounds {
	  public static void main(String[] args) {

	        String str = "Hello World";
	        try {
	            char charAtNegativeIndex = str.charAt(-1); // Trying to access at negative index
	            char charAtLengthIndex = str.charAt(11); // Trying to access at index equal to size of the string
	        } catch (StringIndexOutOfBoundsException e) {
	            System.err.println("StringIndexOutOfBoundsException caught");
	            e.printStackTrace();
	        }
	    }
}
