
public class Temperature {

	private static double temperature;
	  public static double maxTemp = 0;

	  public Temperature(double t)
	  {
	      temperature = t;
	      if (t > maxTemp)
	         maxTemp = t;
	  }

	  public static void printMax()
	  {
	     try {
			System.out.println(temperature);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

	  public static void main(String[] args)
	  {
	     Temperature t1 = new Temperature(75);
	     Temperature t2 = new Temperature(100);
	     Temperature.printMax();
	  }

	
		
	}

