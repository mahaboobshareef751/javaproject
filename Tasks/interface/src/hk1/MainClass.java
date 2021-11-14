// Java program to illustrate the behavior of the program
// when two interfaces having the same methods and different return-type
// and we defined the method in the child class


package hk1;

public class MainClass implements InterfaceA, InterfaceB
 {
	public
    String getStuff()
    {
        return "one";
    }
}

//error: MainClass is not abstract and does not override abstract method fun() in InterfaceA