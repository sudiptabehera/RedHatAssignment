package assignment.github.redhat;

//Write a program to transpose two matrices (3X3 or 4X4) and print the multiplication of
//the transposed matrices.

import java.util.Scanner;

public class TransprodMatrix {
    int o = 0;
    Scanner sc = new Scanner(System.in);

    public int[][] transposeMatrix(int[][] matrix) {
        int transpose[][] = new int[o][o];
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < o; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public int[][] inputMatrix() {
        int matrix[][] = new int[o][o];

        for (int i = 0; i < o; i++) {
            for (int j = 0; j < o; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public void displayMatrix(int[][] matrix) {
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < o; j++) {
                System.out.printf("%s ", matrix[i][j]);
            }
            System.out.print("\n");
        }

    }


    public int[][] productMatrix(int[][] transpose1, int[][] transpose2) {
        int matrix[][] = new int[o][o];
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < o; j++) {
                for (int k = 0; k < o; k++) {
                    matrix[i][j] += transpose1[i][k] * transpose2[k][j];
                }
            }
        }
        return matrix;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        TransprodMatrix tm = new TransprodMatrix();
        System.out.println("Enter the order of matrix1 and matrix2");
        tm.o = tm.sc.nextInt();
        System.out.println("Enter the " + tm.o * tm.o + " elements of matrix 1");
        int matrix1[][] = new int[tm.o][tm.o];
        matrix1 = tm.inputMatrix();
        System.out.println("Enter the " + tm.o * tm.o + " elements of matrix 2");
        int matrix2[][] = new int[tm.o][tm.o];
        matrix2 = tm.inputMatrix();


        System.out.println("Entered Matrix-1");
        tm.displayMatrix(matrix1);
        System.out.println("Entered Matrix-2");
        tm.displayMatrix(matrix2);


        System.out.println("Transpose of entered matrix-1");
        int transpose1[][] = tm.transposeMatrix(matrix1);
        tm.displayMatrix(transpose1);
        /** * @return transpose of given matrix in Java */
        System.out.println("Transpose of entered matrix-2");
        int transpose2[][] = tm.transposeMatrix(matrix2);
        tm.displayMatrix(transpose2);

        int product[][] = new int[tm.o][tm.o];
        product = tm.productMatrix(transpose1, transpose2);
        System.out.println("Product Matrix");
        tm.displayMatrix(product);


    }
    
}