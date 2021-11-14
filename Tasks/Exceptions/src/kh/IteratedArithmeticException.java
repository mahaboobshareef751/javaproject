package kh;

public class IteratedArithmeticException extends Throwable {
	 // Default Constructor:
	  public IteratedArithmeticException(){}
	 
	  // Standard constructor:
	  public IteratedArithmeticException(String s, Throwable cause) {
	    super(s, cause);                                                   // Call the base constructor.
	  }
	 
	  public IteratedArithmeticException(int iteration, Throwable cause) {
	    super(cause);                                                      // Call the base constructor.
	 
	    this.iteration = iteration;                                        // Set the iteration number.
	 
	  }
	 
	  public int getIteration() {                                          // Get the array index value for the error.
	    return iteration;                                                  // Return the iteration number.
	  }
	 
	  // The default value of -1 can be used to check whether an iteration number was stored
	  private int iteration = -1;  
}
