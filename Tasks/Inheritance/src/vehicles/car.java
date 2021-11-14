package vehicles;

public class car extends vehicle{
    
	public car() {
		System.out.println("A new plane has been instantiated.");
	}
	
	public car(double weight, double fuel, int year, String brand) {
		super( weight, fuel, year, brand);
		
	}
	
	
	
	
	public String toString(){
		String str="Brand:" + super.getBrand();
		str += "\nyear: " + super.getBrand();
		str += "\nweight: " + super.getWeight();
		str += "\nFuel: " + super.getFuel();
		str += "\nEngine State:" + super.getEngineState();
		
		return str;
	}
	
}
