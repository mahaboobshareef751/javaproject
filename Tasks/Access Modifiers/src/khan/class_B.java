package khan;
// Java program to illustrate
//protected modifier


//import all classes in package p1
import shareef.class_A;

public class class_B extends class_A {
	public static void main(String args[])
    {
        class_B kh = new class_B();
        kh.display();
    }
}
/*This will throw an error of:

Exception in thread "main" 
java.lang.RuntimeException: 
Uncompilable source code - 
Erroneous sym type: khan.classB.display
    at khan.classB.main(B.java:16)
    */