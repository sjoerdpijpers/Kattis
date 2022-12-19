import java.util.Scanner;

public class LicenseToLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfDays = sc.nextInt();
        int[] days = sc.nextLine().split(" ");
        int min = 1000000000;
        for(int i =0; i < numberOfDays;i++){
            int junk = sc.nextInt();
            if (junk < min){
                min = junk;
            }
        }
        
        System.out.println(Arrays.asList(days).indexOf(min));
    }
}