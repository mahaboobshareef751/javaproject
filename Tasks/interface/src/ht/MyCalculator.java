package ht;

public class MyCalculator implements Calculator {
	 // Implementing the addition
    // method
    public void add(double x, double y)
    {
        double result = x + y;
        printResult(result);
    }
  
    // Implementing the subtraction
    // method
    public void subtract(double x, double y)
    {
        double result = x - y;
        printResult(result);
    }
  
    // Implementing the multiplication
    // method
    public void multiply(double x, double y)
    {
        double result = x * y;
        printResult(result);
    }
  
    // Implementing the division
    // method
    public void divide(double x, double y)
    {
        double result = x / y;
        printResult(result);
    }
  
    // Implementing a method
    // to print the result
    public void printResult(double result)
    {
        System.out.println(
            "The result is : " + result);
    }
  
    // Driver code
    public static void main(String args[])
    {
  
        // Creating the object of
        // the calculator
        MyCalculator c = new MyCalculator();
        c.add(5, 10);
        c.subtract(35, 15);
        c.multiply(6, 9);
        c.divide(45, 6);
    }
}
