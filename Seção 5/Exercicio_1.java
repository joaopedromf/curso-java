import java.util.Scanner;
public class Exercicio_1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n<0){
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("NAO NEGATIVO");
        }
        sc.close();
    }
}
