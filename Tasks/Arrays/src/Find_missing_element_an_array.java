
public class Find_missing_element_an_array {

static int ar[]={3,5,8,44}; //given array
	    
	    public static void main(String[] args) {
	           displayMissing();       
	    }
	    
	    /*
	     * Method finds out missing number in given range.
	     */
	    static public void displayMissing(){
	           
	           System.out.print("given array(already sorted): ");
	           for (int j = 0; j < ar.length; j++)
	                  System.out.print(ar[j] +" "); // display it
	           
	           System.out.print("\nNumbers missing between 1 to 100 in array :  ");
	           
	           int j=0;
	           for(int i=1;i<=100;i++){
	                  if(j<ar.length && i==ar[j])
	                        j++;
	                  else
	                        System.out.print(i+" ");
	                  

	}

	    }
	}
	
