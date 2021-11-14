import java.util.Scanner;


public class Printing_DArray {
    public static void main(String[] args) {
         int a[][] = null;
        System.out.println("Enter the elements:");
        Scanner arr=new Scanner(System.in);
        Integer i=arr.nextInt();
        Integer j=arr.nextInt();
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(a[i][j]+" ");
            }
        }
    }
    
}
