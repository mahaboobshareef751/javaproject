
public class Find_even_odd_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {23, 93, 56, 92, 39};
	      System.out.println("Even numbers in the given array are:: ");
	      for (int i=0; i<myArray.length; i++) {
	         if(myArray[i]%2 == 0) {
	            System.out.println(myArray[i]);
	         }
	      }
	      System.out.println("Odd numbers in the given array are:: ");
	      for (int i=0; i<myArray.length; i++) {
	         if(myArray[i]%2 != 0) {
	            System.out.println(myArray[i]);
	         }
	      }
	}

}
