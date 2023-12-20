import java.util.Scanner;
public class Exercicio_1 {
    public static void main(String[] args){
        int x, y, r;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        r = x + y;
        System.out.println("SOMA = " + r);
        sc.close();
    }
}
