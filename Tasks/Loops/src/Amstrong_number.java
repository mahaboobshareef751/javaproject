import java.util.Scanner;

public class Amstrong_number {

		static boolean armstrong(int n) {
			// TODO Auto-generated method stub
			 int sum = 0;
		        int r;
		        int num = n;
		        while (n!=0)
		        {
		            r = n%10;
		            sum = sum+(r*r*r);
		            n = n/10;
		        }
		        if(sum == num)
		            return true;
		        else
		            return false;
		    }
		    public static void main(String[] args)
		    {
		        Scanner obj = new Scanner(System.in);
		        System.out.println("enter the value for n");
		        int n = obj.nextInt();
		        for(int i=1; i<=n; i++)
		        {
		            if(armstrong(i))
		                System.out.println(i);
		        }
		
	}

}
