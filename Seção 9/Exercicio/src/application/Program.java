package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account ac;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);

        if(answer == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            ac = new Account(number, holder, initialDeposit);
        }
        else{
            ac = new Account(number, holder);
        }

        System.out.println("\nAccount data:");
        System.out.println(ac);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        ac.deposit(depositValue);

        System.out.println("\nUpdated account data:");
        System.out.println(ac);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        ac.withdraw(withdrawValue);

        System.out.println("\nUpdated account data:");
        System.out.println(ac);
        System.out.println();

        sc.close();
    }
}