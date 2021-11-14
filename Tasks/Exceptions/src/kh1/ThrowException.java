package kh1;
//Write a program to generate IOException
import java.io.IOException;

public class ThrowException {
	 public static void main(String[] args) {
	        try {
	            foo();
	        }
	        catch(Exception e) {
	             if (e instanceof IOException) {
	                 System.out.println("Completed!");
	             }
	          }
	    }
	    static void foo() {
	        // what should I write here to get an exception?
	    }
}
