package vehicles;

public class plane extends vehicle {
	
	private double wingSpan;
	//Constructor
	public plane() {
		System.out.println("A new car has been instantiated.");
	}
	
	public plane(double weight, double fuel, int year, String brand,double wingSpan) {
		super( weight, fuel, year, brand);
		setWingSpan(wingSpan);
		}
	
	
	
	public String toString(){
		String str="Brand:" + super.getBrand();
		str += "\nyear: " + super.getBrand();
		str += "\nweight: " + super.getWeight();
		str += "\nFuel: " + super.getFuel();
		str += "\nEngine State:" + super.getEngineState();
		str += "\nwingspan: " + this.getWingSpan();
		
		return str;
	}
	
	
	
	
	
  //Getters and Setters
	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
	 

}
