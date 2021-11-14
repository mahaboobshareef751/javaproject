
public class Array_to_array_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 8, 3 };
		 
        // Copy elements of a[] to b[]
        int b[] = a.clone();
 
        // Change b[] to verify that
        // b[] is different from a[]
        b[0]++;
 
        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
 
        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }

	}


