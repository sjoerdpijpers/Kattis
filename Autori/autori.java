/**
 * autori
 */

import java.util.Scanner;

public class autori {

    public autori(){

    }
    
    public void initials(){
        Scanner sc = new Scanner(System.in);
        String allNames = sc.nextLine();
        String[] names = allNames.split("-");
        for(String name : names){
            System.out.print(name.charAt(0));
        }
        sc.close();
    }

    public static void main(String[] args) {
        autori autori = new autori();
        autori.initials();
    }
}