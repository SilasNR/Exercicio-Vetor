package estrutura_sequencial;

import java.util.*;

public class exercicio5 {
    public static void main(String[] args) {
        long a;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número :");
        a = sc.nextInt();

        if ((a % 2) == 0 ) {
            System.out.printf("O número %d é par !", a);
        }else{
            System.out.printf("O número %d é impar", a);
        }
    }
}