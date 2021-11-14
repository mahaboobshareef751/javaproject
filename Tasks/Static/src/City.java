
public class City {

	String name;//instance variable declaration
	int pincode;
	
	City( int p, String n){
		
		
		this.pincode=p;
		this.name=n;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c =new City(518543,"kurnool");
System.out.println(c.pincode+"     "+c.name);
	}

}
