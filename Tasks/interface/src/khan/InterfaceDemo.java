package khan;

public interface InterfaceDemo {
	default public void displayNameDefault(String name){
	       System.out.println("Your name is : " + name);
	   }
	    public void displayName(String name);
	    public void displayNameAndDesignation(String name, String designation);
	}

