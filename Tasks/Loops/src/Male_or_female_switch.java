import java.util.Scanner;
public class Male_or_female_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your gender, male of female?");
        gender = scan.nextLine();


        if( gender == "f"||gender =="F"||gender =="female"||gender 
            =="Female"||gender =="FEMALE")
        {
            System.out.println("A female" );
        }
        if( gender == "m"||gender =="M"||gender =="male"||gender 
            =="Male"||gender =="MALE")
        {
            System.out.println("A male.");
        }
    }

	}


