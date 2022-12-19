import java.util.Scanner;

public class sumkindofproblem {
    public sumkindofproblem(){
    }

    public int sumOfPosInt(int n){
        int result = 0;
        for(int i = 1;i <= n;i++){
            result += i;
        }
        return result;
    }
    
    public int sumOfOddInt(int n){
        int result = 0;
        int odd = 1;
        for(int i = 1;i<=n;i++){
            result += odd;
            odd += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for(int i = 0;i<p;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.print(k + " ");
            sumkindofproblem skop = new sumkindofproblem();
            System.out.print(skop.sumOfPosInt(n) + " ");
            int odd = skop.sumOfOddInt(n);
            System.out.print(odd + " ");
            System.out.println(odd + n);
        }
        sc.close();
    }
}
