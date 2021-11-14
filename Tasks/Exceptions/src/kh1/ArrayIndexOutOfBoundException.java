package kh1;
//Write a program to generate ArrayIndexOutOfBoundException
public class ArrayIndexOutOfBoundException {
	  public static void main(String[] args) {  
		  String[] arr = {"shareef","vali","asif","shabbir"};   
		  //Declaring 4 elements in the String array                                       
		            
		          for(int i=0;i<=arr.length;i++) {       
		    
		  //Here, no element is present at the iteration number arr.length, i.e 4  
		               System.out.println(arr[i]);      
		  //So it will throw ArrayIndexOutOfBoundException at iteration 4           
		          }  
		    
		      }  
}
