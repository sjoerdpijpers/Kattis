import java.util.Scanner;

public class twothousandfortyeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] M = new int [4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                M[i][j] = sc.nextInt();
            }
        }

        int move = sc.nextInt();
        // System.out.println(move);

        // Move left:
        if(move == 0){
            for(int k=0;k<2;k++){
                for(int i=0;i<4;i++){
                    for(int j=0;j<3;j++){
                        if(M[i][j] == 0){ // swap if zero
                            M[i][j] = M[i][j+1];
                            M[i][j+1] = 0;
                        }
                    }
                }
            }
            for(int i=0;i<4;i++){
                for(int j=0;j<3;j++){
                    if(M[i][j] == M[i][j+1]){ // addition
                        M[i][j] += M[i][j+1];
                        M[i][j+1] = 0;
                        if(j==0 && M[i][2] == M[i][3]){
                            M[i][2] += M[i][3];
                            M[i][3] = 0;
                        }
                    }
                    if(M[i][j] == 0){ // swap if zero
                        M[i][j] = M[i][j+1];
                        M[i][j+1] = 0;
                    }
                }
            }
        }
        // Move up:
        if(move == 1){
            for(int k=0;k<2;k++){
                for(int i=0;i<3;i++){
                    for(int j=0;j<4;j++){
                        if(M[i][j] == 0){ // swap if zero
                            M[i][j] = M[i+1][j];
                            M[i+1][j] = 0;
                        }
                    }
                }
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    if(M[i][j] == M[i+1][j]){ // addition
                        M[i][j] += M[i+1][j];
                        M[i+1][j] = 0;
                        if(i==0 && M[2][j] == M[3][j]){
                            M[2][j] += M[3][j];
                            M[3][j] = 0;
                        }
                    }
                    if(M[i][j] == 0){ // swap if zero
                        M[i][j] = M[i+1][j];
                        M[i+1][j] = 0;
                    }
                }
            }
        }

        // Move right:
        if(move == 2){
            for(int k=0;k<2;k++){
                for(int i=0;i<4;i++){
                    for(int j=3;j>0;j--){
                        if(M[i][j] == 0){ // swap if zero
                            M[i][j] = M[i][j-1];
                            M[i][j-1] = 0;
                        }
                    }
                }
            }
            for(int i=0;i<4;i++){
                for(int j=3;j>0;j--){
                    if(M[i][j] == M[i][j-1]){ // addition
                        M[i][j] += M[i][j-1];
                        M[i][j-1] = 0;
                        if(j==3 && M[i][j-2] == M[i][j-3]){
                            M[i][j-2] += M[i][j-3];
                            M[i][j-3] = 0;
                        }
                    }
                    if(M[i][j] == 0){ // swap if zero
                        M[i][j] = M[i][j-1];
                        M[i][j-1] = 0;
                    }
                }
            }
        }
        // Move down:
        if(move == 3){
            for(int k=0;k<2;k++){
                for(int i=3;i>0;i--){
                    for(int j=0;j<4;j++){
                        if(M[i][j] == 0){ // swap if zero
                            M[i][j] = M[i-1][j];
                            M[i-1][j] = 0;
                        }
                    }
                }
            }
            for(int i=3;i>0;i--){
                for(int j=0;j<4;j++){
                    if(M[i][j] == M[i-1][j]){ // addition
                        M[i][j] += M[i-1][j];
                        M[i-1][j] = 0;
                        if(i==3 && M[i-2][j] == M[i-3][j]){
                            M[i-2][j] += M[i-3][j];
                            M[i-3][j] = 0;
                        }
                    }
                    if(M[i][j] == 0){ // swap if zero
                        M[i][j] = M[i-1][j];
                        M[i-1][j] = 0;
                    }
                }
            }
        }

        // Print out M:
        for(int i = 0 ; i<4 ; i++ ){
            for (int j = 0; j<4; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
