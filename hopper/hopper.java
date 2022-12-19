import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class hopper {
    
    public static int[] removeNegativeNumbers(int[] num) {
        List<Integer> list = new ArrayList<>();
        for (int n : num) {
            if (n >= 0) {
                list.add(n);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).intValue();
        }
        return result;
    }

    public static int[] indexRange(int begin, int end,int[] array){
        int length = end - begin;
        int[] intArr = new int[length];
        for(int i=0;i<length;i++){
            intArr[i]= array[begin+i];
        }
        return intArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //length of the array
        int D = sc.nextInt(); //maximum length of a jump the hopper can make
        int M = sc.nextInt(); //maximum difference in values a hopper can handle
        System.out.println("D(maxJump) = " + D);
        System.out.println("M(maxDiff) = " + M);
        
        int[] array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Input array" + Arrays.toString(array));

        int maxPath = 0;
        int path = 1;
        for(int i = 0;i<n;i++){
            int index = i;
            int number = array[i];
            int[] test = new int[2*D];
            if(i-D < 0){
                test = indexRange(0, i+D, array);
            }else if(i+D > array.length-1){
                test = indexRange(i-D, array.length-1, array);
            }else{
                test = indexRange(i-D, i+D, array);
            }
            // removeNegativeNumbers(test);
            System.out.println(Arrays.toString(test));

            // int[] test = {1, . ,5};

            // for(int j = 1;j<=D;j++){
            //     int next =array[i+D];

            //     if(i+D+1 <= n && Math.abs(array[i+D]-array[i]) <= M){
            //         index=i+D;
            //         System.out.print(index + " ");
            //         path++;
            //     }
            //     if(path>maxPath){
            //         maxPath = path;
            //     }
            // }
            
        }
        // System.out.println();
        // System.out.println(maxPath);
        
        // int[] array2 = { 1, -3, 4, -9, 3, 4, 70, -10, 0, 7 };
        // System.out.println(Arrays.toString(removeNegativeNumbers(array2)));
        // System.err.println();
        // int[] test = indexRange(4, 6, array2);
        // printArray(test);
        // System.out.println(Arrays.toString(test));
    }
}
