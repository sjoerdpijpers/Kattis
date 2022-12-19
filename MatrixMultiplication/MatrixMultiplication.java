import java.util.Scanner;
// Naive MxM matrix multiplication
// C[i][j] = A[i][1] ⋅ B[1][j] + … + A[i][n] ⋅ B[n][j]

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] A = new int [n][n];
        int [][] B = new int [n][n];
        int [][] C = new int [n][n];

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

        // Calculate C, the multiplication of A and B:
        for(int i = 0 ; i<n ; i++ ){
            for (int j = 0; j<n; j++){
                for (int k = 0; k<n ; k++){
                    int sum = A[i][k] * B [k][j];
                    C[i][j] += sum;
                }
            }
        }

        // Print out C:
        for(int i = 0 ; i<n ; i++ ){
            for (int j = 0; j<n; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}