package access_modifiers;

public class ClassA {
	  public String clazzName;

	    public ClassA() {

	    }

	    public ClassA(String clazzName) {
	        this.clazzName = clazzName;
	    }

	    public String getName() {

	        System.out.println(clazzName); // public field can be used anywhere
	        InnerClass innerClass = new InnerClass(); //public Inner Class can be used anywhere.
	        return this.clazzName;
	    }

	    public class InnerClass {

	    }

}
