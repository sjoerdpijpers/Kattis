import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AwkwardParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int guests = sc.nextInt();
        int countTemp = 0;
        int count = 0;
        for(int i = 0; i < guests; i++){
            int guest = sc.nextInt();
            if(!list.contains(guest)){
                countTemp++;
            } else {
                list.clear();
                count = countTemp;
                countTemp = 0;
            }
            list.add(guest);
        }
        System.out.println(count);
    }
}