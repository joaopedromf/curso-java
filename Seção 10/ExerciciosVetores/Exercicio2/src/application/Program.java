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

        double sum = 0.0;

        for(int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.print("\nVALORES = ");
        for(int i=0; i<vect.length; i++){
            System.out.print(vect[i] + " ");
        }

        System.out.printf("\nSOMA = %.2f\n", sum);

        double media = sum / vect.length;
        System.out.printf("MEDIA = %.2f",media);
        
        sc.close();
    }
}