package ch1;

public class GFG1 {
	public static void main(String[] args)
    {
 
        Addition ob = new Addition();
 
        int sum2 = ob.add(1, 2, 3);
        System.out.println(
            "sum of the three integer value :" + sum2);
        double sum3 = ob.add(1.0, 2.0, 3.0);
        System.out.println("sum of the three double value :"
                           + sum3);
    }
}
