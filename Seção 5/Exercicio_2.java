import java.util.Scanner;
public class Exercicio_2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
        sc.close();
    }
}