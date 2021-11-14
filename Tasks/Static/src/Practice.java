public class Practice   //Print all the static, instance variables in main metho
 {
      static int staticVariable=30;
      int instanceVariable=20;
      void somemethod() {
    	  int localVariable=10;
      }
	
	public static void main(String[] args) {
		Practice obj1=new Practice();
		System.out.println(obj1.instanceVariable);
	}

}
