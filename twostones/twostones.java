import java.util.Scanner;

public class twostones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 1){
            System.out.println("Alice");
        }else{
            System.out.println("Bob");
        }
        sc.close();
    }
}
