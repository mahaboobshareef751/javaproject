public class Geek //Call instance methods in static method
  {

	public static String geekName = "";
	 
    public static void geek(String name)
    {
        geekName = name;
    }
}
 
class GFG {
    public static void main(String[] args)
    {
 
        // Accessing the static method geek()
        // and field by class name itself.
        Geek.geek("vaibhav");
        System.out.println(Geek.geekName);
 
        // Accessing the static method geek()
        // by using Object's reference.
        Geek obj = new Geek();
        obj.geek("mohit");
        System.out.println(obj.geekName);
    }	
	
	
}
