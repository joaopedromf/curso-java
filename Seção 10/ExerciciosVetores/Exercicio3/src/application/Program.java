package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        double sum = 0.0;
        int underSixteen = 0;

        for(int i=0; i<vect.length; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            vect[i] = new Person(name, age, height);

            sum += vect[i].getHeight();

            if(vect[i].getAge() < 16){
                underSixteen += 1;
            }
        }

        double avg = sum / vect.length;
        double under = (double) underSixteen / vect.length * 100.0;

        System.out.printf("\nAltura média: %.2f\n",avg);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n",under);

        for(int i=0; i<vect.length; i++){
            if(vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }
        
        sc.close();
    }
}