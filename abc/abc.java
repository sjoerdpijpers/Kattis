import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String[] arrOfStr = line1.split(" ", 3);
        int[] arrOfInt = new int[arrOfStr.length];
        for(int i = 0;i < arrOfStr.length;i++){
            arrOfInt[i] = Integer.parseInt(arrOfStr[i]);
        }
        Arrays.sort(arrOfInt);
        String order = sc.nextLine();
        order = order.replace('A', '0');
        order = order.replace   ('B', '1');
        order = order.replace('C', '2');
        System.out.print(arrOfInt[Integer.parseInt(order.substring(0,1))] + " ");
        System.out.print(arrOfInt[Integer.parseInt(order.substring(1,2))] + " ");
        System.out.print(arrOfInt[Integer.parseInt(order.substring(2,3))]);
        sc.close();
    }
}
