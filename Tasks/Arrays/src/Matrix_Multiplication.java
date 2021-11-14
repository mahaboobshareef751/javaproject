import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("enter the number of rows and columns of matrix 1:");
        int row = m.nextInt();
        int col = m.nextInt();
        int[][] a = new int[row][col];
        fillingMatrix1(m, a, row, col);
        System.out.println("enter the number of rows and columns of matrix 2:");
        int brows = m.nextInt();
        int bcolumns = m.nextInt();
        int[][] b = new int[brows][bcolumns];
        int product[][]=new int[row][bcolumns];
        fillingMatrix2(m, b, brows, bcolumns);
        Multiplication(m,row,bcolumns,brows,product, a);

    }

    public static void fillingMatrix1(Scanner scan, int a[][], int rows, int columns) {

        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = scan.nextInt();
            }
        }

    }

    public static void fillingMatrix2(Scanner scan, int a[][], int rows, int columns) {

        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = scan.nextInt();
            }
        }

    }

    public static void Multiplication(Scanner scan, int rows, int columns, int col, int a[][],int p[][]) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < col; k++) {
                    sum += p[i][k] * p[k][j];
                }
                a[i][j] = sum;
                sum = 0;
            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
