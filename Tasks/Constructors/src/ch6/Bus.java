package ch6;

public class Bus {
	String name;
	double price;

	// Empty constructor
	public Bus() {
	}

	// Constructor with 1 parameter
	public Bus(String n) {
		this.name=n;
	}
	

	// Constructor with 2 parameters
	public Bus(double p,String n) {
		this.price=p;
		this.name=n;
	}

	// method
	void run() {
	}
	public static void main(String[] args) {
		Bus b=new Bus("bmw");
		System.out.println(b.price+" "+b.name);
	}
}
