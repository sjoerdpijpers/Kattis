import java.util.Scanner;

public class Coldputerscience {
    private int numberOfTemperaturesBelowZero;
     

    public Coldputerscience (){
    }
    
    public int numberOfTemperaturesBelowZero(){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();  
        String temperatures = sc.nextLine();
        String[] str = temperatures.split(" ");
        int size = str.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
           arr[i] = Integer.parseInt(str[i]);
        }
        for(int temperature : arr) {
            if(temperature < 0){
                numberOfTemperaturesBelowZero++;
            }
        }
        sc.close();
        return numberOfTemperaturesBelowZero;
    }


 

    public static void main(final String[] args) {
        final Coldputerscience cp = new Coldputerscience();
        
        System.out.println(cp.numberOfTemperaturesBelowZero());
        

    }
}