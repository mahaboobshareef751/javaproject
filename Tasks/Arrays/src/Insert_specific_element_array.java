import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_specific_element_array {


		public static Integer[] addElement(Integer[] arr,
                int element, int position) {
 
 // create ArrayList
       List<Integer> list = 
           new ArrayList<Integer>(Arrays.asList(arr));
 
 // add element at specificed position
       list.add(position, element);

 // return array
      return list.toArray(arr);
}

   public static void main(String[] args) {
 // original array
      Integer arr[] = {10, 20, 30, 40, 50};
 
 // new element to be added
     int element = 99;
 
 // position to be inserted
 // Assuming array start from 1, not 0
    int position = 3;
 
 // display old array
 System.out.println("Original array: " + Arrays.toString(arr));
 
 // add element 
 arr = addElement(arr, element, position);
 
 // display new array
 System.out.println("New array: " + Arrays.toString(arr));
          }

	 


	}


