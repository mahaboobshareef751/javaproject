import java.io.*; //Print instance variables in static method
public class Method {

    // instance variable
	    public int k;
	 
	    // Constructor to set value to instance variable
	    public Method(int k) { this.k = k; }
	   
	    // set method for instance variable
	    public void setK() { this.k = k; }
	   
	    // get method for instance variable
	    public int getK() { return k; }
	 
	    public static void main(String[] args)
	    {
	 
	        // Calling class GFG where instance variable is
	        // present
	        Method gfg = new Method(10);
	 
	        // now we got instance of instance variable class
	        // with help of this class we access instance
	        // variable
	        System.out.print("Value of k is: " + gfg.getK());
	    }


	}


