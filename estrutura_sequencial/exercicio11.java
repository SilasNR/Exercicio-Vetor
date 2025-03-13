package estrutura_sequencial;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        float total = 0, proximo;

        Scanner sc = new Scanner(System.in);

        for(float i = 0; i < 50;i++){
            System.out.printf("Digite um valor para o cálculo : (%.0f / 50)\n",i);
            proximo = sc.nextFloat();
            total = total + proximo;
        }

        total = total / 50;

        System.out.printf("A media da soma é de : %.2f", total);
    }
}
