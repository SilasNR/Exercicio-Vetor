package estrutura_sequencial;

import java.util.Scanner;

public class execericio4 {
    public static void main(String[] args) {
        int maior, proximo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro : ");
        maior = sc.nextInt();

        System.out.println("Digite o segundo valor inteiro : ");
        proximo = sc.nextInt();

        if (maior < proximo) {
            maior = proximo;
        }

        System.out.println("Digite o terceiro valor inteiro : ");
        proximo = sc.nextInt();

        if (maior < proximo) {
            maior = proximo;
        }

        System.out.println("Digite o quarto valor inteiro : ");
        proximo = sc.nextInt();

        if (maior < proximo) {
            maior = proximo;
        }

        System.out.printf("%d é o maior valor", maior);
    }
}
