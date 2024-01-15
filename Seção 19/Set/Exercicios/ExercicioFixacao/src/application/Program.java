package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        for(int i=1; i<=3; i++){
            switch(i){
                case 1:
                    System.out.print("How many students for course A? ");
                    break;
                case 2:
                    System.out.print("How many students for course B? ");
                    break;
                case 3:
                    System.out.print("How many students for course C? ");
                    break;
            }
            int n = sc.nextInt();

            for(int j=1; j<=n; j++){
                int code = sc.nextInt();
                set.add(code);
            }
        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}