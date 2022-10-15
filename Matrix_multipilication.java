

import java.io.*;
import java.util.Scanner;

public class Matrix_multipilication{


    static void printMatrix(int M[][],
                            int rowSize,
                            int colSize)
    {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }

    static void multiplyMatrix(
            int row1, int col1, int A[][],
            int row2, int col2, int B[][])
    {
        int i, j, k;

        System.out.println("\nMatrix A:");
        printMatrix(A, row1, col1);
        System.out.println("\nMatrix B:");
        printMatrix(B, row2, col2);

        if (row2 != col1) {

            System.out.println(
                    "\nMultiplication Not Possible");
            return;
        }
        int C[][] = new int[row1][col2];

        // Multiply the two matrices
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
        System.out.println("\nResultant Matrix:");
        printMatrix(C, row1, col2);
    }


    public static void main(String[] args)
    {
        Scanner input=new  Scanner(System.in);

        int row1 , col1 , row2 , col2;
        System.out.println("Enter the number of rows in first matrix: ");
        row1=input.nextInt();
        System.out.println("Enter the number of columns in first matrix: ");
        col1=input.nextInt();
        System.out.println("Enter the number of rows in second matrix: ");
        row2=input.nextInt();
        System.out.println("Enter the number of columns in second matrix: ");
        col2=input.nextInt();

        int A[][]=new int[row1][col1];

        int B[][] = new int[row2][col2];
        System.out.println("Enter the elements in the first  matrix:");
        for (int i=0;i<row1;i++){
            for (int j=0;j<col1;j++){
                A[i][j]=input.nextInt();
            }
    }
        System.out.println("Enter the elements in the second  matrix:");
        for (int i=0;i<row1;i++){
        for (int j=0;j<col1;j++){
            B[i][j]=input.nextInt();
        }
    }
        System.out.println("Dispaly the first matrix:");
        System.out.println();
        for (int i=0;i<row1;i++){
        for (int j=0;j<col1;j++){
            System.out.println(A[i][j]+" ");
        }
        System.out.println();
    }
        System.out.println("Display the second matrix:");
        System.out.println();
        for (int i=0;i<row1;i++){
        for (int j=0;j<col1;j++){
            System.out.println(B[i][j]+" ");
        }
        System.out.println();
    }


        multiplyMatrix(row1, col1, A,
                row2, col2, B);
    }
}
