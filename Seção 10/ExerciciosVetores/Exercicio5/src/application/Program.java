package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        double higher = vect[0];
        int index = 0;

        for(int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();

            if(vect[i] > higher){
                higher = vect[i];
                index = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n",higher);
        System.out.println("POSICAO DO MAIOR VALOR = " + index);
        
        sc.close();
    }
}