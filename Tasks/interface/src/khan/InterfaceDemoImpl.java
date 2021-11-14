package khan;

public class InterfaceDemoImpl implements InterfaceDemo {
	public void displayName(String name) {
        System.out.println(name);
   }  
     public void displayNameAndDesignation(String name, String designation) {
          System.out.println("Name:" + name + "\n"+ "Designation:" + designation);
    }
}
