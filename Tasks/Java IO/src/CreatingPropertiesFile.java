//Write a program to read data from properties file

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class CreatingPropertiesFile {
	public static void main(String args[]) throws IOException {
	      //Instantiating the properties file
	      Properties props = new Properties();
	      //Populating the properties file
	      props.put("Device_name", "OnePlus7");
	      props.put("Android_version", "9");
	      props.put("Model", "GM1901");
	      props.put("CPU", "Snapdragon855");
	      //Instantiating the FileInputStream for output file
	      String path = "D:\\ExampleDirectory\\myFile.properties";
	      FileOutputStream outputStrem = new FileOutputStream(path);
	      //Storing the properties file
	      props.store(outputStrem, "This is a sample properties file");
	      System.out.println("Properties file created......");
	   }
}
