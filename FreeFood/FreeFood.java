import java.util.ArrayList;
import java.util.Scanner;

public class FreeFood {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> days = new ArrayList<>();
        //int N = sc.nextInt();
        sc.nextLine();
        
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            int s = Integer.parseInt(parts[0]);
            int t = Integer.parseInt(parts[1]);
            while(s<=t){
                if(!days.contains(s)){
                days.add(s);
                }
                s++;
            }
        }
        sc.close();
        System.out.println(days.size());

    }
}
