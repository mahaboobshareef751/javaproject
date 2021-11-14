// Java program to illustrate
// protected modifier
  
package khan;
//import all classes in package p1
import shareef.*;

//ClassC is a subclass of  classB
public class classC extends classB {
	public static void main(String args[])
    {
        classB hk = new classB();
        hk.display();
    }

}

/*This will throw an error of:

Exception in thread "main" 
java.lang.RuntimeException: 
Uncompilable source code - 
Erroneous sym type: khan.classB.display
    at khan.classB.main(B.java:16)
    */