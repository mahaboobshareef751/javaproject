package vehicles;

public class mainprogram {

	private static car car;
	private static plane plane;
	
	public static void main(String[] args) {
		
		car =new car(45000,45,2018,"mini cooper");
		plane=new plane(4500000,3000,2019, "Boeing",130);
		
		car.start();
		plane.start();
		
		System.out.println("------------------------");
		System.out.println(car);
		System.out.println("------------------------");
		System.out.println(plane);
	}

}
