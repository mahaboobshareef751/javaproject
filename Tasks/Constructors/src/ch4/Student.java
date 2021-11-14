package ch4;

public class Student extends Person {
	 public String branch;
	   public int Student_id;
	   public Student(String name, int age, String branch, int Student_id){
	      super(name, age);
	      this.branch = branch;
	      this.Student_id = Student_id;
	   }
	   public void displayStudent() {
	      System.out.println("Data of the Student class: ");
	      System.out.println("Name: "+this.name);
	      System.out.println("Age: "+this.age);
	      System.out.println("Branch: "+this.branch);
	      System.out.println("Student ID: "+this.Student_id);
	   }
	   public static void main(String[] args) throws CloneNotSupportedException {
	      Person person = new Student("M shareef", 23, "IT", 1256);
	      person.displayPerson();
	   }
}
