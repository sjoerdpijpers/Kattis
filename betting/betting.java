import java.util.Scanner;

public class betting {
  public betting(){

  } 
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double betOne = (double) sc.nextInt();
    sc.close();
    double outputOne = 100/betOne;
    double outputTwo = 100/(100-betOne);
    System.out.println(outputOne);
    System.out.println(outputTwo);
  }
}
