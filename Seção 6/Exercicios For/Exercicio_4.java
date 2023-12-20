import java.util.Locale;
import java.util.Scanner;
public class Exercicio_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            int numerador = sc.nextInt();
            int denominador = sc.nextInt();
            if(denominador == 0){
                System.out.println("divisao impossivel");
            }
            else{
                double divisao = (double) numerador / denominador;
                System.out.printf("%.1f\n",divisao);
            }
        }
        sc.close();
    }
}