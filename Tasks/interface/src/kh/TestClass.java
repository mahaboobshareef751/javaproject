package kh;
//Implementation class code
public class TestClass implements TestInterface1, TestInterface2 {
	 // Overriding default show method
    public void show()
    {
        // use super keyword to call the show
        // method of TestInterface1 interface
        TestInterface1.super.show();
  
        // use super keyword to call the show
        // method of TestInterface2 interface
        TestInterface2.super.show();
    }
  
    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.show();
    }
}
