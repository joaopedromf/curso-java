import java.util.Locale;
import java.util.Scanner;
public class Exercicio_6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        triangulo = (a*c)/2;
        circulo = 3.14159 * Math.pow(c,2);
        trapezio = ((a+b)*c)/2;
        quadrado = Math.pow(b,2);
        retangulo = a*b;
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f",triangulo,circulo,trapezio,quadrado,retangulo);
        sc.close();
    }
}
