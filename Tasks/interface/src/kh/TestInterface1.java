// A simple Java program to demonstrate multiple
// inheritance through default methods.
package kh;

public interface TestInterface1 {
	 // default method
    default void show()
    {
        System.out.println("Default TestInterface1");
    }
}
