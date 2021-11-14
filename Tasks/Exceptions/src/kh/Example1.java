package kh;
//Explanation: In the above example I’ve divided an integer by a zero and 
//because of this ArithmeticException is thrown.
public class Example1 {
	 public static void main(String args[])
	   {
	      try{
	         int num1=30, num2=0;
	         int output=num1/num2;
	         System.out.println ("Result: "+output);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("You Shouldn't divide a number by zero");
	      }
	   }
}