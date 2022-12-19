import java.util.Scanner;

public class aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jon = sc.nextLine();
        String doc = sc.nextLine();

        if(jon.length() >= doc.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
        sc.close();
    }
}
