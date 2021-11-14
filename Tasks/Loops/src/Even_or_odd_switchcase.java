
public class Even_or_odd_switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			  switch(i) {
			  case 2: case 4: case 6: case 8: case 10: 
			    System.out.printf("\n %d is an even number.", i);
			    break;
			  default:
			    System.out.printf("\nNot printing odd numbers");
			  }
			}
    
    }
	}


