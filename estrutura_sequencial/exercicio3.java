package estrutura_sequencial;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int a , b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor :");
        a = sc.nextInt();

        System.out.println("Digite o segundo valor :");
        b = sc.nextInt();

        if (a > b) {
            System.out.printf("%d é maior que %d", a, b);
        }else{
            System.out.printf("%d é maior que %d", b, a);
        }
    }
}
