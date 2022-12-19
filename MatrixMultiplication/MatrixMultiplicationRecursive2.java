import java.util.Arrays;
import java.util.Scanner;

// Recursive matrix multiplication, with help from https://shivathudi.github.io/jekyll/update/2017/06/15/matr-mult.html, see eq. 4.9 and the square-matrix-multiply-recursive(A,B)

public class MatrixMultiplicationRecursive2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] A = new int [n][n];
        int [][] B = new int [n][n];
        int [][] C = new int [n][n];
        //int [][] C = new int [n][n];

        // Read in Matrix A:
        for(int i = 0 ; i<n ; i++ ){
            for (int j = 0; j<n; j++){
                A[i][j] = sc.nextInt();
            }
        }

        // Read in Matrix B:
        for(int i = 0 ; i<n ; i++ ){
            for (int j = 0; j<n; j++){
                B[i][j] = sc.nextInt();
            }
        }

        C = multiply(A, B, 0, 0, 0, 0, A.length);
        
        for(int i = 0 ; i<n ; i++ ){
            for (int j = 0; j<n; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int[][] multiply(int[][] A, int[][] B, int rowA, int colA, int rowB, int colB, int n) {
        int[][] C = new int[n][n];
        if (n == 2) {
            C[0][0] = A[rowA][colA] * B[rowB][colB] - A[rowA][colA+1] * B[rowB+1][colB]; 
            C[0][1] = A[rowA][colA] * B[rowB][colB+1] - A[rowA][colA+1] * B[rowB+1][colB+1];
            C[1][0] = A[rowA+1][colA] * B[rowB][colB] - A[rowA+1][colA+1] * B[rowB+1][colB];
            C[1][1] = A[rowA+1][colA] * B[rowB][colB+1] - A[rowA+1][colA+1] * B[rowB+1][colB+1];
            
        } else {
            int newN = n / 2;

            // C11 = A11 * B11 + A12 * B21
            add(C, multiply(A, B, rowA, colA, rowB, colB, newN),//A11*B11
                multiply(A, B, rowA, colA + newN, rowB + newN, colB, newN), //A12*B21
                0, 0);//C11

            // C12 = A11 * B12 + A12 * B22
            add(C, multiply(A, B, rowA, colA, rowB, colB + newN, newN),//A11*B12
                multiply(A, B, rowA, colA + newN, rowB + newN, colB + newN, newN),//A12*B22
                0, newN);//C12

            // C21 = A21 * B11 + A22 * B21
            add(C, multiply(A, B, rowA + newN, colA, rowB, colB, newN),//A21*B11
                multiply(A, B, rowA + newN, colA + newN, rowB + newN, colB, newN),//A22*B21
                newN, 0);//C21

            // C22 = A21 * B12 + A22 * B22
            add(C, multiply(A, B, rowA + newN, colA, rowB, colB + newN, newN),//A21*B12
                multiply(A, B, rowA + newN, colA + newN, rowB + newN, colB + newN, newN), //A22*B22
                newN, newN);//C22
        }

        return C;
    }

    private static void add(int[][] C, int[][] A, int[][] B, int rowC, int colC) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i + rowC][j + colC] = A[i][j] + B[i][j];
            }
        }

    }

}