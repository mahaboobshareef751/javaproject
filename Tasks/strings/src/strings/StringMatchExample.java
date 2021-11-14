package strings;

public class StringMatchExample {

	public static void main(String args[]) {
        String[] alphabets = {"", "12345", "A12345", "12345B",
                                  "12345a" , "abcd" , "aa343"};
     
        for(String alphabet : alphabets) {
           System.out.println(" does " + alphabet +
             " contains alphabetic words : " + alphabet.matches(".*[A-Za-z].*"));

        }
     
        //checking if String contains digits or not
        String[] numbers = {"1234" , "+1234", "234a"};
        for(String number : numbers) {
           System.out.println(" number " + number + " contains only 1-9 digits : "
               + number.matches(".*[1-9].*"));
        }
     
     
    }	
}
