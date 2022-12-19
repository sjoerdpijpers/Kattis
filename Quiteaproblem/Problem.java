import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            //line = line.toLowerCase();
            boolean containsProblem = line.toLowerCase().contains("problem");
            System.out.println(containsProblem? "yes" : "no");
        }
        sc.close();
    }
}