import java.util.Locale;
import java.util.Scanner;
public class Exercicio_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;
        double valorUnitarioPeca1, valorUnitarioPeca2, valorTotal;
        Scanner sc = new Scanner(System.in);
        codigoPeca1 = sc.nextInt();
        numeroPecas1 = sc.nextInt();
        valorUnitarioPeca1 = sc.nextDouble();
        codigoPeca2 = sc.nextInt();
        numeroPecas2 = sc.nextInt();
        valorUnitarioPeca2 = sc.nextDouble();
        valorTotal = numeroPecas1 * valorUnitarioPeca1 + numeroPecas2 * valorUnitarioPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f",valorTotal);
        sc.close();
    }
}