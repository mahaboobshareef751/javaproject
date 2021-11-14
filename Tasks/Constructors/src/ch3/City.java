package ch3;

public class City {
 String cityname;
 int pincode;

 City(int p,String c){
	 this.pincode=p;
	 this.cityname=c;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
City c1=new City(518504,"kurnool");
System.out.println(c1.pincode+" "+c1.cityname);
City c2=new City(518502,"nandyal");
System.out.println(c2.pincode+" "+c2.cityname);
       }

}
