package hk;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Details {
	 public static void main(String args[]) {

	      /* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");

	      /* Display content using Iterator*/
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);

	      /* Remove values based on key*/
	      hmap.remove(3);
	      System.out.println("Map key and values after removal:");
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	          
	          /*HashMap Sorting by Keys*/
	          HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
	          hmap1.put(5, "A");
	          hmap1.put(11, "C");
	          hmap1.put(4, "Z");
	          hmap1.put(77, "Y");
	          hmap1.put(9, "P");
	          hmap1.put(66, "Q");
	          hmap1.put(0, "R");

	          System.out.println("Before Sorting:");
	          Set set1 = hmap1.entrySet();
	          Iterator iterator1 = set1.iterator();
	          while(iterator1.hasNext()) {
	                Map.Entry me = (Map.Entry)iterator1.next();
	                System.out.print(me.getKey() + ": ");
	                System.out.println(me.getValue());
	          }
	          Map<Integer, String> map = new TreeMap<Integer, String>(hmap1); 
	          System.out.println("After Sorting:");
	          Set set21 = map.entrySet();
	          Iterator iterator21 = set21.iterator();
	          while(iterator21.hasNext()) {
	               Map.Entry me2 = (Map.Entry)iterator21.next();
	               System.out.print(me2.getKey() + ": ");
	               System.out.println(me2.getValue());
	               /*Java – Get size of HashMap example*/
	               

	               // Creating a HashMap of int keys and String values
	               HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	            
	               // Adding Key and Value pairs to HashMap
	               hashmap.put(11,"Value1");
	               hashmap.put(22,"Value2");
	               hashmap.put(33,"Value3");
	               hashmap.put(44,"Value4");
	               hashmap.put(55,"Value5");
	            
	               // int size() method returns the number of key value pairs 
	               System.out.println("Size of HashMap : " + hashmap.size());
	               
	               
	               /*Java – Remove mapping from HashMap example*/
	               // Creating a HashMap of int keys and String values
	               HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();
	            
	               // Adding Key and Value pairs to HashMap
	               hashmap1.put(11,"Value1");
	               hashmap1.put(22,"Value2");
	               hashmap1.put(33,"Value3");
	               hashmap1.put(44,"Value4");
	               hashmap1.put(55,"Value5");
	               hashmap1.put(66,"Value6");
	            
	               // Displaying HashMap Elements
	               System.out.println("HashMap Elements: " + hashmap1);

	               // Removing Key-Value pairs for key 33
	               Object removedElement1 = hashmap1.remove(33);
	               System.out.println("Element removed is: " +removedElement1);
	            
	               // Removing Key-Value pairs for key 55
	               Object removedElement2 = hashmap1.remove(55);
	               System.out.println("Element removed is: " +removedElement2);

	               // Displaying HashMap Elements after remove
	               System.out.println("After Remove:");
	               System.out.println("--------------");
	               System.out.println("HashMap Elements: " + hashmap1);
	               System.out.println("--------------");
	               /*Java – Remove all mappings from HashMap example*/
	               // Creating a HashMap of int keys and String values
	               HashMap<Integer, String> hashmap3 = new HashMap<Integer, String>();
	           
	               // Adding Key and Value pairs to HashMap
	               hashmap3.put(11,"Value1");
	               hashmap3.put(22,"Value2");
	               hashmap3.put(33,"Value3");
	               hashmap3.put(44,"Value4");
	               hashmap3.put(55,"Value5");
	            
	               // Displaying HashMap Elements
	               System.out.println("HashMap Elements: " + hashmap3);

	               // Removing all Mapping
	               hashmap3.clear();

	               // Displaying HashMap Elements after remove
	               System.out.println("After calling clear():");
	               System.out.println("---------------------");
	               System.out.println("HashMap Elements: " + hashmap3); 
	               System.out.println("---------------------");
	               /*How to check if a HashMap is empty or not?*/
	               // Create a HashMap
	               HashMap<Integer, String> hmap2 = new HashMap<Integer, String>(); 
	            
	            
	               // Checking whether HashMap is empty or not
	               /* isEmpty() method signature and description -
	                * public boolean isEmpty(): Returns true if this map 
	                * contains no key-value mappings.
	                */
	               System.out.println("Is HashMap Empty? "+hmap2.isEmpty());
	            
	               // Adding few elements
	               hmap2.put(11, "Jack");
	               hmap2.put(22, "Rock");
	               hmap2.put(33, "Rick");
	               hmap2.put(44, "Smith");
	               hmap2.put(55, "Will");
	            
	               // Checking again
	               System.out.println("Is HashMap Empty? "+hmap2.isEmpty());
	       }

	   }
   }
}
