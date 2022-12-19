import java.util.*;

public class Soylent {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int testcases = sc.nextInt();

//         for (int i = 0; i < testcases; i++) {
//             int desiredCals = sc.nextInt();
//             int bottlesToDrink = (int) Math.ceil(desiredCals/400);
//             System.out.println(bottlesToDrink);
//         }

//         sc.close();
//     }
// }

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int testcases = sc.nextInt();
    
    for (int i = 0; i < testcases; i++) {
        double desiredCals = (double) sc.nextInt();
        double bottlesToDrink = desiredCals/400;
        int print = (int) Math.ceil(bottlesToDrink);
        System.out.println(print);
    }

    sc.close();
}
}
