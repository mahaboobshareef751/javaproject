package ch;
//Call constructor of the current class using this()
public class Car {
 String model,clr;
 int price;
 /* custom constructor*/
 Car(){
	 this.model="BMW";
	 this.clr="blue";
	 this.price=56748;
 }
 public static void main(String[] args) {
	Car c=new Car();
	System.out.println(c.model+"  "+c.clr+" "+c.price);
}
}
