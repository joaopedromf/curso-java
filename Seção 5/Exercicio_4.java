import java.util.Scanner;
public class Exercicio_4 {
    public static void main(String[] args) {
        int horaInicial, horaFinal, duracao;
        Scanner sc = new Scanner(System.in);
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        if(horaInicial >= horaFinal){
            duracao = 24 - horaInicial + horaFinal;
        }
        else{
            duracao = horaFinal-horaInicial;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)",duracao);
        sc.close();
    }
}