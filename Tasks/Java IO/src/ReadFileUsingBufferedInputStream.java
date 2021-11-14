import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 //Read text from a .txt file using BufferedInputStream

/** JavaMadeSoEasy.com */
public class ReadFileUsingBufferedInputStream {
	public static void main(String... args) {
		 
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        
        try {
               fis = new FileInputStream("c:/myFile.txt");
               bis= new BufferedInputStream(fis);
               
               System.out.println("Reading from text file using BufferedInputStream > ");
               int ch;
               while ((ch = bis.read()) != -1) { //read till end of file
                     System.out.print((char) ch);
               }

        } catch (IOException e) {
               e.printStackTrace();
        } finally {
            try {
                     if (bis != null)
                            bis.close(); //close BufferedInputStream
                                          // will close FileInputStream 
               } catch (IOException e) {
                     e.printStackTrace();
               }
        }

 }
}
