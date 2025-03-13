package estrutura_sequencial;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        float valorKg, quantKg, valorTotal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do quilo(kg) do produto : R$");
        valorKg = sc.nextFloat();

        System.out.print("Digite a quantidade de quilos(kg) consumidas : R$");
        quantKg = sc.nextFloat();

        valorTotal = valorKg * quantKg;

        if (valorTotal < 0) {
            System.out.println("Valores não aceitos !");
        }else{
            System.out.printf("Valor do quilo(kg) do produto : R$%.2f\nQuantidade consumida do mesmo : %.2fkg\nValor total a ser pago : R$%.2f", valorKg,quantKg,valorTotal);
        }
    }
}
