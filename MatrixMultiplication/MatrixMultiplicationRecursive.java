import java.util.Scanner;
// Recursive MxM matrix multiplication

public class MatrixMultiplication {
    private int[][] C;
    private int n;

    public MatrixMultiplication(int n){
        C = new int[n][n];
        n = this.n;
    }

    public int[][] multiply(int[][] A, int[][] B) {
        if (n == 2) {
            return A[0][0]*B[0][0];
            C[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0]; 
            C[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1];
            C[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0];
            C[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1];
        } else {
            n /= 2;
            

        }
        return C;
    }

    public int[][] add() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MatrixMultiplication mm = new MatrixMultiplication(n);


        int [][] A = new int [n][n];
        int [][] B = new int [n][n];
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

        int[][] C = mm.multiplyRecursive(A, B);

        // Print out C:
        for(int i = 0 ; i<n ; i++ ){
            for (int j = 0; j<n; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}