package ch1;

public class Child extends Parent {
	 Child() {
		    //by default the default constructor of Parent class is invoked
		    System.out.println("Child class default constructor");
		  }
		  Child(int x) {
		    super(); // default constructor of Parent class is invoked
		    System.out.println("Child class one-argument constructor");
		  }
}
