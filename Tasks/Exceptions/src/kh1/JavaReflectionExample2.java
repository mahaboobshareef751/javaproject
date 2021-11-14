package kh1;
//Write a program to generate NoSuchMethodException


import java.lang.reflect.Method;
public class JavaReflectionExample2 {
	 public JavaReflectionExample2()
	  {
	    Class c;
	    try
	    {
	      c = Class.forName("java.lang.String");
	      try
	      {
	        Class[] paramTypes = new Class[5];
	        Method m = c.getDeclaredMethod("fooMethod", paramTypes);
	      }
	      catch (SecurityException e)
	      {
	        e.printStackTrace();
	      }
	      catch (NoSuchMethodException e)
	      {
	        e.printStackTrace();
	      }
	    }
	    catch (ClassNotFoundException e)
	    {
	      // deal with the exception here ...
	      e.printStackTrace();
	    }
	  }

	  public static void main(String[] args)
	  {
	    new JavaReflectionExample2();
	  }

}
