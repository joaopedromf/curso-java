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

        for(int i=0; i<vect.length; i++){
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            double height = sc.nextDouble();

            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            char gender = sc.next().charAt(0);

            vect[i] = new Person(height, gender);
        }

        double shorterHeight = vect[0].getHeight();
        int shorterHeightIndex = 0;

        double greaterHeight = vect[0].getHeight();
        int greaterHeightIndex = 0;

        double sumHeightWoman = 0.0;
        int womanCounter = 0;

        int manCounter = 0;

        for(int i=1; i<vect.length; i++){
            if(vect[i].getHeight() < shorterHeight){
                shorterHeight = vect[i].getHeight();
                shorterHeightIndex = i;
            }

            if(vect[i].getHeight() > greaterHeight){
                greaterHeight = vect[i].getHeight();
                greaterHeightIndex = i;
            }

            if(vect[i].getGender() == 'F'){
                sumHeightWoman += vect[i].getHeight();
                womanCounter++;
            }

            if(vect[i].getGender() == 'M'){
                manCounter++;
            }
        }

        double averageHeightWoman = sumHeightWoman / womanCounter;

        System.out.printf("Menor altura = %.2f\n",vect[shorterHeightIndex].getHeight());
        System.out.printf("Maior altura = %.2f\n",vect[greaterHeightIndex].getHeight());
        System.out.printf("Media das alturas das mulheres = %.2f\n",averageHeightWoman);
        System.out.println("Numero de homens = " + manCounter);

        sc.close();
    }
}