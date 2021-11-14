//Write a program to read text from .txt file using FileReader

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Example class for FileReader
 */
public class ExampleClass {
	//utility method to print a char
    static void print(char value) {
        System.out.print(value);
    }


    public static void main(String[] args) {
        readFile();
    }

    static void readFile() {

        try {
            //create a FileReader Object by providing File name in the constructor
            FileReader reader = new FileReader("C://sample.txt");

            int c; //this will contain the character value as int

            while ((c = reader.read()) != -1) {
                print((char) c);
            }

            //close the reader after reading is completed
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }


    }
}
