package estrutura_sequencial;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        float total = 0, proximo, contador = 0;

        Scanner sc = new Scanner(System.in);

        while (contador < 50) {
            System.out.printf("Digite um valor para o cálculo : (%.0f / 50)\n", contador);
            proximo = sc.nextFloat();
            total = total + proximo;
            contador++;
        }

        total = total / 50;

        System.out.printf("A media da soma é de : %.2f", total);
    }
}
