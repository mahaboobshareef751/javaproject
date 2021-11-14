
public class Circle {
	
	
	static double Findarea(double r) {
		double a= 3.142*r*r;
		return a;
	}
	
	
	public static void main(String[] args) {
		// call the function static method without declaration of object
		System.out.println(Findarea(15.45));
		System.out.println(Findarea(34.42));
		System.out.println(Findarea(3.23));

	}

}
