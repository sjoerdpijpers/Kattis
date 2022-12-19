import java.util.Scanner;

public class aboveaverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for(int i = 0;i<C;i++){
            int N = sc.nextInt();
            int gradesTotal = 0;
            int[] finalGrades = new int[N];
            for(int j = 0;j<N;j++){
                int finalGrade = sc.nextInt();
                gradesTotal += finalGrade;
                finalGrades[j] = finalGrade;
            }
            int average = gradesTotal/N;
            int amountOfStudentsAboveAverage = 0;
            for(int j = 0;j<N;j++){
                if(finalGrades[j] > average){
                    amountOfStudentsAboveAverage++;
                }
            }
            float percent = (float)amountOfStudentsAboveAverage/(float)N *100;

            System.out.printf("%.3f", percent);
            System.out.println("%");
        }
        sc.close();
    }
}
