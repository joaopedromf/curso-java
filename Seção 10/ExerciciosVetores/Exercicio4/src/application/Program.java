package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int even = 0;

        for(int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");
        for(int i=0; i<vect.length; i++){
            if(vect[i]%2 == 0){
                System.out.print(vect[i] + " ");
                even += 1;
            }
        }

        System.out.println("\n\nQUANTIDADE DE PARES = " + even);
        
        sc.close();
    }
}