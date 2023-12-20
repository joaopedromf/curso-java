import java.util.Locale;
import java.util.Scanner;
public class Exercicio_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double raio, area, pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();
        area = pi * Math.pow(raio,2);
        System.out.printf("A = %.4f",area);
        sc.close();
    }
}
