package kh1;
//Write a program to generate ClassNotFoundException
public class Check {
	//main method is called
	public static void main(String args[])
	{
	//class not found exception is defined using try catch block
	try
	{
	//the forname method in class class looks for the mentioned class
	Class.forName("Demonstrating class not found exception");
	}
	catch(ClassNotFoundException e)
	{
	//the string specified along with the class not found exception is displayed.
	System.out.println("There is no class as specified in the path " + e);
	}
	}
}
