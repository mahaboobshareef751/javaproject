package ch4;

public class Person {
	 public String name;
	   public int age;
	   public Person(String name, int age){
	      this.name = name;
	      this.age = age;
	   }
	   public void displayPerson() {
	      System.out.println("Data of the Person class: ");
	      System.out.println("Name: "+this.name);
	      System.out.println("Age: "+this.age);
}
}