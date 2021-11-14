package vehicles;
//parent-Abstract
public class vehicle {
	
	private double weight;
	private double fuel;
	private int  year;
	private String brand;
	private String engineState;  // OFF OR ON
	public vehicle() {};
	public vehicle(double weight, double fuel, int year, String brand) {
		setWeight(weight);
		setFuel(fuel);
		setYear(year);
		setBrand(brand);
		setEngineState("OFF");	
	}

	
	//functions
	public void start() {
		if(this.engineState == "ON") {
			System.out.println("Engine is already ON.");
		}else {
			this.setEngineState("ON");
			System.out.println("Engine is  ON.");
		}
	
	}
	public void stop() {
		if(this.engineState == "OFF") {
			System.out.println("Engine is already ON.");
		}else {
			this.setEngineState("OFF");
			System.out.println("Engine is  OFF.");
		}
		
	
	}
	
	
	//getters and setters
	
	
	public double getWeight() {
		return weight;
	}

	public String getEngineState() {
		return engineState;
	}
	public void setEngineState(String engineState) {
		this.engineState = engineState;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
}
