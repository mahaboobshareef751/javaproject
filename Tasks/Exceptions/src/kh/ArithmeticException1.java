package kh;

public class ArithmeticException1 {
	void division(int a,int b)
	{
	int c=a/b;
	System.out.println("Division of a number is successful");
	System.out.println("Output of division: "+c);
	}
	public static void main(String[] args)
	{
	ArithmeticException ex=new ArithmeticException();
	ex.division(10,5);
	}
}
