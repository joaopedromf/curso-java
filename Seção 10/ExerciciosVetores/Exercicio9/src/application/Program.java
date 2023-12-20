package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for(int i=0; i<vect.length; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            vect[i] = new Person(name, age);
        }

        int olderAge = vect[0].getAge();
        int olderPosition = 0;

        for(int i=1; i<vect.length; i++){
            if(vect[i].getAge() > olderAge){
                olderAge = vect[i].getAge();
                olderPosition = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + vect[olderPosition].getName());
        
        sc.close();
    }
}