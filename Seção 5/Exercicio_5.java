import java.util.Scanner;
public class Exercicio_5 {
    public static void main(String[] args) {
        int codigo, qtd;
        double total;
        Scanner sc = new Scanner(System.in);
        codigo = sc.nextInt();
        qtd = sc.nextInt();
        if(codigo == 1){
            total = qtd * 4.0;
        }
        else if(codigo == 2){
            total = qtd * 4.5;
        }
        else if(codigo == 3){
            total = qtd * 5.0;
        }
        else if(codigo == 4){
            total = qtd * 2.0;
        }
        else{
            total = qtd * 1.5;
        }
        System.out.printf("Total: R$ %.2f",total);
        sc.close();
    }
}
