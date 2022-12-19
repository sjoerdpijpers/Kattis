import java.util.Scanner;
import java.lang.Math;

public class sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int maxLength = (int) Math.sqrt(w*w+h*h);
        for(int i = 0;i<n;i++){
            int match = sc.nextInt();
            if(match <= maxLength){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
        sc.close();
    }
}
