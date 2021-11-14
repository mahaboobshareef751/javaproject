public class A  //Call instance methods in static method
{
	void method()
    {
    }
}
class Demo
{
    static void method2()
    {
        A a=new A();

        a.method();
    }
    /*
    void method3()
    {
        A a=new A();
        a.method();
    }
    */

    public static void main(String args[])
    {
        A a=new A();
        /*an instance of the class is created to access non-static method from a static method */
        a.method();

        method2();

        /*method3();it will show error non-static method can not be  accessed from a static method*/
    }

}
