package kh;

public class ArithmeticException {
	void division(int a,int b)
	{
	int c=a/b;
	System.out.println("Division has been successfully done");
	System.out.println("Value after division: "+c);
	}
	public static void main(String[] args)
	{
	ArithmeticException ex=new ArithmeticException();
	ex.division(10,0);
	}
}
//lang.ArithmeticException: Exception thrown by java language during division
// by zero: It is the detailed message given to the class ArithmeticException while generating the ArithmeticException instance.
//As we have divided 10 by 0, where 0 is an integer and is undefined, it throws above arithmetic exception.