package application;

import java.util.Scanner;

import entities.Rent;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        System.out.println();

        Rent[] rooms = new Rent[10];

        for(int i=1; i<=n; i++){
            System.out.println("Rent #" + i + ":");

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            System.out.println();

            rooms[roomNumber] = new Rent(name, email);
        }

        System.out.println("Busy rooms:");
        for(int i=0; i<10; i++){
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
    }
}