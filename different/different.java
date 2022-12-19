import java.util.Scanner;
import java.lang.Math;

public class different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while(sc.hasNextLine()){
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = Math.abs(a-b);
                System.out.println(c);
            }
        } catch (Exception NoSuchElementException) {
            
        }
        sc.close();
    }
}
