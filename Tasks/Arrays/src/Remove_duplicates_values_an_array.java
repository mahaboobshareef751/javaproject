import java.util.Arrays;
import java.util.LinkedHashSet;

public class Remove_duplicates_values_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				 //Array with duplicate elements
		        Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
		         
		        //This array has duplicate elements
		        System.out.println( Arrays.toString(numbers) );
		         
		        //Create set from array elements
		        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
		         
		        //Get back the array without duplicates
		        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
		         
		        //Verify the array content
		        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
		    }

			

	}


