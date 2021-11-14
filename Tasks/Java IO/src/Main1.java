//Write a program to write text to .txt file using FileWriter

import java.io.FileWriter;
public class Main1 {
	public static void main(String args[]) {

	    String data = "This is the data in the output file";

	    try {
	      // Creates a FileWriter
	      FileWriter output = new FileWriter("output.txt");

	      // Writes the string to the file
	      output.write(data);

	      // Closes the writer
	      output.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
}
