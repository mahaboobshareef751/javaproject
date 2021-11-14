package strings;

public class JavaReplaceCharExample3 {
	public static void main(String[] args){
		//second string to replace the character
		String str = "Alabama|California|Florida|Texas|New Jersey|Arizona";
		//displaying string before applying replace method
		System.out.println("\n" + str);
		//replacing | with the comma
		String newStr = str.replace('|', ',');
		//displaying string after applying replace method
		System.out.println("\n" + newStr);
		//replacing the character A with the i
		String reNewedStr = newStr.replace('A', 'i');
		//displaying string before applying replace method
		System.out.println("\n" + reNewedStr);
		}
}
