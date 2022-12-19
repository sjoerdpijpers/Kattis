import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Bernie {
    private Map<String, ArrayList<Integer>> tripsYears;

    public Bernie(){
        tripsYears = new HashMap<>();
    }

    // adding trips to the map
    public void addTrip(String country, int year){
        if(tripsYears.containsKey(country)){
            ArrayList<Integer> years = tripsYears.get(country);
            years.add(year);
        }else{
            ArrayList<Integer> years = new ArrayList<>();
            years.add(year);
            tripsYears.put(country, years);
        }
    }

    public void ListenToGrandpa (){
        Scanner sc = new Scanner(System.in);
        int  noOfTrips = sc.nextInt(); // 4
        for(int i = 0; i < 4; i++){
            String country = sc.next();
            int year = sc.nextInt();
            addTrip(country, year); // Iceland 2016
        }
        int n = sc.nextInt();
        for(int j=0;j<n;j++){
            String country = sc.next();
            int whichTrip = //use collections sort

        }
    }
}