import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int testCase =1;
        while (sc.hasNextLine()){
            int n = Integer.valueOf(sc.nextInt());
            if (n>0){
                Map<String, Integer> animals = new HashMap();
                for (int i = 0; i < n ; i++){
                    String animal = sc.nextLine().toLowerCase();
                    String[] words = animal.split(" ");
                    String lastWord = words[words.length -1];
                    if(!animals.containsKey(lastWord)){
                        animals.putIfAbsent(lastWord, 0);
                        animals.put(lastWord, animals.get(lastWord+1));
                        animals.replace(lastWord, animals.get(lastWord)+1);
                    }
                }
                System.out.println("List" + testCase + ":");
                List<String> types = new ArrayList<>();
                Collections.sort(types);
                for(String type : types){
                    System.out.println(String.format("%s | %s", type, animals.get(type)));
                }     
            }
            testCase++;
        }
    }
}