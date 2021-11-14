package khan;

public class CallInterfaceMethod {
	public static void main(String args[]){
        InterfaceDemo demo = new InterfaceDemoImpl();
        demo.displayName("shareef");
        demo.displayNameAndDesignation("shareef", "Java Developer");
        demo.displayNameDefault("shareef");
     }
}
