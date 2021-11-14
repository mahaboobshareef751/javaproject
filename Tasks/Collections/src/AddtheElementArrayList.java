/*Java ArrayList add() Method Example*/

import java.util.ArrayList;
public class AddtheElementArrayList {
	public static void main(String[] args) {

        //ArrayList<String> Declaration
        ArrayList<String> al= new ArrayList<String>();
        //add method for String ArrayList
        al.add("shareef");
        al.add("vali");
        al.add("asif");
        al.add("Husaain");
        al.add("shabbir");
        System.out.println("Elements of ArrayList of String Type: "+al);

        //ArrayList<Integer> Declaration 
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        //add method for integer ArrayList
        al2.add(1);
        al2.add(34);
        al2.add(99);
        al2.add(99);
        al2.add(78);
        System.out.println("Elements of ArrayList of Integer Type: "+al2);
    

/*Java ArrayList add(int index, E element) example*/
// ArrayList of String type
ArrayList<String> al21 = new ArrayList<String>();
// simple add() methods for adding elements at the end
al21.add("Hi");
al21.add("hello");
al21.add("String");
al21.add("Test");
//adding element to the 4th position
//4th position = 3 index as index starts with 0
al21.add(3,"Howdy");

System.out.println("Elements after adding string Howdy:"+ al21);
//adding string to 1st position
al21.add(0, "Bye");

//Print
System.out.println("Elements after adding string bye:"+ al21);



/*Java ArrayList remove(int index) Method example*/
//String ArrayList
ArrayList<String> al22 = new ArrayList<String>();
al22.add("AB");
al22.add("CD");
al22.add("EF");
al22.add("GH");
al22.add("AB");
al22.add("YZ");
System.out.println("ArrayList before remove:");
for(String var: al22){
     System.out.println(var);
}
//Removing 1st element
al22.remove(0);
//Removing 3rd element from the remaining list
al22.remove(2);
//Removing 4th element from the remaining list
al22.remove(2);
System.out.println("ArrayList After remove:");
for(String var2: al22){
      System.out.println(var2);
      /*Java ArrayList remove(Object obj) Method example*/
    //String ArrayList
      ArrayList<String> al1 = new ArrayList<String>();
      al1.add("AA");
      al1.add("BB");
      al1.add("CC");
      al1.add("DD");
      al1.add("EE");
      al1.add("FF");
      System.out.println("ArrayList before remove:");
      for(String var: al1){
          System.out.println(var);
      }
      //Removing element AA from the arraylist
      al1.remove("AA");
      //Removing element FF from the arraylist
      al1.remove("FF");
      //Removing element CC from the arraylist
      al1.remove("CC");
      /*This element is not present in the list so
       * it should return false
       */
      boolean b=al1.remove("GG");
      System.out.println("Element GG removed: "+b);
      System.out.println("ArrayList After remove:");
      for(String var21: al1){
          System.out.println(var21);
      } 
            }

	  
	   }
}
	