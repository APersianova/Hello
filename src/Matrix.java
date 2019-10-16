import java.io.*;
import java.util.*;
class Matrix{
    public static void main(String[] args)  {

        int array[][] = new int[3][3];
        int array1[][] =new int[3][3];
        int array2[][] = new int[3][3];

        Scanner scan=new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j <3; j++) {
                System.out.println("Matrix 1st ["+i+"]["+j+"]:");
                array[i][j]=scan.nextInt();
            }
        }
        int m = array.length;
        int n = array1[0].length;
        int o = array1.length;
        int[][] res = new int[m][n];

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matrix 2nd [" + i + "][" + j + "]:");
                array1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Multiply of both matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += array[i][k] * array1[k][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }
    }

}
