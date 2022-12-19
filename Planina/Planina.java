import java.util.Scanner;
import java.lang.Math;

public class Planina{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        int a = 1 + (int) Math.pow(2,iter);
        int numberOfPoints = (int) Math.pow(a,2);
        System.out.println(numberOfPoints);
        sc.close();
        
 /*        for(int i = 0; i <= 5; i++){
            int b = 1 + (int) Math.pow(2,i);
            int c = (int) Math.pow(b,2);
            System.out.println(c);
        } */

    }
}