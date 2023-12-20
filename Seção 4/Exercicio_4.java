import java.util.Locale;
import java.util.Scanner;
public class Exercicio_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numero, horasTrabalhadas;
        double salarioHora, salarioTotal;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        salarioHora = sc.nextDouble();
        salarioTotal = horasTrabalhadas * salarioHora;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f",numero,salarioTotal);
        sc.close();
    }
}
